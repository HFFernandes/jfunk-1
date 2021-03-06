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
package com.mgmtp.jfunk.server.domain;

import java.net.URI;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Pojo representing a file system item, which can be a Grovvy script or a directory.
 * 
 * @author rnaegele
 */
@XmlRootElement
public class FileSystemItem {

	private String name;
	private Date lastModified;
	private URI uri;

	public FileSystemItem() {
		this(null, null, null);
	}

	/**
	 * @param name
	 *            the name of the script
	 * @param lastModified
	 *            the last modification date of the script
	 * @param uri
	 *            the URI which the script can be reached under
	 */
	public FileSystemItem(final String name, final Date lastModified, final URI uri) {
		this.name = name;
		this.lastModified = lastModified;
		this.uri = uri;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified
	 *            the lastModified to set
	 */
	public void setLastModified(final Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the uri
	 */
	public URI getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(final URI uri) {
		this.uri = uri;
	}
}
