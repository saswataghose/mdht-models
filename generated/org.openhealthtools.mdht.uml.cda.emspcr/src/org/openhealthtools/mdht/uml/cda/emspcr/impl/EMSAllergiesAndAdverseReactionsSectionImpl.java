/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSAllergiesAndAdverseReactionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Allergies And Adverse Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSAllergiesAndAdverseReactionsSectionImpl extends SectionImpl implements
		EMSAllergiesAndAdverseReactionsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSAllergiesAndAdverseReactionsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizer getEnvironmentalAllergies() {
		return EMSAllergiesAndAdverseReactionsSectionOperations.getEnvironmentalAllergies(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizer getEMSDrugAllergyOrganizer() {
		return EMSAllergiesAndAdverseReactionsSectionOperations.getEMSDrugAllergyOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAllergiesAndAdverseReactionsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAllergiesAndAdverseReactionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSAllergiesAndAdverseReactionsSectionImpl
