/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PressureUlcerObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pressure Ulcer Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierNameCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Name Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteQualifierValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Qualifier Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship1Observation1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship1 Observation1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship2Observation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship2 Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation#validatePressureUlcerObservationEntryRelationship3Observation3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pressure Ulcer Observation Entry Relationship3 Observation3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PressureUlcerObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationHasTextReference() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationHasTextReferenceTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationHasTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReference(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTextReferenceValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTextReferenceValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTextReferenceValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationHasTextReferenceValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationHasTextReferenceValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReferenceValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationValueNullFlavor() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValueNullFlavorTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValueNullFlavor",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValueNullFlavor(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifier() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifier(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierName() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierNameTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierName(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierNameCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierNameCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierNameCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierNameCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierNameCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteQualifierValueCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteQualifierValueCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteQualifierValueCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValueCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteQualifierValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTemplateId() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTemplateIdTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTemplateId(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationMoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationMoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationMoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationNegationInd() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationNegationIndTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationNegationInd", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationNegationInd(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationId() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationIdTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationId(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationCodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationCodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationCodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(PressureUlcerObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationText() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTextTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationText(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationStatusCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationStatusCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationStatusCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEffectiveTime() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEffectiveTimeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEffectiveTime(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationValue() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValue(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationValueP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationValuePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PRESSURE_ULCER_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationValueP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected void setDependency(PressureUlcerObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservationTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationTargetSiteCodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationTargetSiteCodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationshipTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1MoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1CodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1Value",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1TypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship1Observation1() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship1Observation1TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship1Observation1",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP1_OBSERVATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship1Observation1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2MoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2CodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2Value",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2TypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship2Observation2() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship2Observation2TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship2Observation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP2_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship2Observation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3ClassCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3ClassCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3MoodCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3MoodCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3MoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3CodeP() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3CodePTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3CodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3CodeP(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3Code() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3CodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Code(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3Value() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3ValueTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3Value",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Value(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3TypeCode() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3TypeCodeTestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3TypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3TypeCode(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePressureUlcerObservationEntryRelationship3Observation3() {
		OperationsTestCase<PressureUlcerObservation> validatePressureUlcerObservationEntryRelationship3Observation3TestCase = new OperationsTestCase<PressureUlcerObservation>(
			"validatePressureUlcerObservationEntryRelationship3Observation3",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRESSURE_ULCER_OBSERVATION_ENTRY_RELATIONSHIP3_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PressureUlcerObservation target) {

			}

			@Override
			protected void updateToPass(PressureUlcerObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3(
					(PressureUlcerObservation) objectToTest, diagnostician, map);
			}

		};

		validatePressureUlcerObservationEntryRelationship3Observation3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PressureUlcerObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PressureUlcerObservation> {
		@Override
		public PressureUlcerObservation create() {
			return ConsolFactory.eINSTANCE.createPressureUlcerObservation();
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
	private static class ConstructorTestClass extends PressureUlcerObservationOperations {
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

} // PressureUlcerObservationOperations
