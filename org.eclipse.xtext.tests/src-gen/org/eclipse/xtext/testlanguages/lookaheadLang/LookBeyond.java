/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.lookaheadLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Look Beyond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage#getLookBeyond()
 * @model
 * @generated
 */
public interface LookBeyond extends Alts
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LookAheadStrings)
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage#getLookBeyond_Left()
   * @model containment="true"
   * @generated
   */
  LookAheadStrings getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LookAheadStrings value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(FewerLookAheadStrings)
   * @see org.eclipse.xtext.testlanguages.lookaheadLang.LookaheadLangPackage#getLookBeyond_Right()
   * @model containment="true"
   * @generated
   */
  FewerLookAheadStrings getRight();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.lookaheadLang.LookBeyond#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(FewerLookAheadStrings value);

} // LookBeyond
