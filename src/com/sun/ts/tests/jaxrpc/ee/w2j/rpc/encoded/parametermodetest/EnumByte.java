/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.1, build R5)
// Generated source version: 1.1.1

package com.sun.ts.tests.jaxrpc.ee.w2j.rpc.encoded.parametermodetest;

import java.util.Map;
import java.util.HashMap;

public class EnumByte {
  private byte value;

  private static Map valueMap = new HashMap();

  public static final byte _value1 = (byte) -128;

  public static final byte _value2 = (byte) 127;

  public static final EnumByte value1 = new EnumByte(_value1);

  public static final EnumByte value2 = new EnumByte(_value2);

  protected EnumByte(byte value) {
    this.value = value;
    valueMap.put(this.toString(), this);
  }

  public byte getValue() {
    return value;
  }

  public static EnumByte fromValue(byte value)
      throws java.lang.IllegalStateException {
    if (value1.value == value) {
      return value1;
    } else if (value2.value == value) {
      return value2;
    }
    throw new IllegalArgumentException();
  }

  public static EnumByte fromString(String value)
      throws java.lang.IllegalStateException {
    EnumByte ret = (EnumByte) valueMap.get(value);
    if (ret != null) {
      return ret;
    }
    if (value.equals("-128")) {
      return value1;
    } else if (value.equals("127")) {
      return value2;
    }
    throw new IllegalArgumentException();
  }

  public String toString() {
    return new Byte(value).toString();
  }

  private Object readResolve() throws java.io.ObjectStreamException {
    return fromValue(getValue());
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof EnumByte)) {
      return false;
    }
    return ((EnumByte) obj).value == value;
  }

  public int hashCode() {
    return new Byte(value).toString().hashCode();
  }
}