/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.antlr.gh1462Test.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.parser.antlr.gh1462Test.Gh1462TestPackage;
import org.eclipse.xtext.parser.antlr.gh1462Test.Rule3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.xtext.parser.antlr.gh1462Test.impl.Rule3Impl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Rule3Impl extends MinimalEObjectImpl.Container implements Rule3
{
  /**
   * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected static final String LEFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected String left = LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected String right = RIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final String UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected String unit = UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Rule3Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Gh1462TestPackage.Literals.RULE3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(String newLeft)
  {
    String oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Gh1462TestPackage.RULE3__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight(String newRight)
  {
    String oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Gh1462TestPackage.RULE3__RIGHT, oldRight, right));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnit(String newUnit)
  {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Gh1462TestPackage.RULE3__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Gh1462TestPackage.RULE3__LEFT:
        return getLeft();
      case Gh1462TestPackage.RULE3__RIGHT:
        return getRight();
      case Gh1462TestPackage.RULE3__UNIT:
        return getUnit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Gh1462TestPackage.RULE3__LEFT:
        setLeft((String)newValue);
        return;
      case Gh1462TestPackage.RULE3__RIGHT:
        setRight((String)newValue);
        return;
      case Gh1462TestPackage.RULE3__UNIT:
        setUnit((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Gh1462TestPackage.RULE3__LEFT:
        setLeft(LEFT_EDEFAULT);
        return;
      case Gh1462TestPackage.RULE3__RIGHT:
        setRight(RIGHT_EDEFAULT);
        return;
      case Gh1462TestPackage.RULE3__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Gh1462TestPackage.RULE3__LEFT:
        return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
      case Gh1462TestPackage.RULE3__RIGHT:
        return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
      case Gh1462TestPackage.RULE3__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (left: ");
    result.append(left);
    result.append(", right: ");
    result.append(right);
    result.append(", unit: ");
    result.append(unit);
    result.append(')');
    return result.toString();
  }

} //Rule3Impl
