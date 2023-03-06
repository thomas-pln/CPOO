package org.person;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ PersonTest.class, PersonTestParameterized.class })
public class PersonAllTests {

}
