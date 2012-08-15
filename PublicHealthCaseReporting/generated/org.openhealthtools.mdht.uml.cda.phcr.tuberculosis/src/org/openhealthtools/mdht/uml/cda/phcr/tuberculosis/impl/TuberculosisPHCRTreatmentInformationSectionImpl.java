/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrTreatmentInformationSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRTreatmentInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisPHCRTreatmentInformationSectionImpl extends PhcrTreatmentInformationSectionImpl implements TuberculosisPHCRTreatmentInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPHCRTreatmentInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRTreatmentInformationSectionOperations.validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisTherapeuticRegimenAct getTuberculosisTherapeuticRegimenAct() {
		return TuberculosisPHCRTreatmentInformationSectionOperations.getTuberculosisTherapeuticRegimenAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrTreatmentInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisPHCRTreatmentInformationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TuberculosisPHCRTreatmentInformationSectionImpl
