/*
 * Copyright 2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package www.george.com.unit.test.power.mock.domainmocking;

import www.george.com.unit.test.power.mock.domainmocking.domain.BusinessMessages;
import www.george.com.unit.test.power.mock.domainmocking.domain.Person;

/**
 * A simple interface that manages persons.
 */
public interface PersonService {

	/**
	 * Create a new person.
	 * 
	 * @param person
	 *            The person to create.
	 * @param messages
	 *            The business messages object to be filled with validation
	 *            errors.
	 */
	void create(Person person, BusinessMessages messages);

}
