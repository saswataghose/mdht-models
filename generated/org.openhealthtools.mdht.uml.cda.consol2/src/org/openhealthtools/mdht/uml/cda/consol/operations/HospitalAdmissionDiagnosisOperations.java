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
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisEntryRelationship528(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Entry Relationship528</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis#validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation Entry Relationship Problem Observation529</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.34')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisTemplateId(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisTemplateId(
			HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisTemplateId"),
						 new Object [] { hospitalAdmissionDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisClassCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisClassCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisClassCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisClassCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisClassCode(
			HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisClassCode"),
						 new Object [] { hospitalAdmissionDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_CODE,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisCode"),
						 new Object [] { hospitalAdmissionDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHospitalAdmissionDiagnosisEntryRelationship528(HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisEntryRelationship528"),
						 new Object [] { hospitalAdmissionDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(hospitalAdmissionDiagnosis);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisMoodCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisMoodCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisMoodCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisMoodCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalAdmissionDiagnosis The receiving '<em><b>Hospital Admission Diagnosis</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalAdmissionDiagnosisMoodCode(
			HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosis)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HOSPITAL_ADMISSION_DIAGNOSIS__HOSPITAL_ADMISSION_DIAGNOSIS_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisHospitalAdmissionDiagnosisMoodCode"),
						 new Object [] { hospitalAdmissionDiagnosis }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '46241-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisCode(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisEntryRelationship528(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Entry Relationship528</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisEntryRelationship528(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisEntryRelationship528(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Entry Relationship528</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisEntryRelationship528(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY_RELATIONSHIP528__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation Entry Relationship Problem Observation529</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation Entry Relationship Problem Observation529</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisProblemObservationEntryRelationshipProblemObservation529(HospitalAdmissionDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION529__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

} // HospitalAdmissionDiagnosisOperations
