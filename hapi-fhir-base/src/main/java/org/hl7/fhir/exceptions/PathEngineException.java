package org.hl7.fhir.exceptions;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2017 University Health Network
 * %%
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
 * #L%
 */


public class PathEngineException extends FHIRException {

	public PathEngineException() {
		super();
	}

	public PathEngineException(String message, Throwable cause) {
		super(message, cause);
	}

	public PathEngineException(String message) {
		super(message);
	}

	public PathEngineException(Throwable cause) {
		super(cause);
	}

}
