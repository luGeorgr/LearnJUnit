package www.george.com.process.pipe;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author rouqiu
 *
 */

public class TestIn implements Runnable{

    private Process p = null;
    public TestIn(Process process){
        p = process;
    }

    @Override
    public void run() {
        while (true) {
            try {
                InputStream in = p.getInputStream();
                BufferedReader bfr = new BufferedReader(new InputStreamReader(in));
                String rd = bfr.readLine();
                if (rd != null) {
                    System.out.println(rd);//输出子进程返回信息(即子进程中的System.out.println()内容)
                }
                in.close();
//注意这个地方，如果关闭流则子进程的返回信息无法获取，如果不关闭只有当子进程返回字节为8192时才返回，为什么是8192下面说明.
//bfr.close();
//in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}