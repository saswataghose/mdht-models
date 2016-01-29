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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Status Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CognitiveStatusResultObservationImpl extends ResultObservationImpl implements
		CognitiveStatusResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusResultObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValueDatatype(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationEntryRelationship568(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationEntryRelationship568(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationEntryRelationship570(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationEntryRelationship570(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationEntryRelationship572(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationEntryRelationship572(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity569(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivityEntryRelationshipNonMedicinalSupplyActivity569(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics571(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCaregiverCharacteristicsEntryRelationshipCaregiverCharacteristics571(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation573(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAssessmentScaleObservationEntryRelationshipAssessmentScaleObservation573(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public CognitiveStatusResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CognitiveStatusResultObservationImpl
