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
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.NumberOfPressureUlcersObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Pressure Ulcers Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation2 Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2#validateNumberOfPressureUlcersObservationEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberOfPressureUlcersObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservation2CDTranslation() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservation2CDTranslationTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservation2CDTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservation2CDTranslation(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservation2CDTranslationP() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservation2CDTranslationPTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservation2CDTranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservation2CDTranslationP(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeP(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCode(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservation2EntryRelationshipObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationTemplateId() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationTemplateIdTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationTemplateId(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationCodeP() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationCodePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationCodeP(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(NumberOfPressureUlcersObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationCode(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationship() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationship",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationship(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipObservationValuePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationValue() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipTypeCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipTypeCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservation() {
		OperationsTestCase<NumberOfPressureUlcersObservation2> validateNumberOfPressureUlcersObservationEntryRelationshipObservationTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation2>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation2 target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservation2Operations.validateNumberOfPressureUlcersObservationEntryRelationshipObservation(
					(NumberOfPressureUlcersObservation2) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberOfPressureUlcersObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberOfPressureUlcersObservation2> {
		public NumberOfPressureUlcersObservation2 create() {
			return ConsolFactory.eINSTANCE.createNumberOfPressureUlcersObservation2();
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
	private static class ConstructorTestClass extends NumberOfPressureUlcersObservation2Operations {
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

} // NumberOfPressureUlcersObservation2Operations
