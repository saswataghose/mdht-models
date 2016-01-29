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
 * A representation of the model object '<em><b>Allergies Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergiesSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AllergiesSectionEntriesOptionalTemplateId AllergiesSectionEntriesOptionalCode AllergiesSectionEntriesOptionalCodeP AllergiesSectionEntriesOptional2Entry1188' templateId.root='2.16.840.1.113883.10.20.22.2.6' templateId.extension='2015-08-01' code.code='48765-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Allergies, adverse reactions, alerts' constraints.validation.dependOn.AllergiesSectionEntriesOptionalCode='AllergiesSectionEntriesOptionalCodeP' constraints.validation.warning='AllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189' constraints.validation.query='AllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergiesSectionEntriesOptional2AllergyConcernAct2Entry constraints.validation.warning='AllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189'"
 * @generated
 */
public interface AllergiesSectionEntriesOptional2 extends AllergiesSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateAllergiesSectionEntriesOptional2Entry1188(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->excluding(null)->reject(act->exists(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyConcernAct2)))'"
	 * @generated
	 */
	boolean validateAllergiesSectionEntriesOptional2AllergyConcernAct2EntryAllergyConcernAct21189(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public AllergiesSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergiesSectionEntriesOptional2
