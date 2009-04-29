/*
 * Copyright 2007-2008 the original author or authors.
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

package org.impalaframework.web.loader;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;
import static org.easymock.EasyMock.verify;

import javax.servlet.ServletContext;

import junit.framework.TestCase;

import org.impalaframework.exception.ConfigurationException;
import org.impalaframework.web.WebConstants;

public class ExternalModuleContextLoaderTest extends TestCase {

	private ExternalModuleContextLoader loader;

	private ServletContext servletContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		loader = new ExternalModuleContextLoader();
		servletContext = createMock(ServletContext.class);
		System.clearProperty(WebConstants.BOOTSTRAP_MODULES_RESOURCE_PARAM);

	}	
	
	public final void testResolutionStrategy() {
		expect(servletContext.getInitParameter(WebConstants.BOOTSTRAP_LOCATIONS_RESOURCE_PARAM)).andReturn(null);
		
		replay(servletContext);
		String[] locations = loader.getBootstrapContextLocations(servletContext);
		assertEquals(4, locations.length);
		assertEquals("META-INF/impala-bootstrap.xml", locations[0]);
		verify(servletContext);
	}

	public final void testNoParameterResourceSpecified() {
		expect(servletContext.getInitParameter(WebConstants.BOOTSTRAP_MODULES_RESOURCE_PARAM)).andReturn(null);

		replay(servletContext);
		try {
			loader.getModuleDefinitionSource(servletContext);
		}
		catch (ConfigurationException e) {
			assertEquals(
					"Module definition XML resource 'class path resource [moduledefinitions.xml]' does not exist",
					e.getMessage());
		}
		verify(servletContext);
	}

	public final void testResourceNotPresent() {
		expect(servletContext.getInitParameter(WebConstants.BOOTSTRAP_MODULES_RESOURCE_PARAM)).andReturn("notpresent");
		
		replay(servletContext);
		try {
			loader.getModuleDefinitionSource(servletContext);
		}
		catch (ConfigurationException e) {
			assertEquals("Module definition XML resource 'class path resource [notpresent]' does not exist", e.getMessage());
		}

		verify(servletContext);
	}

	public final void testGetModuleDefinition() {
		doSucceedingTest("xmlspec/webspec.xml");
		doSucceedingTest("classpath:xmlspec/webspec.xml");
	}

	private void doSucceedingTest(String resourceName) {
		expect(servletContext.getInitParameter(WebConstants.BOOTSTRAP_MODULES_RESOURCE_PARAM)).andReturn(resourceName);

		replay(servletContext);

		assertNotNull(loader.getModuleDefinitionSource(servletContext));

		verify(servletContext);
		reset(servletContext);
	}
}