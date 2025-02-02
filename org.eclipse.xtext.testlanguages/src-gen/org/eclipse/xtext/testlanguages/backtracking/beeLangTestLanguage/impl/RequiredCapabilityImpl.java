/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Expression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#isGreedy <em>Greedy</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.RequiredCapabilityImpl#getVersionRange <em>Version Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredCapabilityImpl extends MinimalEObjectImpl.Container implements RequiredCapability
{
  /**
   * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameSpace()
   * @generated
   * @ordered
   */
  protected static final String NAME_SPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameSpace()
   * @generated
   * @ordered
   */
  protected String nameSpace = NAME_SPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondExpr()
   * @generated
   * @ordered
   */
  protected Expression condExpr;

  /**
   * The default value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreedy()
   * @generated
   * @ordered
   */
  protected static final boolean GREEDY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGreedy()
   * @generated
   * @ordered
   */
  protected boolean greedy = GREEDY_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final int MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected int min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionRange()
   * @generated
   * @ordered
   */
  protected static final String VERSION_RANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionRange()
   * @generated
   * @ordered
   */
  protected String versionRange = VERSION_RANGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredCapabilityImpl()
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
    return BeeLangTestLanguagePackage.Literals.REQUIRED_CAPABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameSpace()
  {
    return nameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameSpace(String newNameSpace)
  {
    String oldNameSpace = nameSpace;
    nameSpace = newNameSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME_SPACE, oldNameSpace, nameSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondExpr()
  {
    return condExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondExpr(Expression newCondExpr, NotificationChain msgs)
  {
    Expression oldCondExpr = condExpr;
    condExpr = newCondExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR, oldCondExpr, newCondExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondExpr(Expression newCondExpr)
  {
    if (newCondExpr != condExpr)
    {
      NotificationChain msgs = null;
      if (condExpr != null)
        msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR, null, msgs);
      if (newCondExpr != null)
        msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR, null, msgs);
      msgs = basicSetCondExpr(newCondExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR, newCondExpr, newCondExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGreedy()
  {
    return greedy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGreedy(boolean newGreedy)
  {
    boolean oldGreedy = greedy;
    greedy = newGreedy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__GREEDY, oldGreedy, greedy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMin(int newMin)
  {
    int oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersionRange()
  {
    return versionRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersionRange(String newVersionRange)
  {
    String oldVersionRange = versionRange;
    versionRange = newVersionRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__VERSION_RANGE, oldVersionRange, versionRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR:
        return basicSetCondExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME_SPACE:
        return getNameSpace();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME:
        return getName();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR:
        return getCondExpr();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__GREEDY:
        return isGreedy();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MIN:
        return getMin();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MAX:
        return getMax();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__VERSION_RANGE:
        return getVersionRange();
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
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME_SPACE:
        setNameSpace((String)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME:
        setName((String)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR:
        setCondExpr((Expression)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__GREEDY:
        setGreedy((Boolean)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MIN:
        setMin((Integer)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MAX:
        setMax((Integer)newValue);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__VERSION_RANGE:
        setVersionRange((String)newValue);
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
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME_SPACE:
        setNameSpace(NAME_SPACE_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR:
        setCondExpr((Expression)null);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__GREEDY:
        setGreedy(GREEDY_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__VERSION_RANGE:
        setVersionRange(VERSION_RANGE_EDEFAULT);
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
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME_SPACE:
        return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__COND_EXPR:
        return condExpr != null;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__GREEDY:
        return greedy != GREEDY_EDEFAULT;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MIN:
        return min != MIN_EDEFAULT;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__MAX:
        return max != MAX_EDEFAULT;
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY__VERSION_RANGE:
        return VERSION_RANGE_EDEFAULT == null ? versionRange != null : !VERSION_RANGE_EDEFAULT.equals(versionRange);
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
    result.append(" (nameSpace: ");
    result.append(nameSpace);
    result.append(", name: ");
    result.append(name);
    result.append(", greedy: ");
    result.append(greedy);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", versionRange: ");
    result.append(versionRange);
    result.append(')');
    return result.toString();
  }

} //RequiredCapabilityImpl
