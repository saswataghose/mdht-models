/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.SupplyActivityImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SupplyEntryImpl extends SupplyActivityImpl implements SupplyEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SUPPLY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntryQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyEntryRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SupplyEntryOperations.validateSupplyEntryRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationFullfillmentInstructions getMedicationFullfillmentInstructions() {
		return SupplyEntryOperations.getMedicationFullfillmentInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyEntry init() {
		CDAUtil.init(this);
		return this;
	}
} // SupplyEntryImpl
