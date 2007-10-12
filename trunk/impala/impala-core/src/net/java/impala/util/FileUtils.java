/*
 * Copyright 2007 the original author or authors.
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

package net.java.impala.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

public class FileUtils {

	public static byte[] getBytes(File f) throws IOException {
		if (f == null)
			throw new IllegalArgumentException("File is null");

		if (!f.exists())
			throw new IllegalArgumentException("File " + f + " does not exist");

		return FileCopyUtils.copyToByteArray(f);
	}

	public static byte[] getBytes(Resource resource) throws IOException {
		InputStream inputStream = null;
		try {
			 inputStream = resource.getInputStream();
			return FileCopyUtils.copyToByteArray(inputStream);
		}
		finally {
			try {
				inputStream.close();
			}
			catch (Exception e) {
			}
		}
	}

}
