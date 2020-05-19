/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
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

/*
 * @(#)URLClient.java	
 */

package com.sun.ts.tests.jsp.api.jakarta_el.elresolver;

import java.io.PrintWriter;
import com.sun.ts.lib.harness.EETest.Fault;
import com.sun.javatest.Status;
import com.sun.ts.tests.jsp.common.client.AbstractUrlClient;

// This class is called into from the jsp.  Importing it here
// forces ant to compile it and package it in the archive.
import com.sun.ts.tests.common.el.api.resolver.ResolverTest;

public class URLClient extends AbstractUrlClient {

  /**
   * Entry point for different-VM execution. It should delegate to method
   * run(String[], PrintWriter, PrintWriter), and this method should not contain
   * any test configuration.
   */
  public static void main(String[] args) {
    URLClient theTests = new URLClient();
    Status s = theTests.run(args, new PrintWriter(System.out),
        new PrintWriter(System.err));
    s.exit();
  }

  /**
   * Entry point for same-VM execution. In different-VM execution, the main
   * method delegates to this method.
   */
  public Status run(String args[], PrintWriter out, PrintWriter err) {

    setContextRoot("/jsp_elresolver_web");
    setTestJsp("ELResolverTest");

    return super.run(args, out, err);
  }

  /*
   * @class.setup_props: webServerHost; webServerPort; ts_home;
   */

  /* Run tests */

  // ============================================ Tests ======

  /*
   * @testName: elResolverTest
   * 
   * @assertion_ids: EL:JAVADOC:50; EL:JAVADOC:51; EL:JAVADOC:52; EL:JAVADOC:53;
   * EL:JAVADOC:54; EL:JAVADOC:55
   * 
   * @test_Strategy: Obtain an ELResolver via the PageContext and verify that
   * API calls work as expected: getValue() getType() setValue() isReadOnly()
   * getCommonPropertyType() getFeatureDescriptors()
   */
  public void elResolverTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "elResolverTest");
    invoke();
  }
}