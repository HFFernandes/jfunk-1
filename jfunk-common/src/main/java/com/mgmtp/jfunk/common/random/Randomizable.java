/*
 * Copyright (c) 2013 mgm technology partners GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mgmtp.jfunk.common.random;

/**
 * Interface for accessing a list of arbitrary elements randomly.
 * 
 */
public interface Randomizable<E> {

	/**
	 * Return the next randomly chosen element
	 */
	E get();

	/**
	 * Returns true if all included elements were returned at least once.
	 */
	boolean isAllHit();

	/**
	 * Reset to original state.
	 */
	void reset();

	/**
	 * Returns the number of handled elements.
	 */
	int size();
}