/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tularemia;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage#getTularemiaTherapeuticRegimenAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.3.48' constraints.validation.error='TularemiaTherapeuticRegimenActTemplateId' constraints.validation.warning='TularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration' constraints.validation.info='TularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration'"
 * @generated
 */
public interface TularemiaTherapeuticRegimenAct extends TherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentGivenSubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentGivenSubstanceAdministration)'"
	 * @generated
	 */
	EList<TularemiaTreatmentGivenSubstanceAdministration> getTularemiaTreatmentGivenSubstanceAdministrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)).oclAsType(tularemia::TularemiaTreatmentNotGivenSubstanceAdministration)'"
	 * @generated
	 */
	EList<TularemiaTreatmentNotGivenSubstanceAdministration> getTularemiaTreatmentNotGivenSubstanceAdministrations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaTherapeuticRegimenAct init();
} // TularemiaTherapeuticRegimenAct
