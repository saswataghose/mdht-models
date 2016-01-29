/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusOrganizer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId ResultOrganizerCode ResultOrganizerStatusCode ResultOrganizerStatusCodeP FunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919 FunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921' templateId.root='2.16.840.1.113883.10.20.22.4.66' templateId.extension='2014-06-09' constraints.validation.warning='ResultOrganizerCodeValue FunctionalStatusOrganizer2AuthorParticipation' statusCode.code='completed' constraints.validation.dependOn.ResultOrganizerStatusCode='ResultOrganizerStatusCodeP' constraints.validation.query='FunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919 FunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationship constraints.validation.error='FunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationship constraints.validation.error='FunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921'"
 * @generated
 */
public interface FunctionalStatusOrganizer2 extends FunctionalStatusResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateFunctionalStatusOrganizer2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusOrganizer2FunctionalStatusObservation2EntryRelationshipFunctionalStatusObservation2919(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)))'"
	 * @generated
	 */
	boolean validateFunctionalStatusOrganizer2SelfCareActivitiesEntryRelationshipSelfCareActivities921(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusOrganizer2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public FunctionalStatusOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusOrganizer2
