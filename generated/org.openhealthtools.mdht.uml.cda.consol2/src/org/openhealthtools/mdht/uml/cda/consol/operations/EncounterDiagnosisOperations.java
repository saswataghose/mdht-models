/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisEntryRelationship558(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Entry Relationship558</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation Entry Relationship Problem Observation559</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterDiagnosisOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterDiagnosisOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisTemplateId(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisTemplateId(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.80')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisTemplateId(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisTemplateId(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisTemplateId(EncounterDiagnosis encounterDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisTemplateId"),
						 new Object [] { encounterDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisClassCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisClassCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisClassCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisClassCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisClassCode(EncounterDiagnosis encounterDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisClassCode"),
						 new Object [] { encounterDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisMoodCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisMoodCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisMoodCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisMoodCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisMoodCode(EncounterDiagnosis encounterDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisMoodCode"),
						 new Object [] { encounterDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisCodeP(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCodeP(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisCodeP(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCodeP(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisCodeP(EncounterDiagnosis encounterDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisCodeP"),
						 new Object [] { encounterDiagnosis }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP", passToken);
				}
				passToken.add(encounterDiagnosis);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '29308-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisCode(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEncounterDiagnosisCode(EncounterDiagnosis encounterDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(encounterDiagnosis)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisCode"),
						 new Object [] { encounterDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisEntryRelationship558(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Entry Relationship558</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisEntryRelationship558(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisEntryRelationship558(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Entry Relationship558</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisEntryRelationship558(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEncounterDiagnosisEntryRelationship558(EncounterDiagnosis encounterDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_ENTRY_RELATIONSHIP558,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisEntryRelationship558"),
						 new Object [] { encounterDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation Entry Relationship Problem Observation559</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation Entry Relationship Problem Observation559</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(EncounterDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounterDiagnosis The receiving '<em><b>Encounter Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559(EncounterDiagnosis encounterDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER_DIAGNOSIS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(encounterDiagnosis);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER_DIAGNOSIS__ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION559,
						 ConsolPlugin.INSTANCE.getString("EncounterDiagnosisEncounterDiagnosisProblemObservationEntryRelationshipProblemObservation559"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // EncounterDiagnosisOperations
