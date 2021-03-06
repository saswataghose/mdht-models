/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.MedicalEquipmentSectionImpl;

import org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;

import org.openhealthtools.mdht.uml.cda.phmr.operations.MedicalEquipmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentImpl extends MedicalEquipmentSectionImpl implements MedicalEquipment {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicalEquipmentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhmrPackage.Literals.MEDICAL_EQUIPMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateMedicalEquipmentText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalEquipmentOperations.validateMedicalEquipmentText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateMedicalEquipmentDeviceDefinitionOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalEquipmentOperations.validateMedicalEquipmentDeviceDefinitionOrganizer(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<DeviceDefinitionOrganizer> getDeviceDefinitionOrganizers() {
    return MedicalEquipmentOperations.getDeviceDefinitionOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateMedicalEquipmentSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicalEquipmentOperations.validateMedicalEquipmentSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public MedicalEquipment init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MedicalEquipment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MedicalEquipmentImpl
