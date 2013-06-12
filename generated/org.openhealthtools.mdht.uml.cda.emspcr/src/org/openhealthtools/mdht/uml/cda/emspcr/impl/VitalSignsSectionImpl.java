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

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl implements
		VitalSignsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected VitalSignsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.VITAL_SIGNS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionVitalSignsOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionVitalSignsOrganizer(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionPriorAidVitals(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionPriorAidVitals(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEmspcrVitalSignsSectionAdditionalVitalSignsOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateEmspcrVitalSignsSectionAdditionalVitalSignsOrganizer(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VitalSignsOrganizer getemspcrVitalSignsOrganizer() {
		return VitalSignsSectionOperations.getemspcrVitalSignsOrganizer(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PriorAidVitals getPriorAidVitals() {
		return VitalSignsSectionOperations.getPriorAidVitals(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AdditionalVitalSignsOrganizer getAdditionalVitalSignsOrganizer() {
		return VitalSignsSectionOperations.getAdditionalVitalSignsOrganizer(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateVitalSignsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsSectionOperations.validateVitalSignsSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public VitalSignsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignsSectionImpl
