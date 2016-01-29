/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.PlannedAct2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Recommendation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship602(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship602</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship604(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship604</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship606(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship606</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship608(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship608</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship610(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship610</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEntryRelationship612(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship612</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Encounter2 Entry Relationship Planned Encounter2603</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Medication Activity2 Entry Relationship Planned Medication Activity2605</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Observation2 Entry Relationship Planned Observation2607</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Procedure2 Entry Relationship Planned Procedure2609</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Supply2 Entry Relationship Planned Supply2611</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Act2 Entry Relationship Planned Act2613</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NutritionRecommendationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionRecommendationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationTemplateId(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationTemplateId(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.130')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationTemplateId(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationTemplateId(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationTemplateId(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationTemplateId"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationClassCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationClassCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationClassCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationClassCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationClassCode(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationClassCode"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationMoodCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationMoodCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationMoodCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationMoodCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationMoodCodeP(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_MOOD_CODE_P,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationMoodCodeP"),
						 new Object [] { nutritionRecommendation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationMoodCodeP", passToken);
				}
				passToken.add(nutritionRecommendation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationMoodCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationMoodCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood) and "+
"let value : vocab::x_DocumentActMood = self.moodCode.oclAsType(vocab::x_DocumentActMood) in "+
"value = vocab::x_DocumentActMood::INT or value = vocab::x_DocumentActMood::ARQ or value = vocab::x_DocumentActMood::PRMS or value = vocab::x_DocumentActMood::PRP or value = vocab::x_DocumentActMood::RQO or value = vocab::x_DocumentActMood::APT";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationMoodCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationMoodCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationMoodCode(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(nutritionRecommendation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationMoodCode"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationCodeP(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationCodeP"),
						 new Object [] { nutritionRecommendation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationCodeP", passToken);
				}
				passToken.add(nutritionRecommendation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '61310001' or value.code = '386373004' or value.code = '418995006' or value.code = '413315001' or value.code = '182922004' or value.code = '229912004' or value.code = '225372007' or value.code = '448556005'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationCode(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(nutritionRecommendation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_CODE,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationCode"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationStatusCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationStatusCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationStatusCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationStatusCode(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationStatusCode(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationStatusCode"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationStatusCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationStatusCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationStatusCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationStatusCodeP(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationStatusCodeP(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationStatusCodeP"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEffectiveTime(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEffectiveTime(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEffectiveTime(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEffectiveTime(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNutritionRecommendationEffectiveTime(NutritionRecommendation nutritionRecommendation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEffectiveTime"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship602(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship602</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship602(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship602(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship602</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship602(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship602(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP602,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship602"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship604(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship604</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship604(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship604(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship604</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship604(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship604(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP604,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship604"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship606(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship606</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship606(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship606(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship606</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship606(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship606(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP606,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship606"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship608(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship608</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship608(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship608(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship608</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship608(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship608(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP608,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship608"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship610(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship610</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship610(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship610(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship610</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship610(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship610(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP610,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship610"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationEntryRelationship612(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship612</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship612(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationEntryRelationship612(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Entry Relationship612</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationEntryRelationship612(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNutritionRecommendationEntryRelationship612(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nutritionRecommendation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_ENTRY_RELATIONSHIP612,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationEntryRelationship612"),
						 new Object [] { nutritionRecommendation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Encounter2 Entry Relationship Planned Encounter2603</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(encounter->exists(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::PlannedEncounter2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Encounter2 Entry Relationship Planned Encounter2603</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2_ENTRY_RELATIONSHIP_PLANNED_ENCOUNTER2603,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedEncounter2EntryRelationshipPlannedEncounter2603"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Medication Activity2 Entry Relationship Planned Medication Activity2605</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(substanceAdministration->exists(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::PlannedMedicationActivity2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Medication Activity2 Entry Relationship Planned Medication Activity2605</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2_ENTRY_RELATIONSHIP_PLANNED_MEDICATION_ACTIVITY2605,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedMedicationActivity2EntryRelationshipPlannedMedicationActivity2605"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Observation2 Entry Relationship Planned Observation2607</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PlannedObservation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Observation2 Entry Relationship Planned Observation2607</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2_ENTRY_RELATIONSHIP_PLANNED_OBSERVATION2607,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedObservation2EntryRelationshipPlannedObservation2607"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Procedure2 Entry Relationship Planned Procedure2609</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(procedure->exists(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::PlannedProcedure2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Procedure2 Entry Relationship Planned Procedure2609</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2_ENTRY_RELATIONSHIP_PLANNED_PROCEDURE2609,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedProcedure2EntryRelationshipPlannedProcedure2609"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Supply2 Entry Relationship Planned Supply2611</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(supply->exists(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::PlannedSupply2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Supply2 Entry Relationship Planned Supply2611</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2_ENTRY_RELATIONSHIP_PLANNED_SUPPLY2611,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedSupply2EntryRelationshipPlannedSupply2611"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Act2 Entry Relationship Planned Act2613</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedAct2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Act2 Entry Relationship Planned Act2613</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(NutritionRecommendation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nutritionRecommendation The receiving '<em><b>Nutrition Recommendation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613(NutritionRecommendation nutritionRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.NUTRITION_RECOMMENDATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(nutritionRecommendation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.NUTRITION_RECOMMENDATION__NUTRITION_RECOMMENDATION_PLANNED_ACT2_ENTRY_RELATIONSHIP_PLANNED_ACT2613,
						 ConsolPlugin.INSTANCE.getString("NutritionRecommendationNutritionRecommendationPlannedAct2EntryRelationshipPlannedAct2613"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // NutritionRecommendationOperations
