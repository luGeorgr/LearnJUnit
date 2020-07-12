package leetcode;

public class LeetCode1486 {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result = result ^(start + i * 2);
        }
        return result;
    }
}
