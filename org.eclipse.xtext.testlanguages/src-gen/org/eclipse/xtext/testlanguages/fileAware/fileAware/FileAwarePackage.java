/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.fileAware.fileAware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.FileAwareFactory
 * @model kind="package"
 * @generated
 */
public interface FileAwarePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fileAware";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/testlanguage/FileAware";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fileAware";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FileAwarePackage eINSTANCE = org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.PackageDeclarationImpl
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__CONTENTS = 2;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ImportImpl
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ElementImpl
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__CONTENTS = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__REF = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getImports()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.PackageDeclaration#getContents()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Import#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Import#getElement()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Element();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getContents()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Contents();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref</em>'.
   * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.Element#getRef()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FileAwareFactory getFileAwareFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.PackageDeclarationImpl
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__IMPORTS = eINSTANCE.getPackageDeclaration_Imports();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__CONTENTS = eINSTANCE.getPackageDeclaration_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ImportImpl
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__ELEMENT = eINSTANCE.getImport_Element();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.ElementImpl
     * @see org.eclipse.xtext.testlanguages.fileAware.fileAware.impl.FileAwarePackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__CONTENTS = eINSTANCE.getElement_Contents();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__REF = eINSTANCE.getElement_Ref();

  }

} //FileAwarePackage
