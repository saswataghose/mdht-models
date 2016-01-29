/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosis2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosis2EntryRelationship922(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis2 Entry Relationship922</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis2 Problem Observation2 Entry Relationship Problem Observation2923</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisCodeP() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisCodePTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisCodeP(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosis2EntryRelationship922() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosis2EntryRelationship922TestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosis2EntryRelationship922",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS2_ENTRY_RELATIONSHIP922__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosis2EntryRelationship922(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosis2EntryRelationship922TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923TestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS2_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION2923__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosis2ProblemObservation2EntryRelationshipProblemObservation2923TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisTemplateId() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisTemplateId(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisCode() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalAdmissionDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisCode(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionDiagnosis2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosis2> {
		@Override
		public HospitalAdmissionDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosis2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HospitalAdmissionDiagnosis2Operations
