/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.hiddentokensequencertest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.hiddentokensequencertest.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.hiddentokensequencertest.Entity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.hiddentokensequencertest.HiddentokensequencertestPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.serializer.hiddentokensequencertest.HiddentokensequencertestPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.hiddentokensequencertest.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.xtext.serializer.hiddentokensequencertest.HiddentokensequencertestPackage#getEntity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.hiddentokensequencertest.Entity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Entity
