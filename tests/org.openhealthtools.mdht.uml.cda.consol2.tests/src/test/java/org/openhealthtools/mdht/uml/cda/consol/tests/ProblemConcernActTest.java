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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEntryRelationship24(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Entry Relationship24</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActProblemObservationEntryRelationshipProblemObservation25(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation Entry Relationship Problem Observation25</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTimeLow() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEffectiveTimeLowTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeLow(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTimeHigh() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEffectiveTimeHighTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEffectiveTimeHigh", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeHigh(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActTemplateId() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActTemplateIdTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActTemplateId(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActClassCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActClassCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActClassCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActMoodCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActMoodCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActMoodCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActId() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActIdTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActId(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCodeP() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActCodePTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActCodeP(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemConcernAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActStatusCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActStatusCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActStatusCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTime() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEffectiveTimeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEffectiveTime(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernActEntryRelationship24() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEntryRelationship24TestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEntryRelationship24", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_ENTRY_RELATIONSHIP24__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEntryRelationship24(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEntryRelationship24TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemConcernActProblemObservationEntryRelationshipProblemObservation25() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActProblemObservationEntryRelationshipProblemObservation25TestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActProblemObservationEntryRelationshipProblemObservation25",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION_ENTRY_RELATIONSHIP_PROBLEM_OBSERVATION25__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActProblemObservationEntryRelationshipProblemObservation25(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActProblemObservationEntryRelationshipProblemObservation25TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemConcernActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemConcernAct> {
		@Override
		public ProblemConcernAct create() {
			return ConsolFactory.eINSTANCE.createProblemConcernAct();
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
	private static class ConstructorTestClass extends ProblemConcernActOperations {
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

} // ProblemConcernActOperations
