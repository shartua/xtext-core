/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Action;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Add;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.AssignedAction;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Delegate;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Delegation;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Expression;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Mixed;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Named;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.PrefixedDelegate;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.PrefixedUnassigned;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.RegionaccesstestlanguageFactory;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.RegionaccesstestlanguagePackage;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Root;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.RootAction;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Simple;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Unassigned;
import org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.ValueList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionaccesstestlanguageFactoryImpl extends EFactoryImpl implements RegionaccesstestlanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RegionaccesstestlanguageFactory init()
  {
    try
    {
      RegionaccesstestlanguageFactory theRegionaccesstestlanguageFactory = (RegionaccesstestlanguageFactory)EPackage.Registry.INSTANCE.getEFactory(RegionaccesstestlanguagePackage.eNS_URI);
      if (theRegionaccesstestlanguageFactory != null)
      {
        return theRegionaccesstestlanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RegionaccesstestlanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionaccesstestlanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RegionaccesstestlanguagePackage.ROOT: return createRoot();
      case RegionaccesstestlanguagePackage.SIMPLE: return createSimple();
      case RegionaccesstestlanguagePackage.DELEGATION: return createDelegation();
      case RegionaccesstestlanguagePackage.UNASSIGNED: return createUnassigned();
      case RegionaccesstestlanguagePackage.PREFIXED_UNASSIGNED: return createPrefixedUnassigned();
      case RegionaccesstestlanguagePackage.PREFIXED_DELEGATE: return createPrefixedDelegate();
      case RegionaccesstestlanguagePackage.DELEGATE: return createDelegate();
      case RegionaccesstestlanguagePackage.EXPRESSION: return createExpression();
      case RegionaccesstestlanguagePackage.MIXED: return createMixed();
      case RegionaccesstestlanguagePackage.VALUE_LIST: return createValueList();
      case RegionaccesstestlanguagePackage.ROOT_ACTION: return createRootAction();
      case RegionaccesstestlanguagePackage.ADD: return createAdd();
      case RegionaccesstestlanguagePackage.NAMED: return createNamed();
      case RegionaccesstestlanguagePackage.ACTION: return createAction();
      case RegionaccesstestlanguagePackage.ASSIGNED_ACTION: return createAssignedAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RegionaccesstestlanguagePackage.ENUM:
        return createEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RegionaccesstestlanguagePackage.ENUM:
        return convertEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Simple createSimple()
  {
    SimpleImpl simple = new SimpleImpl();
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delegation createDelegation()
  {
    DelegationImpl delegation = new DelegationImpl();
    return delegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unassigned createUnassigned()
  {
    UnassignedImpl unassigned = new UnassignedImpl();
    return unassigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrefixedUnassigned createPrefixedUnassigned()
  {
    PrefixedUnassignedImpl prefixedUnassigned = new PrefixedUnassignedImpl();
    return prefixedUnassigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrefixedDelegate createPrefixedDelegate()
  {
    PrefixedDelegateImpl prefixedDelegate = new PrefixedDelegateImpl();
    return prefixedDelegate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delegate createDelegate()
  {
    DelegateImpl delegate = new DelegateImpl();
    return delegate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mixed createMixed()
  {
    MixedImpl mixed = new MixedImpl();
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueList createValueList()
  {
    ValueListImpl valueList = new ValueListImpl();
    return valueList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RootAction createRootAction()
  {
    RootActionImpl rootAction = new RootActionImpl();
    return rootAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Named createNamed()
  {
    NamedImpl named = new NamedImpl();
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignedAction createAssignedAction()
  {
    AssignedActionImpl assignedAction = new AssignedActionImpl();
    return assignedAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Enum createEnumFromString(EDataType eDataType, String initialValue)
  {
    org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Enum result = org.eclipse.xtext.formatting2.regionaccess.internal.regionaccesstestlanguage.Enum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RegionaccesstestlanguagePackage getRegionaccesstestlanguagePackage()
  {
    return (RegionaccesstestlanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RegionaccesstestlanguagePackage getPackage()
  {
    return RegionaccesstestlanguagePackage.eINSTANCE;
  }

} //RegionaccesstestlanguageFactoryImpl
