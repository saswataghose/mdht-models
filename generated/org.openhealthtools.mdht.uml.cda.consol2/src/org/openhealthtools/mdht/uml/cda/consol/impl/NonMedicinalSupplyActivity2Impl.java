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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;

import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Medicinal Supply Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonMedicinalSupplyActivity2Impl extends NonMedicinalSupplyActivityImpl implements
		NonMedicinalSupplyActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMedicinalSupplyActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NON_MEDICINAL_SUPPLY_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonMedicinalSupplyActivity2Instruction2InversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2InversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivityStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivity2EntryRelationship956(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2EntryRelationship956(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2EntryRelationshipInstruction2957(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonMedicinalSupplyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonMedicinalSupplyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonMedicinalSupplyActivityProductInstance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityProductInstance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonMedicinalSupplyActivity2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NonMedicinalSupplyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NonMedicinalSupplyActivity2Impl
