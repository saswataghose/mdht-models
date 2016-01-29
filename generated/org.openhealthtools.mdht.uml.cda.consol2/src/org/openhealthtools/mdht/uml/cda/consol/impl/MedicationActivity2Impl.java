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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivity2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicationActivity2Impl extends MedicationActivityImpl implements MedicationActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATION_ACTIVITY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2SubstanceAdministeredActInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2SubstanceAdministeredActSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActSequenceNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EffectiveTimeIVLTSLowXorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship936(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship936(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship938(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship938(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship940(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship940(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship942(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship942(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship944(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship944(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship946(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship946(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship948(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship948(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2EntryRelationship950(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2EntryRelationship950(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2Indication2EntryRelationshipIndication2937(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2Indication2EntryRelationshipIndication2937(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2Instruction2EntryRelationshipInstruction2939(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2MedicationSupplyOrder2EntryRelationshipMedicationSupplyOrder2941(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2MedicationDispense2EntryRelationshipMedicationDispense2943(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2ReactionObservation2EntryRelationshipReactionObservation2945(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2DrugMonitoringActEntryRelationshipDrugMonitoringAct947(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2SubstanceAdministeredActEntryRelationshipSubstanceAdministeredAct949(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivity2MedicationFreeTextSigEntryRelationshipMedicationFreeTextSig951(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityInstructionsInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityInstructionsInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityDoseQuantityorrateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityDoseQuantityorrateQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSorTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSorTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimeIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimeIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityEffectiveTimePIVLTS(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityEffectiveTimePIVLTS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityAdministrationUnitCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityConsumable(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPreconditionTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationActivityConsumableMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MedicationActivity2Operations.validateMedicationActivityConsumableMedicationInformation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public MedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MedicationActivity2Impl
