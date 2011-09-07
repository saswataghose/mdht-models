/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.RespiratorySystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Respiratory System Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RespiratorySystemSectionImpl extends SectionImpl implements RespiratorySystemSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespiratorySystemSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.RESPIRATORY_SYSTEM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratorySystemSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratorySystemSectionOperations.validateRespiratorySystemSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratorySystemSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratorySystemSectionOperations.validateRespiratorySystemSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespiratorySystemSectionProblemEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RespiratorySystemSectionOperations.validateRespiratorySystemSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry getProblemEntry() {
		return RespiratorySystemSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespiratorySystemSection init() {
		CDAUtil.init(this);
		return this;
	}
} // RespiratorySystemSectionImpl
