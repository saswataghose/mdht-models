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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;

import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.STDHistoryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STD History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class STDHistoryObservationImpl extends ProblemObservationImpl implements STDHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STDHistoryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HepbPackage.Literals.STD_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTDHistoryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateSTDHistoryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return STDHistoryObservationOperations.validateSTDHistoryObservationCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTDHistoryObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateSTDHistoryObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTDHistoryObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateSTDHistoryObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTDHistoryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateSTDHistoryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return STDHistoryObservationOperations.validateSTDHistoryObservationStatusCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTDHistoryObservationProblemStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateSTDHistoryObservationProblemStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation gethepbProblemStatus() {
		return STDHistoryObservationOperations.gethepbProblemStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return STDHistoryObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STDHistoryObservation init() {
	    return Initializer.Util.init(this);
	}

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public STDHistoryObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //STDHistoryObservationImpl
