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
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosis2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Preoperative Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosis2EntryRelationship1000(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis2 Entry Relationship1000</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis2 Problem Observation2 Entry Relationship Problem Observation21001</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2#validatePreoperativeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreoperativeDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisCodeP() {
		OperationsTestCase<PreoperativeDiagnosis2> validatePreoperativeDiagnosisCodePTestCase = new OperationsTestCase<PreoperativeDiagnosis2>(
			"validatePreoperativeDiagnosisCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisCodeP(
					(PreoperativeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePreoperativeDiagnosis2EntryRelationship1000() {
		OperationsTestCase<PreoperativeDiagnosis2> validatePreoperativeDiagnosis2EntryRelationship1000TestCase = new OperationsTestCase<PreoperativeDiagnosis2>(
			"validatePreoperativeDiagnosis2EntryRelationship1000",
			operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS2_ENTRY_RELATIONSHIP1000__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosis2EntryRelationship1000(
					(PreoperativeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosis2EntryRelationship1000TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001() {
		OperationsTestCase<PreoperativeDiagnosis2> validatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001TestCase = new OperationsTestCase<PreoperativeDiagnosis2>(
			"validatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001",
			operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS2_PROBLEM_OBSERVATION2_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION21001__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001(
					(PreoperativeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosis2ProblemObservation2EntryRelationshipProblemObservation21001TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisTemplateId() {
		OperationsTestCase<PreoperativeDiagnosis2> validatePreoperativeDiagnosisTemplateIdTestCase = new OperationsTestCase<PreoperativeDiagnosis2>(
			"validatePreoperativeDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisTemplateId(
					(PreoperativeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisCode() {
		OperationsTestCase<PreoperativeDiagnosis2> validatePreoperativeDiagnosisCodeTestCase = new OperationsTestCase<PreoperativeDiagnosis2>(
			"validatePreoperativeDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PreoperativeDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisCode(
					(PreoperativeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreoperativeDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PreoperativeDiagnosis2> {
		@Override
		public PreoperativeDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createPreoperativeDiagnosis2();
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
	private static class ConstructorTestClass extends PreoperativeDiagnosis2Operations {
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

} // PreoperativeDiagnosis2Operations
