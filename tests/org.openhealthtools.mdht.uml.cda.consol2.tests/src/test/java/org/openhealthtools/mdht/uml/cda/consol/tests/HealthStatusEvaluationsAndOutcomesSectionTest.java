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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusEvaluationsAndOutcomesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Evaluations And Outcomes Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionEntry754(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Entry754</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection#validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations And Outcomes Section Outcome Observation Entry Outcome Observation755</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthStatusEvaluationsAndOutcomesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionTemplateId() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionTemplateIdTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionTemplateId(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionNullFlavor() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionNullFlavorTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionNullFlavor(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionCode() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionCodeTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionCode(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionCodeP() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionCodePTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionCodeP(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionTitle() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionTitleTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionTitle(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsAndOutcomesSectionText() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionTextTestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionText(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthStatusEvaluationsAndOutcomesSectionEntry754() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionEntry754TestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionEntry754",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_ENTRY754__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionEntry754(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionEntry754TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755() {
		OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection> validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755TestCase = new OperationsTestCase<HealthStatusEvaluationsAndOutcomesSection>(
			"validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755",
			operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION_OUTCOME_OBSERVATION_ENTRY_OUTCOME_OBSERVATION755__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsAndOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsAndOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsAndOutcomesSectionOperations.validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755(
					(HealthStatusEvaluationsAndOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsAndOutcomesSectionOutcomeObservationEntryOutcomeObservation755TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthStatusEvaluationsAndOutcomesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthStatusEvaluationsAndOutcomesSection> {
		public HealthStatusEvaluationsAndOutcomesSection create() {
			return ConsolFactory.eINSTANCE.createHealthStatusEvaluationsAndOutcomesSection();
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
	private static class ConstructorTestClass extends HealthStatusEvaluationsAndOutcomesSectionOperations {
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

} // HealthStatusEvaluationsAndOutcomesSectionOperations
