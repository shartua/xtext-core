/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.contextFinderTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Type Recursive Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.contextFinderTest.NestedTypeRecursiveTest#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.contextFinderTest.ContextFinderTestPackage#getNestedTypeRecursiveTest()
 * @model
 * @generated
 */
public interface NestedTypeRecursiveTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(NestedTypeRecursiveTest)
   * @see org.eclipse.xtext.serializer.contextFinderTest.ContextFinderTestPackage#getNestedTypeRecursiveTest_Left()
   * @model containment="true"
   * @generated
   */
  NestedTypeRecursiveTest getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.contextFinderTest.NestedTypeRecursiveTest#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(NestedTypeRecursiveTest value);

} // NestedTypeRecursiveTest
