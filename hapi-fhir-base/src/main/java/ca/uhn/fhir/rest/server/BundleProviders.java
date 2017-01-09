package ca.uhn.fhir.rest.server;

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

import java.util.Collections;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.util.CoverageIgnore;

/**
 * Utility methods for working with {@link IBundleProvider}
 */
public class BundleProviders {

	/** Non instantiable */
	@CoverageIgnore
	private BundleProviders() {
		//nothing
	}

	/**
	 * Create a new unmodifiable empty resource list with the current time as the publish date.
	 */
	public static IBundleProvider newEmptyList() {
		final InstantDt published = InstantDt.withCurrentTime();
		return new IBundleProvider() {
			@Override
			public List<IBaseResource> getResources(int theFromIndex, int theToIndex) {
				return Collections.emptyList();
			}

			@Override
			public int size() {
				return 0;
			}

			@Override
			public InstantDt getPublished() {
				return published;
			}

			@Override
			public Integer preferredPageSize() {
				return null;
			}
		};
	}

	public static IBundleProvider newList(IBaseResource theResource) {
		return new SimpleBundleProvider(theResource);
	}

	public static IBundleProvider newList(List<IBaseResource> theResources) {
		return new SimpleBundleProvider(theResources);
	}
}
