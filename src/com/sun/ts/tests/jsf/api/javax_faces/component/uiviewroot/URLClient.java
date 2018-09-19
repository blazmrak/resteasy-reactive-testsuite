/*
 * Copyright (c) 2009, 2018 Oracle and/or its affiliates. All rights reserved.
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
 * $Id$
 */
package com.sun.ts.tests.jsf.api.javax_faces.component.uiviewroot;

import java.io.PrintWriter;

import com.sun.javatest.Status;
import com.sun.ts.lib.harness.EETest;
import com.sun.ts.tests.jsf.api.javax_faces.component.common.BaseUIComponentClient;

public class URLClient extends BaseUIComponentClient {

  private static final String CONTEXT_ROOT = "/jsf_comp_viewroot_web";

  public static void main(String[] args) {
    URLClient theTests = new URLClient();
    Status s = theTests.run(args, new PrintWriter(System.out),
        new PrintWriter(System.err));
    s.exit();
  }

  public Status run(String args[], PrintWriter out, PrintWriter err) {
    // don't reset the context root if already set
    if (getContextRoot() == null) {
      setContextRoot(CONTEXT_ROOT);
    }
    // don't reset the Servlet name if already set
    if (getServletName() == null) {
      setServletName(DEFAULT_SERVLET_NAME);
    }
    return super.run(args, out, err);
  }

  /*
   * @class.setup_props: webServerHost; webServerPort; ts_home;
   */

  // ------------------------------------------------------------- UIComponent
  /**
   * @testName: uiComponentEncodeBeginNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:488
   * @test_Strategy: Verify that the component doesn't delegate the
   *                 encodeBegin() call when the rendered property of the
   *                 component is false.
   */
  public void uiComponentEncodeBeginNotRenderedTest() throws EETest.Fault {
    super.uiComponentEncodeBeginNotRenderedTest();
  }

  /**
   * /**
   * 
   * @testName: uiComponentEncodeBeginTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:912
   * @test_Strategy: Verify that when encodeBegin() is called on the component
   *                 under test, it delegates this call to the encodeBegin()
   *                 method of the Renderer
   */
  public void uiComponentEncodeBeginTest() throws EETest.Fault {
    super.uiComponentEncodeBeginTest();
  }

  /**
   * @testName: uiComponentEncodeChildrenNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:914
   * @test_Strategy: Verify that the component doesn't delegate the
   *                 encodeChildren() call when the rendered property of the
   *                 component is false.
   */
  public void uiComponentEncodeChildrenNotRenderedTest() throws EETest.Fault {
    super.uiComponentEncodeChildrenNotRenderedTest();
  }

  /**
   * @testName: uiComponentEncodeChildrenTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:914
   * @test_Strategy: Verify that when encodeChildren() is called on the
   *                 component under test, it delegates this call to the
   *                 encodeChildren() method of the Renderer
   */
  public void uiComponentEncodeChildrenTest() throws EETest.Fault {
    super.uiComponentEncodeChildrenTest();
  }

  /**
   * @testName: uiComponentEncodeEndNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:916
   * @test_Strategy: Verify that the component doesn't delegate the encodeEnd()
   *                 call when the rendered property of the component is false.
   */
  public void uiComponentEncodeEndNotRenderedTest() throws EETest.Fault {
    super.uiComponentEncodeEndNotRenderedTest();
  }

  /**
   * @testName: uiComponentEncodeEndTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:916
   * @test_Strategy: Verify that when encodeEnd() is called on the component
   *                 under test, it delegates this call to the encodeEnd()
   *                 method of the Renderer
   */
  public void uiComponentEncodeEndTest() throws EETest.Fault {
    super.uiComponentEncodeEndTest();
  }

  /**
   * @testName: uiComponentEncodeAllNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:487
   * @test_Strategy: Verify that when encodeAll() is called passing null as the
   *                 context, a NullPointException is thrown.
   * 
   * @since 2.0
   */
  public void uiComponentEncodeAllNPETest() throws EETest.Fault {
    super.uiComponentEncodeAllNPETest();
  }

  /**
   * @testName: uiComponentEncodeBeginNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:490
   * @test_Strategy: Verify an NPE is thrown if the <code>context</code>
   *                 argument is null.
   */
  public void uiComponentEncodeBeginNPETest() throws EETest.Fault {
    super.uiComponentEncodeBeginNPETest();
  }

  /**
   * @testName: uiComponentEncodeChildrenNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:493
   * @test_Strategy: Verify an NPE is thrown if the <code>context</code>
   *                 argument is null.
   */
  public void uiComponentEncodeChildrenNPETest() throws EETest.Fault {
    super.uiComponentEncodeChildrenNPETest();
  }

  /**
   * @testName: uiComponentEncodeEndNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:496
   * @test_Strategy: Verify an NPE is thrown if the <code>context</code>
   *                 argument is null.
   */
  public void uiComponentEncodeEndNPETest() throws EETest.Fault {
    super.uiComponentEncodeEndNPETest();
  }

  /**
   * @testName: uiComponentFindComponentIAETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:498; JSF:JAVADOC:594
   * @test_Strategy: Verify an IllegalArgumentException is thrown by
   *                 findComponent when an intermediate identifier in a search
   *                 expression identifies a UIComponent that is not a
   *                 NamingContainer
   */
  public void uiComponentFindComponentIAETest() throws EETest.Fault {
    super.uiComponentFindComponentIAETest();
  }

  /**
   * @testName: uiComponentFindComponentNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:499
   * @test_Strategy: Verify a NullPointerException is thrown if expr is null.
   */
  public void uiComponentFindComponentNPETest() throws EETest.Fault {
    super.uiComponentFindComponentNPETest();
  }

  /**
   * @testName: uiComponentFindComponentTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:497; JSF:JAVADOC:593
   * @test_Strategy: Validate the behavior of findConponent(): - Identify the
   *                 UIComponent that will be the base for searching, by
   *                 stopping as soon as one of the following conditions is met:
   *                 o If the search expression begins with the the separator
   *                 character (called an "absolute" search expression), the
   *                 base will be the root UIComponent of the component tree.
   *                 The leading separator character will be stripped off, and
   *                 the remainder of the search expression will be treated as a
   *                 "relative" search expression as described below. o
   *                 Otherwise, if this UIComponent is a NamingContainer it will
   *                 serve as the basis. o Otherwise, search up the parents of
   *                 this component. If a NamingContainer is encountered, it
   *                 will be the base. o Otherwise (if no NamingContainer is
   *                 encountered) the root UIComponent will be the base. - The
   *                 search expression (possibly modified in the previous step)
   *                 is now a "relative" search expression that will be used to
   *                 locate the component (if any) that has an id that matches,
   *                 within the scope of the base component. The match is
   *                 performed as follows: o If the search expression is a
   *                 simple identifier, this value is compared to the id
   *                 property, and then recursively through the facets and
   *                 children of the base UIComponent (except that if a
   *                 descendant NamingContainer is found, its own facets and
   *                 children are not searched). o If the search expression
   *                 includes more than one identifier separated by the
   *                 separator character, the first identifier is used to locate
   *                 a NamingContainer by the rules in the previous bullet
   *                 point. Then, the findComponent() method of this
   *                 NamingContainer will be called, passing the remainder of
   *                 the search expression.
   */
  public void uiComponentFindComponentTest() throws EETest.Fault {
    super.uiComponentFindComponentTest();
  }

  /**
   * @testName: uiComponentGetAttributesTest
   * @assertion_ids: JSF:JAVADOC:596; JSF:JAVADOC:958; JSF:JAVADOC:500
   * @test_Strategy: Assert the following:
   *                 <ul>
   *                 <li>The <code>Map</code> implementation must implement the
   *                 <code>java.io.Serializable</code> interface.</li>
   *                 <li>Any attempt to add a <code>null</code> key or value
   *                 must throw a <code>NullPointerException</code>.</li>
   *                 <li>Any attempt to add a key that is not a String must
   *                 throw a <code>ClassCastException</code>.</li>
   *                 <li>If the attribute name specified as a key matches a
   *                 property of this {@link UIComponent}'s implementation
   *                 class, the following methods will have special behavior:
   *                 <ul>
   *                 <li><code>containsKey</code> - Return <code>false</code>.
   *                 </li>
   *                 <li><code>remove</code> - Throw
   *                 <code>IllegalArgumentException</code>.</li>
   *                 </ul>
   *                 </li>
   *                 </ul>
   * 
   */
  public void uiComponentGetAttributesTest() throws EETest.Fault {
    super.uiComponentGetAttributesTest();
  }

  /**
   * @testName: uiComponentGetChildCountTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:501
   * @test_Strategy: Validate getChildCount() returns the expected value.
   */
  public void uiComponentGetChildCountTest() throws EETest.Fault {
    super.uiComponentGetChildCountTest();
  }

  /**
   * @testName: uiComponentGetChildrenTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:502
   * @test_Strategy: Verify the following: * implementation must support all of
   *                 the standard and optional <code>List</code> methods, plus
   *                 support the following additional requirements:
   *                 </p>
   *                 <ul>
   *                 <li>The <code>List</code> implementation must implement the
   *                 <code>java.io.Serializable</code> interface.</li>
   *                 <li>Any attempt to add a <code>null</code> must throw a
   *                 NullPointerException</li>
   *                 <li>Any attempt to add an object that does not implement
   *                 {@link UIComponent} must throw a ClassCastException.</li>
   * 
   *                 <li>Any attempt to add a child {@link UIComponent} with a
   *                 non-null <code>componentId</code> that contains invalid
   *                 characters, or begins with
   *                 {@link NamingContainer#SEPARATOR_CHAR}, or
   *                 {@link UIViewRoot#UNIQUE_ID_PREFIX} (i.e. other than
   *                 letters, digits, '-', or '_') must throw
   *                 IllegalArgumentException.</li>
   * 
   *                 <li>Whenever a new child component is added:
   *                 <ul>
   *                 <li>The <code>parent</code> property of the child must be
   *                 set to this component instance.</li>
   *                 </ul>
   *                 </li>
   *                 <li>Whenever an existing child component is removed:
   *                 <ul>
   *                 <li>The <code>parent</code> property of the child must be
   *                 set to <code>null</code>.</li>
   *                 </ul>
   *                 </li>
   *                 </ul>
   */
  public void uiComponentGetChildrenTest() throws EETest.Fault {
    super.uiComponentGetChildrenTest();
  }

  /**
   * @testName: uiComponentGetClientIdNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:505
   * @test_Strategy: Verify getClientId() throws NPE if the <code>context</code>
   *                 argument is null.
   */
  public void uiComponentGetClientIdNPETest() throws EETest.Fault {
    super.uiComponentGetClientIdNPETest();
  }

  /**
   * @testName: uiComponentGetClientIdTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:503
   * @test_Strategy: Verify getClientId() returns a non-null value.
   */
  public void uiComponentGetClientIdTest() throws EETest.Fault {
    super.uiComponentGetClientIdTest();
  }

  /**
   * @testName: uiComponentGetClientIdContextTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:504
   * @test_Strategy: Verify getClientId() returns a non-null value.
   */
  public void uiComponentGetClientIdContextTest() throws EETest.Fault {
    super.uiComponentGetClientIdContextTest();
  }

  /**
   * @testName: uiComponentGetCurrentComponentTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:509
   * @test_Strategy: Verify getCurrentComponent() returns current component that
   *                 is processing.
   */
  public void uiComponentGetCurrentComponentTest() throws EETest.Fault {
    super.uiComponentGetCurrentComponentTest();
  }

  /**
   * @testName: uiComponentGetCurrentComponentNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:510
   * @test_Strategy: Verify getCurrentComponent(null) throws a
   *                 NullPointerException when arg "FacesContext" is null.
   */
  public void uiComponentGetCurrentComponentNPETest() throws EETest.Fault {
    super.uiComponentGetCurrentComponentNPETest();
  }

  /**
   * @testName: uiComponentGetCurrentComponentNullTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:509
   * @test_Strategy: Verify getCurrentComponent() returns null return null if
   *                 there is no currently processing UIComponent
   */
  public void uiComponentGetCurrentComponentNullTest() throws EETest.Fault {
    super.uiComponentGetCurrentComponentNullTest();
  }

  /**
   * @testName: uiComponentGetCurrentCompositeComponentNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:512
   * @test_Strategy: Verify getCurrentCompositeComponent(null) throws a
   *                 NullPointerException when arg "FacesContext" is null.
   */
  public void uiComponentGetCurrentCompositeComponentNPETest()
      throws EETest.Fault {
    super.uiComponentGetCurrentCompositeComponentNPETest();
  }

  /**
   * @testName: uiComponentGetCurrentCompositeComponentNullTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:511
   * @test_Strategy: Verify getCurrentCompositeComponent() returns null return
   *                 null if there is no currently processing UIComponent
   */
  public void uiComponentGetCurrentCompositeComponentNullTest()
      throws EETest.Fault {
    super.uiComponentGetCurrentCompositeComponentNullTest();
  }

  /**
   * @testName: uiComponentIsCompositeComponentNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:535
   * @test_Strategy: Verify isCompositeComponent(null) throws a
   *                 NullPointerException when arg "FacesContext" is null.
   */
  public void uiComponentIsCompositeComponentNPETest() throws EETest.Fault {
    super.uiComponentIsCompositeComponentNPETest();
  }

  /**
   * @testName: uiComponentIsCompositeComponentNegTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:534
   * @test_Strategy: Verify isCompositeComponent() returns false return null if
   *                 there is no currently processing UIComponent
   */
  public void uiComponentIsCompositeComponentNegTest() throws EETest.Fault {
    super.uiComponentIsCompositeComponentNegTest();
  }

  /**
   * @testName: uiComponentGetFacetsAndChildrenTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:516
   * @test_Strategy: Ensure the Iterator returned has the expected values, and
   *                 in the case of the UIComponent instances contained in the
   *                 iterator, ensure the order is correct.
   */
  public void uiComponentGetFacetsAndChildrenTest() throws EETest.Fault {
    super.uiComponentGetFacetsAndChildrenTest();
  }

  /**
   * @testName: uiComponentGetFacetsTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:515
   * @test_Strategy: Assert the following: The returned implementation must
   *                 support all of the standard and optional <code>Map</code>
   *                 methods, plus support the following additional
   *                 requirements:
   *                 </p>
   *                 <ul>
   *                 <li>The <code>Map</code> implementation must implement the
   *                 <code>java.io.Serializable</code> interface.</li>
   *                 <li>Any attempt to add a <code>null</code> key or value
   *                 must throw a NullPointerException.</li>
   *                 <li>Any attempt to add a key that is not a String must
   *                 throw a ClassCastException.</li>
   *                 <li>Any attempt to add a value that is not a
   *                 {@link UIComponent} must throw a ClassCastException.</li>
   *                 <li>Whenever a new facet {@link UIComponent} is added:
   *                 <ul>
   *                 <li>The <code>parent</code> property of the component must
   *                 be set to this component instance.</li>
   *                 </ul>
   *                 </li>
   *                 <li>Whenever an existing facet {@link UIComponent} is
   *                 removed:
   *                 <ul>
   *                 <li>The <code>parent</code> property of the facet must be
   *                 set to <code>null</code>.</li>
   *                 </ul>
   *                 </li>
   *                 </ul>
   */
  public void uiComponentGetFacetsTest() throws EETest.Fault {
    super.uiComponentGetFacetsTest();
  }

  /**
   * @testName: uiComponentGetFacetTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:513
   * @test_Strategy: Ensure a facet of a component can be obtained by name.
   */
  public void uiComponentGetFacetTest() throws EETest.Fault {
    super.uiComponentGetFacetTest();
  }

  /**
   * @testName: uiComponentGetFacetCountTest
   * @assertion_ids: JSF:JAVADOC:513; JSF:JAVADOC:514; JSF:JAVADOC:605
   * @test_Strategy: Validate that we receive 1 or more facets.
   */
  public void uiComponentGetFacetCountTest() throws EETest.Fault {
    super.uiComponentGetFacetCountTest();
  }

  /**
   * @testName: uiComponentGetFamilyTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:517; JSF:JAVADOC:922
   * @test_Strategy: Ensure we receive the correct component family.
   */
  public void uiComponentGetFamilyTest() throws EETest.Fault {
    super.uiComponentGetFamilyTest();
  }

  /**
   * @testName: uiComponentGetRendersChildrenTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:524; JSF:JAVADOC:926
   * @test_Strategy: Verify getRendersChildren() returns the expected value by
   *                 obtaining this components Renderer and calling
   *                 getRendersChildren() in the Renderer, and comparing that
   *                 value with what is returned by calling getRendersChildren()
   *                 on the component.
   */
  public void uiComponentGetRendersChildrenTest() throws EETest.Fault {
    super.uiComponentGetRendersChildrenTest();
  }

  /**
   * @testName: uiComponentGetSetIdTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:518;JSF:JAVADOC:558
   * @test_Strategy: Verify {get,set}Id() - if a value is set, the same value is
   *                 returned.
   */
  public void uiComponentGetSetIdTest() throws EETest.Fault {
    super.uiComponentGetSetIdTest();
  }

  /**
   * @testName: uiComponentGetSetParentTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:522;JSF:JAVADOC:561
   * @test_Strategy: Verify {get,set}Parent() - if a value is set, the same
   *                 value is returned.
   */
  public void uiComponentGetSetParentTest() throws EETest.Fault {
    super.uiComponentGetSetParentTest();
  }

  /**
   * @testName: uiComponentQueueEventNPETest
   * @assertion_ids: JSF:JAVADOC:561; JSF:JAVADOC:632; JSF:JAVADOC:557
   * @test_Strategy: Validate that a NullPointerException is thrown when arg is
   *                 null.
   */
  public void uiComponentQueueEventNPETest() throws EETest.Fault {
    super.uiComponentQueueEventNPETest();
  }

  /**
   * @testName: uiComponentRestoreAttachedStateNPETest
   * @assertion_ids: JSF:JAVADOC:550; JSF:JAVADOC:635
   * @test_Strategy: Validate a NullPointerException is thrown if context is
   *                 null.
   * 
   */
  public void uiComponentRestoreAttachedStateNPETest() throws Fault {
    super.uiComponentRestoreAttachedStateNPETest();
  }

  /**
   * @testName: uiComponentSaveAttachedStateNPETest
   * @assertion_ids: JSF:JAVADOC:550; JSF:JAVADOC:638
   * @test_Strategy: Validate a NullPointerException is thrown if context is
   *                 null.
   * 
   */
  public void uiComponentSaveAttachedStateNPETest() throws Fault {
    super.uiComponentSaveAttachedStateNPETest();
  }

  /**
   * @testName: uiComponentGetSetRendererTypeTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:523;JSF:JAVADOC:563
   * @test_Strategy: Verify {get,set}Parent() - if a value is set, the same
   *                 value is returned. Also verify that the default return
   *                 value. If a component is specified as having a specific
   *                 Renderer type, ensure that value is returned, otherwise
   *                 ensure that null is returned.
   */
  public void uiComponentGetSetRendererTypeTest() throws EETest.Fault {
    super.uiComponentGetSetRendererTypeTest();
  }

  /**
   * @testName: uiComponentInvokeOnComponentTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:531
   * @test_Strategy: Validate the behavior of InvokeOnComponent():
   */
  public void uiComponentInvokeOnComponentTest() throws EETest.Fault {
    super.uiComponentInvokeOnComponentTest();
  }

  /**
   * @testName: uiComponentInvokeOnComponentNegativeTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:531; JSF:JAVADOC:532;
   *                 JSF:JAVADOC:533; JSF:JAVADOC:615; JSF:JAVADOC:616
   * @test_Strategy: Validate the negative behavior of InvokeOnComponent():
   */
  public void uiComponentInvokeOnComponentNegativeTest() throws EETest.Fault {
    super.uiComponentInvokeOnComponentNegativeTest();
  }

  /**
   * @testName: uiComponentIsSetRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:537; JSF:JAVADOC:562
   * @test_Strategy: Verify {is,set}Rendered() - if a value is set, the same
   *                 value is returned.
   */
  public void uiComponentIsSetRenderedTest() throws EETest.Fault {
    super.uiComponentIsSetRenderedTest();
  }

  /**
   * @testName: uiComponentProcessDecodesNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:541; JSF:JAVADOC:935
   * @test_Strategy: Assert the following when processDecodes() is called and
   *                 the component's rendered property is false: - If the
   *                 rendered property of this UIComponent is false, skip
   *                 further processing.
   */
  public void uiComponentProcessDecodesNotRenderedTest() throws EETest.Fault {
    super.uiComponentProcessDecodesNotRenderedTest();
  }

  /**
   * @testName: uiComponentProcessDecodesRenderResponseTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:541
   * @test_Strategy: Assert renderResponse() is called if a RuntimeException is
   *                 thrown when calling decode() on a particular component.
   */
  public void uiComponentProcessDecodesRenderResponseTest()
      throws EETest.Fault {
    super.uiComponentProcessDecodesRenderResponseTest();
  }

  /**
   * @testName: uiComponentProcessDecodesTest
   * @assertion_ids: JSF:JAVADOC:582; JSF:JAVADOC:958; JSF:JAVADOC:541
   * @test_Strategy: Assert the following when processDecodes is called: # Call
   *                 the processDecodes() method of all facets and children of
   *                 this UIComponent. # Call the decode() method of this
   *                 component, if this component's rendered property is true
   *                 and it is not nested in a parent component whose
   *                 rendersChildren property is true but whose rendered
   *                 property is false.
   */
  public void uiComponentProcessDecodesTest() throws EETest.Fault {
    super.uiComponentProcessDecodesTest();
  }

  /**
   * @testName: uiComponentProcessDecodesNPETest
   * @assertion_ids: JSF:JAVADOC:542; JSF:JAVADOC:621
   * @test_Strategy: Validate a NullPointerException is thrown when arg is null.
   */
  public void uiComponentProcessDecodesNPETest() throws EETest.Fault {
    super.uiComponentProcessDecodesNPETest();
  }

  /**
   * @testName: uiComponentProcessSaveRestoreStateTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:545;JSF:JAVADOC:547
   * @test_Strategy: Assert the following when process{Save,Restore}State() is
   *                 called: - Call the process{Save,Restore}State() method of
   *                 all facets and children of this UIComponent in the order
   *                 determined by a call to getFacetsAndChildren(). - Call the
   *                 {save,restore}State() method of this component.
   */
  public void uiComponentProcessSaveRestoreStateTest() throws EETest.Fault {
    super.uiComponentProcessSaveRestoreStateTest();
  }

  /**
   * @testName: uiComponentProcessSaveStateNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:548
   * @test_Strategy: Validate that a NullPointerException is thrown when context
   *                 is null.
   */
  public void uiComponentProcessSaveStateNPETest() throws EETest.Fault {
    super.uiComponentProcessSaveStateNPETest();
  }

  /**
   * @testName: uiComponentProcessRestoreStateNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:546
   * @test_Strategy: Validate that a NullPointerException is thrown when context
   *                 is null.
   */
  public void uiComponentProcessRestoreStateNPETest() throws EETest.Fault {
    super.uiComponentProcessRestoreStateNPETest();
  }

  /**
   * @testName: uiComponentProcessSaveStateTransientTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:545;JSF:JAVADOC:547
   * @test_Strategy: Verify that when a component is marked transient, that
   *                 saveState() is not called, nor is
   *                 processSaveState()/saveState() is called on any children of
   *                 the transient component.
   */
  public void uiComponentProcessSaveStateTransientTest() throws EETest.Fault {
    super.uiComponentProcessSaveStateTransientTest();
  }

  /**
   * @testName: uiComponentProcessUpdatesNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:549; JSF:JAVADOC:938
   * @test_Strategy: Assert the following when processUpdates() is called and
   *                 the component's rendered property is false: - If the
   *                 rendered property of this UIComponent is false, skip
   *                 further processing.
   */
  public void uiComponentProcessUpdatesNotRenderedTest() throws EETest.Fault {
    super.uiComponentProcessUpdatesNotRenderedTest();
  }

  /**
   * @testName: uiComponentProcessUpdatesRenderResponseTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:549
   * @test_Strategy: Assert the following when calling processUpdates() and a
   *                 component is marked as invalid: If the valid property of
   *                 this UIComponent is now false, call
   *                 FacesContext.renderResponse() to transfer control at the
   *                 end of the current phase.
   */
  public void uiComponentProcessUpdatesRenderResponseTest()
      throws EETest.Fault {
    super.uiComponentProcessUpdatesRenderResponseTest();
  }

  /**
   * @testName: uiComponentProcessUpdatesTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:549; JSF:JAVADOC:763
   * @test_Strategy: Assert the following when processUpdates() is called: #
   *                 Call the processUpdates() method of all facets and children
   *                 of this UIComponent. # If the current component is an
   *                 UIInput, call its updateModel() method of this component,
   *                 if this component's rendered property is true and it is not
   *                 nested in a parent component whose rendersChildren property
   *                 is true but whose rendered property is false.
   */
  public void uiComponentProcessUpdatesTest() throws EETest.Fault {
    super.uiComponentProcessUpdatesTest();
  }

  /**
   * @testName: uiComponentProcessUpdatesNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:550
   * @test_Strategy: Validate a NullPointerException is thrown if context is
   *                 null.
   * 
   * @since 2.0
   */
  public void uiComponentProcessUpdatesNPETest() throws EETest.Fault {
    super.uiComponentProcessUpdatesNPETest();
  }

  /**
   * @testName: uiComponentProcessValidatorsIsValidRenderResponseTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:628
   * @test_Strategy: Assert the following when processValidators() is called and
   *                 the component has been marked invalid: - If the isValid()
   *                 method of this component returns false, call the
   *                 renderResponse() method on the FacesContext instance for
   *                 this request.
   */
  public void uiComponentProcessValidatorsIsValidRenderResponseTest()
      throws EETest.Fault {
    super.uiComponentProcessValidatorsIsValidRenderResponseTest();
  }

  /**
   * @testName: uiComponentProcessValidatorsNotRenderedTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:628
   * @test_Strategy: Assert the following when processValidators() is called and
   *                 the component's rendered property is false: - If the
   *                 rendered property of this UIComponent is false, skip
   *                 further processing.
   */
  public void uiComponentProcessValidatorsNotRenderedTest()
      throws EETest.Fault {
    super.uiComponentProcessValidatorsNotRenderedTest();
  }

  /**
   * @testName: uiComponentProcessValidatorsRenderResponseTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:628
   * @test_Strategy: Assert renderResponse() is called if a RuntimeException is
   *                 thrown when calling validate() on a particular component.
   */
  public void uiComponentProcessValidatorsRenderResponseTest()
      throws EETest.Fault {
    super.uiComponentProcessValidatorsRenderResponseTest();
  }

  /**
   * @testName: uiComponentProcessValidatorsTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:628; JSF:JAVADOC:940
   * @test_Strategy: Assert the following when processValidators() is called: #
   *                 Call the processValidators() method of all facets and
   *                 children of this UIComponent. # If the current component is
   *                 an UIInput, call its validate() method, if this component's
   *                 rendered property is true and it is not nested in a parent
   *                 component whose rendersChildren property is true but whose
   *                 rendered property is false.
   */
  public void uiComponentProcessValidatorsTest() throws EETest.Fault {
    super.uiComponentProcessValidatorsTest();
  }

  /**
   * @testName: uiComponentProcessValidatorsNPETest
   * @assertion_ids: JSF:JAVADOC:552; JSF:JAVADOC:629; JSF:JAVADOC:941
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 argument is null.
   */

  public void uiComponentProcessValidatorsNPETest() throws EETest.Fault {
    super.uiComponentProcessValidatorsNPETest();
  }

  /**
   * @testName: uiComponentPushComponentToELTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:553
   * @test_Strategy: Assert that a call to pushComponentToEL does put a
   *                 UIComponent onto the EL stack, and that another call to the
   *                 method causes the newly added component to be the current
   *                 component.
   */
  public void uiComponentPushComponentToELTest() throws EETest.Fault {
    super.uiComponentPushComponentToELTest();
  }

  /**
   * @testName: uiComponentPushComponentToELNPETest
   * @assertion_ids: JSF:JAVADOC:554
   * @test_Strategy: Validate hat a NullPointerException is thrown when
   *                 FacesContext is null.
   */
  public void uiComponentPushComponentToELNPETest() throws EETest.Fault {
    super.uiComponentPushComponentToELNPETest();
  }

  /**
   * @testName: uiComponentPopComponentFromELTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:539
   * @test_Strategy: Assert that a call to popComponentToEL removes "this"
   *                 component as being the current component and that the
   *                 previous UIComponent is set to the current component being
   *                 processed.
   */
  public void uiComponentPopComponentFromELTest() throws EETest.Fault {
    super.uiComponentPopComponentFromELTest();
  }

  /**
   * @testName: uiComponentPopComponentFromELNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:539
   * @test_Strategy: Assert that a call to popComponentToEL removes "this"
   *                 component as being the current component and that the
   *                 previous UIComponent is set to the current component being
   *                 processed.
   */
  public void uiComponentPopComponentFromELNPETest() throws EETest.Fault {
    super.uiComponentPopComponentFromELNPETest();
  }

  /**
   * @testName: uiComponentSetIdRestrictionsTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:640; JSF:JAVADOC:559
   * @test_Strategy: Verify that component under test enforces the component ID
   *                 restrictions as specified: # Must not be a zero-length
   *                 String. # First character must be a letter or an underscore
   *                 ('_'). # Subsequent characters must be a letter, a digit,
   *                 an underscore ('_'), or a dash ('-').
   */
  public void uiComponentSetIdRestrictionsTest() throws EETest.Fault {
    super.uiComponentSetIdRestrictionsTest();
  }

  /**
   * @testName: uiComponentGetSetValueExpressionTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:567;JSF:JAVADOC:528
   * @test_Strategy: Verify the following: - setValueExpression with a
   *                 non-literal ValueExpression results in getValueExpression()
   *                 returning the non-literal ValueExpression -
   *                 setValueExpression with a literal ValueExpression results
   *                 in getValueExpression returning null for that particular
   *                 key and the evaluated value of the ValueExpression is
   *                 stored in the component's attribute map. - Providing a null
   *                 value for the ValueExpression argument of -
   *                 setValueExpression() where a ValueExpression has already
   *                 been stored using the same key, will result in the
   *                 ValueExpression being removed from its internal collection
   *                 - this is verified by calling getValueExpression() and
   *                 ensuring a null return
   * @since 1.2
   */
  public void uiComponentGetSetValueExpressionTest() throws Fault {
    super.uiComponentGetSetValueExpressionTest();
  }

  /**
   * @testName: uiComponentGetSetValueExpressionNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:529
   * @test_Strategy: Verify an NPE is thrown if a null value for the 'name'
   *                 argument is passed to getValueExpression().
   * @since 1.2
   */
  public void uiComponentGetSetValueExpressionNPETest() throws Fault {
    super.uiComponentGetSetValueExpressionNPETest();
  }

  /**
   * @testName: uiComponentSetValueExpressionNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:569
   * @test_Strategy: Verify an NPE is thrown if a null value for the 'name'
   *                 argument is passed to setValueExpression().
   * @since 1.2
   */
  public void uiComponentSetValueExpressionNPETest() throws Fault {
    super.uiComponentSetValueExpressionNPETest();
  }

  /**
   * @testName: uiComponentSetValueExpressionIAETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:568
   * @test_Strategy: Verify an IAE is thrown if a null value for the 'name'
   *                 argument is 'id' or 'parent' setValueExpression().
   * @since 1.2
   */
  public void uiComponentSetValueExpressionIAETest() throws Fault {
    super.uiComponentSetValueExpressionIAETest();
  }

  /**
   * @testName: uiComponentSubscribeToEventTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:570
   * @test_Strategy: Ensure UIComponent.subscribeToEvent Does not throw any
   *                 Exceptions when called correctly.
   * 
   *                 Test case(s): UIComponent.subscribeToEvent(SystemEvent,
   *                 ComponentSystemEventlistener)
   * @since 2.0
   */
  public void uiComponentSubscribeToEventTest() throws EETest.Fault {
    super.uiComponentSubscribeToEventTest();
  }

  /**
   * @testName: uiComponentSubscribeToEventNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:2547
   * @test_Strategy: Ensure UIComponent.uiComponentSubscribeToEventNPETest
   *                 throws a NullPointerException in the following test cases:
   * 
   *                 Test cases: UIComponent.subscribeToEvent(null,
   *                 ComponentSystemEventlistener)
   *                 UIComponent.subscribeToEvent(SystemEvent, null)
   * @since 2.0
   */
  public void uiComponentSubscribeToEventNPETest() throws EETest.Fault {
    super.uiComponentSubscribeToEventNPETest();
  }

  /**
   * @testName: uiComponentVisitTreeTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:575
   * @test_Strategy: Verify that we receive false when calling
   *                 UIComponent.visitTree().
   * @since 2.0
   */
  public void uiComponentVisitTreeTest() throws Fault {
    super.uiComponentVisitTreeTest();
  }

  /**
   * @testName: uiComponentVisitTreeNegTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:575
   * @test_Strategy: Verify that we receive false when calling
   *                 UIComponent.visitTree().
   * @since 2.0
   */
  public void uiComponentVisitTreeNegTest() throws Fault {
    super.uiComponentVisitTreeNegTest();
  }

  // -------------------------------------------------------- UIViewRoot
  /**
   * @testName: uiViewRootaddComponentResourceFCTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:906; JSF:JAVADOC:907;
   *                 JSF:JAVADOC:920
   * @test_Strategy: Verify that UIViewRoot.addComponentResource, renders a
   *                 UIOutput Component to the 'head'(default location) and that
   *                 the test value returned from UIOutput.getValue() is
   *                 correct.
   * 
   *                 Tested Method:
   *                 UIViewRoot.addComponentResource(FacesContext, UIComponent)
   *                 UIViewRoot.getComponentResources(FacesContext, String)
   * 
   * @since 2.0
   */
  public void uiViewRootaddComponentResourceFCTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootaddComponentResourceFCTest");
    invoke();
  }

  /**
   * @testName: uiViewRootaddComponentResourceFCTTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:906; JSF:JAVADOC:907;
   *                 JSF:JAVADOC:920
   * @test_Strategy: Verify that UIViewRoot.addComponentResource, renders a
   *                 UIOutput Component to the 'body'(specified location) and
   *                 that the test value returned from UIOutput.getValue() is
   *                 correct.
   * 
   *                 Tested Method:
   *                 UIViewRoot.addComponentResource(FacesContext, UIComponent,
   *                 String) UIViewRoot.getComponentResources(FacesContext,
   *                 String)
   * 
   * @since 2.0
   */
  public void uiViewRootaddComponentResourceFCTTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootaddComponentResourceFCTTest");
    invoke();
  }

  /**
   * @testName: uiViewRootaddComponentResourceComponentTargetTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:906; JSF:JAVADOC:907
   * @test_Strategy: Verify that UIViewRoot.addComponentResource, renders a
   *                 UIOutput Component to the 'body'(specified by the
   *                 component) and that the test value returned from
   *                 UIOutput.getValue() is correct.
   * 
   *                 Tested Method:
   *                 UIViewRoot.addComponentResource(FacesContext, UIComponent,
   *                 null) UIViewRoot.getComponentResources(FacesContext,
   *                 String)
   * 
   * @since 2.0
   */
  public void uiViewRootaddComponentResourceComponentTargetTest() throws Fault {
    TEST_PROPS.setProperty(APITEST,
        "uiViewRootaddComponentResourceComponentTargetTest");
    invoke();
  }

  /**
   * @testName: uiViewRootgetComponentResourcesNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:921
   * @test_Strategy: Verify that UIViewRoot.getComponentResources, throws a
   *                 NullPointerException if the 'target' argument is null.
   * 
   *                 Tested Method:
   *                 UIViewRoot.getComponentResources(FacesContext, null)
   * 
   * @since 2.0
   */
  public void uiViewRootgetComponentResourcesNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootgetComponentResourcesNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootaddComponentResourceComponentNegTargetTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:906; JSF:JAVADOC:907
   * @test_Strategy: Verify that when a target is given at the UIComponent and
   *                 the UIViewRoot.addComponent() level that the latter takes
   *                 president
   * 
   * @since 2.0
   */
  public void uiViewRootaddComponentResourceComponentNegTargetTest()
      throws Fault {
    TEST_PROPS.setProperty(APITEST,
        "uiViewRootaddComponentResourceComponentNegTargetTest");
    invoke();
  }

  /**
   * @testName: uiViewRootremoveComponentResourceTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:946
   * @test_Strategy: Verify that a given resource from the view.
   * 
   *                 Tested Method:
   *                 UIViewRoot.removeComponentResource(FacesContext,
   *                 UIComponent)
   * 
   * @since 2.0
   */
  public void uiViewRootremoveComponentResourceTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootremoveComponentResourceTest");
    invoke();
  }

  /**
   * @testName: uiViewRootremoveComponentResourceNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:945
   * @test_Strategy:
   * 
   *                 Tested Method:
   *                 UIViewRoot.removeComponentResource(FacesContext, null)
   * @since 2.0
   */
  public void uiViewRootremoveComponentResourceNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootremoveComponentResourceNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootIsInViewTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932
   * @test_Strategy: Verify isInView() Returns true if the component is in the
   *                 current view.
   * 
   * @since 2.0
   */
  public void uiViewRootIsInViewTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootIsInViewTest");
    invoke();
  }

  /**
   * @testName: uiViewRootAddGetPhaseListenersTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:908;
   *                 JSF:JAVADOC:924
   * @test_Strategy: Verify that we can add a PhaseListener and that that
   *                 PhaseListener is in the List returned from
   *                 getPhaseListeners().
   * 
   * @since 1.2
   */
  public void uiViewRootAddGetPhaseListenersTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootAddGetPhaseListenersTest");
    invoke();
  }

  /**
   * @testName: uiViewRootIsInViewNegTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932
   * @test_Strategy: Verify isInView() Returns true if the component is in the
   *                 current view.
   * 
   * @since 2.0
   */
  public void uiViewRootIsInViewNegTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootIsInViewNegTest");
    invoke();
  }

  /**
   * @testName: uiViewRootSetGetViewIdTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:927;
   *                 JSF:JAVADOC:955
   * @test_Strategy: Verify that we can set the ViewId and that we get the
   *                 correct Id back.
   * 
   */
  public void uiViewRootSetGetViewIdTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootSetGetViewIdTest");
    invoke();
  }

  /**
   * @testName: uiViewRootUnsubscribeFromViewEventNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:960
   * @test_Strategy: Verify that we get a NullPointerException if
   *                 systemEventClass or listener are null.
   * 
   */
  public void uiViewRootUnsubscribeFromViewEventNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST,
        "uiViewRootUnsubscribeFromViewEventNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootSubscribeToViewEventNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:957
   * @test_Strategy: Verify that we get a NullPointerException if
   *                 systemEventClass or listener are null.
   * 
   */
  public void uiViewRootSubscribeToViewEventNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootSubscribeToViewEventNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootSubscribeToViewEventTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:951; JSF:JAVADOC:956;
   *                 JSF:JAVADOC:928
   * @test_Strategy: Verify that we can add SystemEventListener to the View and
   *                 remove it from the view as well.
   * 
   *                 UIViewRoot.subscribeToViewEvent (Class ,
   *                 SystemEventListener)
   *                 UIViewRoot.unsubscribeFromViewEvent(Class,
   *                 SystemEventListener)
   *                 UIViewRoot.getViewListenersForEventClass(Class)
   * 
   */
  public void uiViewRootSubscribeToViewEventTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootSubscribeToViewEventTest");
    invoke();
  }

  /**
   * @testName: uiViewRootCreateUniqueIDTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:910;
   *                 JSF:JAVADOC:911
   * @test_Strategy: Validate that we are able to create a unique ID with a
   *                 given seed.
   * 
   */
  public void uiViewRootCreateUniqueIDTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootCreateUniqueIDTest");
    invoke();
  }

  /**
   * @testName: uiViewRootSetGetLocaleTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:923;
   *                 JSF:JAVADOC:953
   * @test_Strategy: Validate that we are able to set and get a given Locale.
   * 
   */
  public void uiViewRootSetGetLocaleTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootSetGetLocaleTest");
    invoke();
  }

  /**
   * @testName: uiViewRootSetGetRenderKitIdTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:932; JSF:JAVADOC:925;
   *                 JSF:JAVADOC:954
   * @test_Strategy: Validate that we are able to set and get a RenderKitId.
   * 
   */
  public void uiViewRootSetGetRenderKitIdTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootSetGetRenderKitIdTest");
    invoke();
  }

  /**
   * @testName: uiViewRootGetViewListenersForEventClassNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:929
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 SystemEven is null.
   * 
   */
  public void uiViewRootGetViewListenersForEventClassNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST,
        "uiViewRootGetViewListenersForEventClassNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootProcessApplicationNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:934
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 FacesContext is null.
   * 
   */
  public void uiViewRootProcessApplicationNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootProcessApplicationNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootProcessDecodesNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:936
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 FacesContext is null.
   * 
   */
  public void uiViewRootProcessDecodesNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootProcessDecodesNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootProcessUpdatesNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:939
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 FacesContext is null.
   * 
   */
  public void uiViewRootProcessUpdatesNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootProcessUpdatesNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootQueueEventNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:944
   * @test_Strategy: Validate that a NullPointerException is thrown when
   *                 FacesContext is null.
   * 
   */
  public void uiViewRootQueueEventNPETest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootQueueEventNPETest");
    invoke();
  }

  /**
   * @testName: uiViewRootGetSetBeforePhaseListenerTest
   * 
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:919; JSF:JAVADOC:951
   * 
   * @test_Strategy: Validate that we can set an arbitrary method to be called
   *                 for the "beforePhase" event as the UIViewRoot runs through
   *                 its lifecycle.
   * 
   *                 UIViewRoot.getBeforePhaseListener
   *                 UIViewRoot.setBeforePhaseListener(MethodExpression)
   */
  public void uiViewRootGetSetBeforePhaseListenerTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootGetSetBeforePhaseListenerTest");
    invoke();
  }

  /**
   * @testName: uiViewRootGetSetAfterPhaseListenerTest
   * 
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:918; JSF:JAVADOC:950
   * 
   * @test_Strategy: Validate that we can set an arbitrary method to be called
   *                 for the "afterPhase" event as the UIViewRoot runs through
   *                 its lifecycle.
   * 
   *                 UIViewRoot.getAfterPhaseListener
   *                 UIViewRoot.setAfterPhaseListener(MethodExpression)
   */
  public void uiViewRootGetSetAfterPhaseListenerTest() throws Fault {
    TEST_PROPS.setProperty(APITEST, "uiViewRootGetSetAfterPhaseListenerTest");
    invoke();
  }

  // ---------------------------------------------------------- StateHolder
  /**
   * @testName: stateHolderSaveRestoreStateTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:443; JSF:JAVADOC:948;
   *                 JSF:JAVADOC:949
   * @test_Strategy: Verify saveState returns a serialized object of the
   *                 component's current state and that this state can be
   *                 restored when passing this state back into the
   *                 restoreState() method.
   */
  public void stateHolderSaveRestoreStateTest() throws EETest.Fault {
    super.stateHolderSaveRestoreStateTest();
  }

  /**
   * @testName: stateHolderIsSetTransientTest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:442;JSF:JAVADOC:447
   * @test_Strategy: Verify {is,set}Transient() - if a value is set, the same
   *                 value is returned.
   */
  public void stateHolderIsSetTransientTest() throws EETest.Fault {
    super.stateHolderIsSetTransientTest();
  }

  /**
   * @testName: stateHolderRestoreStateNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:444; JSF:JAVADOC:445
   * @test_Strategy: Verify restoreState throws a NullPointerException if either
   *                 context or state are null
   */
  public void stateHolderRestoreStateNPETest() throws EETest.Fault {
    super.stateHolderRestoreStateNPETest();
  }

  /**
   * @testName: stateHolderSaveStateNPETest
   * @assertion_ids: JSF:JAVADOC:958; JSF:JAVADOC:446
   * @test_Strategy: Verify saveState throws a NullPointerException if context
   *                 is null
   */
  public void stateHolderSaveStateNPETest() throws EETest.Fault {
    super.stateHolderSaveStateNPETest();
  }

  // ---------------------------------------------------- PartialStateholder

  /**
   * @testName: partialStateHolderMICStateTest
   * @assertion_ids: JSF:JAVADOC:482; JSF:JAVADOC:530; JSF:JAVADOC:538;
   *                 JSF:JAVADOC:581; JSF:JAVADOC:619; JSF:JAVADOC:431;
   *                 JSF:JAVADOC:432; JSF:JAVADOC:433
   * @test_Strategy: Verify that clearInitialState(), initialStateMarked(), and
   *                 markInitialState() work correctly, by setting and checking
   *                 values.
   */
  public void partialStateHolderMICStateTest() throws EETest.Fault {
    super.partialStateHolderMICStateTest();
  }

}