/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.Doc;
import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.NestedRefsFactory;
import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.NestedRefsPackage;
import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedRefsPackageImpl extends EPackageImpl implements NestedRefsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass docEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selfReferingDeclEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.NestedRefsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NestedRefsPackageImpl()
  {
    super(eNS_URI, NestedRefsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link NestedRefsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NestedRefsPackage init()
  {
    if (isInited) return (NestedRefsPackage)EPackage.Registry.INSTANCE.getEPackage(NestedRefsPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredNestedRefsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    NestedRefsPackageImpl theNestedRefsPackage = registeredNestedRefsPackage instanceof NestedRefsPackageImpl ? (NestedRefsPackageImpl)registeredNestedRefsPackage : new NestedRefsPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theNestedRefsPackage.createPackageContents();

    // Initialize created meta-data
    theNestedRefsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNestedRefsPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NestedRefsPackage.eNS_URI, theNestedRefsPackage);
    return theNestedRefsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDoc()
  {
    return docEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDoc_Declarations()
  {
    return (EReference)docEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSelfReferingDecl()
  {
    return selfReferingDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSelfReferingDecl_Name()
  {
    return (EAttribute)selfReferingDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSelfReferingDecl_SelfRef()
  {
    return (EReference)selfReferingDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedRefsFactory getNestedRefsFactory()
  {
    return (NestedRefsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    docEClass = createEClass(DOC);
    createEReference(docEClass, DOC__DECLARATIONS);

    selfReferingDeclEClass = createEClass(SELF_REFERING_DECL);
    createEAttribute(selfReferingDeclEClass, SELF_REFERING_DECL__NAME);
    createEReference(selfReferingDeclEClass, SELF_REFERING_DECL__SELF_REF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(docEClass, Doc.class, "Doc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoc_Declarations(), this.getSelfReferingDecl(), null, "declarations", null, 0, -1, Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selfReferingDeclEClass, SelfReferingDecl.class, "SelfReferingDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelfReferingDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SelfReferingDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelfReferingDecl_SelfRef(), this.getSelfReferingDecl(), null, "selfRef", null, 0, 1, SelfReferingDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //NestedRefsPackageImpl
