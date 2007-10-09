/*
 * Copyright 2006-2007 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.java.impala.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import net.java.impala.command.CommandStateTest;
import net.java.impala.command.CommandTest;
import net.java.impala.command.impl.AlternativeInputCommandTest;
import net.java.impala.command.impl.ClassFindCommandTest;
import net.java.impala.command.impl.ClassFindFileRecurseHandlerTest;
import net.java.impala.command.impl.SearchClassCommandTest;
import net.java.impala.testrun.DynamicContextHolderTest;
import net.java.impala.testrun.PluginTestRunnerTest;
import net.java.impala.testrun.TestClassLoaderTest;

public class AutomatedInteractiveTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		
		suite.addTestSuite(AlternativeInputCommandTest.class);
		suite.addTestSuite(ClassFindCommandTest.class);
		suite.addTestSuite(ClassFindFileRecurseHandlerTest.class);
		suite.addTestSuite(CommandTest.class);
		suite.addTestSuite(CommandStateTest.class);
		suite.addTestSuite(DynamicContextHolderTest.class);
		suite.addTestSuite(PluginTestRunnerTest.class);
		suite.addTestSuite(SearchClassCommandTest.class);
		suite.addTestSuite(TestClassLoaderTest.class);
		return suite;
	}
}
