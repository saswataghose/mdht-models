/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EncountersSectionEntriesOptional2Impl extends EncountersSectionEntriesOptionalImpl implements
		EncountersSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionEntriesOptional2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionEntriesOptional2Entry1060(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptional2Entry1060(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptional2EncounterActivity2EntryEncounterActivity21061(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncountersSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncountersSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncountersSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionEntriesOptional2Operations.validateEncountersSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionEntriesOptional2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EncountersSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EncountersSectionEntriesOptional2Impl
