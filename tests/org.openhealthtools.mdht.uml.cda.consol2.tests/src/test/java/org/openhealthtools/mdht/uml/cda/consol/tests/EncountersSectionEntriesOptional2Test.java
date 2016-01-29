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
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2#validateEncountersSectionEntriesOptional2Entry1060(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional2 Entry1060</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2#validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional2 Encounter Activity2 Entry Encounter Activity21061</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2#validateEncountersSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncountersSectionEntriesOptional2Entry1060() {
		OperationsTestCase<EncountersSectionEntriesOptional2> validateEncountersSectionEntriesOptional2Entry1060TestCase = new OperationsTestCase<EncountersSectionEntriesOptional2>(
			"validateEncountersSectionEntriesOptional2Entry1060",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2_ENTRY1060__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptional2Entry1060(
					(EncountersSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptional2Entry1060TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061() {
		OperationsTestCase<EncountersSectionEntriesOptional2> validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061TestCase = new OperationsTestCase<EncountersSectionEntriesOptional2>(
			"validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2_ENCOUNTER_ACTIVITY2_ENTRY_ENCOUNTER_ACTIVITY21061__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061(
					(EncountersSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalTemplateId() {
		OperationsTestCase<EncountersSectionEntriesOptional2> validateEncountersSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<EncountersSectionEntriesOptional2>(
			"validateEncountersSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalTemplateId(
					(EncountersSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCodeP() {
		OperationsTestCase<EncountersSectionEntriesOptional2> validateEncountersSectionEntriesOptionalCodePTestCase = new OperationsTestCase<EncountersSectionEntriesOptional2>(
			"validateEncountersSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalCodeP(
					(EncountersSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCode() {
		OperationsTestCase<EncountersSectionEntriesOptional2> validateEncountersSectionEntriesOptionalCodeTestCase = new OperationsTestCase<EncountersSectionEntriesOptional2>(
			"validateEncountersSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(EncountersSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(EncountersSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalCode(
					(EncountersSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncountersSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersSectionEntriesOptional2> {
		@Override
		public EncountersSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends EncountersSectionEntriesOptional2Operations {
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

} // EncountersSectionEntriesOptional2Operations
