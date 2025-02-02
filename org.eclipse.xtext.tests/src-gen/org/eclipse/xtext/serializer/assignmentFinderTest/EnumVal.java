/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.assignmentFinderTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.assignmentFinderTest.EnumVal#getEn <em>En</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.assignmentFinderTest.AssignmentFinderTestPackage#getEnumVal()
 * @model
 * @generated
 */
public interface EnumVal extends EObject
{
  /**
   * Returns the value of the '<em><b>En</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.serializer.assignmentFinderTest.TestEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>En</em>' attribute.
   * @see org.eclipse.xtext.serializer.assignmentFinderTest.TestEnum
   * @see #setEn(TestEnum)
   * @see org.eclipse.xtext.serializer.assignmentFinderTest.AssignmentFinderTestPackage#getEnumVal_En()
   * @model
   * @generated
   */
  TestEnum getEn();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.assignmentFinderTest.EnumVal#getEn <em>En</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>En</em>' attribute.
   * @see org.eclipse.xtext.serializer.assignmentFinderTest.TestEnum
   * @see #getEn()
   * @generated
   */
  void setEn(TestEnum value);

} // EnumVal
