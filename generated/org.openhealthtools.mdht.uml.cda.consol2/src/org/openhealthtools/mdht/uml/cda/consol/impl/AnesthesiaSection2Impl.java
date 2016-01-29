/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;

import org.openhealthtools.mdht.uml.cda.consol.operations.AnesthesiaSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anesthesia Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnesthesiaSection2Impl extends AnesthesiaSectionImpl implements AnesthesiaSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnesthesiaSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ANESTHESIA_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnesthesiaSection2Entry1052(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSection2Entry1052(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnesthesiaSection2Entry1054(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSection2Entry1054(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSection2ProcedureActivityProcedure2EntryProcedureActivityProcedure21053(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSection2MedicationActivity2EntryMedicationActivity21055(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAnesthesiaSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAnesthesiaSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAnesthesiaSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnesthesiaSection2Operations.validateAnesthesiaSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnesthesiaSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AnesthesiaSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AnesthesiaSection2Impl
