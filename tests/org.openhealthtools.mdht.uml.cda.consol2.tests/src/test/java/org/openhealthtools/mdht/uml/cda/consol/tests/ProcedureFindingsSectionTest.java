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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureFindingsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Findings Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionEntry304(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Entry304</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection#validateProcedureFindingsSectionProblemObservationEntryProblemObservation305(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Problem Observation Entry Problem Observation305</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureFindingsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionTemplateId() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionTemplateIdTestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_FINDINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionTemplateId(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionCode() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionCodeTestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionCode(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionCodeP() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionCodePTestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionCodeP(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionText() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionTextTestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionText(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureFindingsSectionEntry304() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionEntry304TestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionEntry304", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_FINDINGS_SECTION_ENTRY304__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionEntry304(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionEntry304TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureFindingsSectionProblemObservationEntryProblemObservation305() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionProblemObservationEntryProblemObservation305TestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionProblemObservationEntryProblemObservation305",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_FINDINGS_SECTION_PROBLEM_OBSERVATION_ENTRY_PROBLEM_OBSERVATION305__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionProblemObservationEntryProblemObservation305(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionProblemObservationEntryProblemObservation305TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionTitle() {
		OperationsTestCase<ProcedureFindingsSection> validateProcedureFindingsSectionTitleTestCase = new OperationsTestCase<ProcedureFindingsSection>(
			"validateProcedureFindingsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSectionOperations.validateProcedureFindingsSectionTitle(
					(ProcedureFindingsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureFindingsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureFindingsSection> {
		@Override
		public ProcedureFindingsSection create() {
			return ConsolFactory.eINSTANCE.createProcedureFindingsSection();
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
	private static class ConstructorTestClass extends ProcedureFindingsSectionOperations {
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

} // ProcedureFindingsSectionOperations
