/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.event;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.withSettings;

import org.junit.Test;
import org.mockito.Mockito;

/**
 */
public class EventBridgeTest {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testShutdown() throws Exception {
		EventSubject local = EventSubject.getSubject(EventBridgeTest.class, "testInstall");
		String external = "externalSubject";
		EventBridge bridge = mock(EventBridge.class,
				withSettings().useConstructor(local, external)
				.defaultAnswer(Mockito.CALLS_REAL_METHODS));
		DefaultEventManager manager = new DefaultEventManager();
		bridge.startup(manager, EventBridge.RECEIVE_LOCAL_EXTERNAL);
		bridge.shutdown();

		verify(bridge, times(1)).startupExternal();
		verify(bridge, times(1)).shutdownExternal();
	}
	
}
