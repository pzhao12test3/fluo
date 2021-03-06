/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.fluo.api.client.scanner;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.fluo.api.data.Bytes;
import org.apache.fluo.api.data.ColumnValue;

/**
 * @since 1.0.0
 */
public interface ColumnScanner extends Iterable<ColumnValue> {

  /**
   * @since 1.0.0
   * @return the row for all column values
   */
  Bytes getRow();

  /**
   * @since 1.0.0
   * @return the row for all column values decoded as UTF-8
   */
  String getsRow();

  /**
   * @since 1.2.0
   */
  default Stream<ColumnValue> stream() {
    return StreamSupport.stream(spliterator(), false);
  }
}
