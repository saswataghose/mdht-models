/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHESeverity() <em>Get IHE Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEProblemStatusObservation() <em>Get IHE Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEComments() <em>Get IHE Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateProblemEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceOperations extends ProblemEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyIntoleranceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.6')
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceTemplateId(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceTemplateId"), new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceValue(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_VALUE,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceValue"), new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceProblemEntryReactionObservationContainer"),
					new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceSeverity(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_SEVERITY,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceSeverity"), new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceProblemStatusObservation"),
					new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAllergyIntoleranceComment(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_COMMENT,
					IHEPlugin.INSTANCE.getString("AllergyIntoleranceComment"), new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntryReactionObservationContainers(AllergyIntolerance) <em>Get Problem Entry Reaction Observation Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntryReactionObservationContainers(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer)).oclAsType(ihe::ProblemEntryReactionObservationContainer)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntryReactionObservationContainers(AllergyIntolerance) <em>Get Problem Entry Reaction Observation Containers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntryReactionObservationContainers(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer)).oclAsType(ihe::ProblemEntryReactionObservationContainer)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProblemEntryReactionObservationContainer> getProblemEntryReactionObservationContainers(
			AllergyIntolerance allergyIntolerance) {
		if (GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.ALLERGY_INTOLERANCE,
				IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(83));
			try {
				GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemEntryReactionObservationContainer> result = (Collection<ProblemEntryReactionObservationContainer>) query.evaluate(allergyIntolerance);
		return new BasicEList.UnmodifiableEList<ProblemEntryReactionObservationContainer>(
			result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHESeverity(AllergyIntolerance) <em>Get IHE Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHESeverity(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::Severity))->asSequence()->first().oclAsType(ihe::Severity)";

	/**
	 * The cached OCL query for the '{@link #getIHESeverity(AllergyIntolerance) <em>Get IHE Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHESeverity(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::Severity))->asSequence()->first().oclAsType(ihe::Severity)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Severity getIHESeverity(AllergyIntolerance allergyIntolerance) {
		if (GET_IHE_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.ALLERGY_INTOLERANCE,
				IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(84));
			try {
				GET_IHE_SEVERITY__EOCL_QRY = helper.createQuery(GET_IHE_SEVERITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_SEVERITY__EOCL_QRY);
		return (Severity) query.evaluate(allergyIntolerance);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHEProblemStatusObservation(AllergyIntolerance) <em>Get IHE Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEProblemStatusObservation(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getIHEProblemStatusObservation(AllergyIntolerance) <em>Get IHE Problem Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEProblemStatusObservation(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->first().oclAsType(ihe::ProblemStatusObservation)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemStatusObservation getIHEProblemStatusObservation(AllergyIntolerance allergyIntolerance) {
		if (GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.ALLERGY_INTOLERANCE,
				IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(85));
			try {
				GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
		return (ProblemStatusObservation) query.evaluate(allergyIntolerance);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHEComments(AllergyIntolerance) <em>Get IHE Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEComments(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::Comment)).oclAsType(ihe::Comment)";

	/**
	 * The cached OCL query for the '{@link #getIHEComments(AllergyIntolerance) <em>Get IHE Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEComments(AllergyIntolerance)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::Comment)).oclAsType(ihe::Comment)
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Comment> getIHEComments(AllergyIntolerance allergyIntolerance) {
		if (GET_IHE_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.ALLERGY_INTOLERANCE,
				IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(86));
			try {
				GET_IHE_COMMENTS__EOCL_QRY = helper.createQuery(GET_IHE_COMMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(allergyIntolerance);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemEntryCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemEntryCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemEntryCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.5.4'))
	 * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProblemEntryCode(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
			try {
				VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.ALLERGY_INTOLERANCE__PROBLEM_ENTRY_CODE,
					IHEPlugin.INSTANCE.getString("ProblemEntryCode"), new Object[] { allergyIntolerance }));
			}
			return false;
		}
		return true;
	}

} // AllergyIntoleranceOperations
