/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CodeObservations;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.CodeObservationsOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Observations</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CodeObservationsImpl extends ObservationImpl implements CodeObservations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeObservationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CODE_OBSERVATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCodeObservationsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeObservationsEntryRelationship554(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsEntryRelationship554(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeObservationsEntryRelationship556(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsEntryRelationship556(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeObservationsSOPInstanceObservationEntryRelationshipSOPInstanceObservation555(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsSOPInstanceObservationEntryRelationshipSOPInstanceObservation555(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeObservationsQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation557(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CodeObservationsOperations.validateCodeObservationsQuantityMeasurementObservationEntryRelationshipQuantityMeasurementObservation557(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeObservations init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public CodeObservations init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CodeObservationsImpl
