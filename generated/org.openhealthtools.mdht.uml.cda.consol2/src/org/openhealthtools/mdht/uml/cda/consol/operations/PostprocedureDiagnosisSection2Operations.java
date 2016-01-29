/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSection2Entry1142(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Entry1142</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Postprocedure Diagnosis2 Entry Postprocedure Diagnosis21143</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostprocedureDiagnosisSection2Operations extends PostprocedureDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostprocedureDiagnosisSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSection2Entry1142(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Entry1142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSection2Entry1142(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSection2Entry1142(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Entry1142</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSection2Entry1142(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosisSection2 The receiving '<em><b>Postprocedure Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePostprocedureDiagnosisSection2Entry1142(PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION2__POSTPROCEDURE_DIAGNOSIS_SECTION2_ENTRY1142,
						 ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSection2PostprocedureDiagnosisSection2Entry1142"),
						 new Object [] { postprocedureDiagnosisSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Postprocedure Diagnosis2 Entry Postprocedure Diagnosis21143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section2 Postprocedure Diagnosis2 Entry Postprocedure Diagnosis21143</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosisSection2 The receiving '<em><b>Postprocedure Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validatePostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143(PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(postprocedureDiagnosisSection2);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION2__POSTPROCEDURE_DIAGNOSIS_SECTION2_POSTPROCEDURE_DIAGNOSIS2_ENTRY_POSTPROCEDURE_DIAGNOSIS21143,
						 ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSection2PostprocedureDiagnosisSection2PostprocedureDiagnosis2EntryPostprocedureDiagnosis21143"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.36' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionTemplateId(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosisSection2 The receiving '<em><b>Postprocedure Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisSectionTemplateId(
			PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION2__POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSection2PostprocedureDiagnosisSectionTemplateId"),
						 new Object [] { postprocedureDiagnosisSection2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionCodeP(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCodeP(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionCodeP(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCodeP(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosisSection2 The receiving '<em><b>Postprocedure Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisSectionCodeP(
			PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION2__POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSection2PostprocedureDiagnosisSectionCodeP"),
						 new Object [] { postprocedureDiagnosisSection2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSectionCodeP", passToken);
				}
				passToken.add(postprocedureDiagnosisSection2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '59769-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostprocedureDiagnosisSectionCode(PostprocedureDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param postprocedureDiagnosisSection2 The receiving '<em><b>Postprocedure Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePostprocedureDiagnosisSectionCode(
			PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(postprocedureDiagnosisSection2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(postprocedureDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.POSTPROCEDURE_DIAGNOSIS_SECTION2__POSTPROCEDURE_DIAGNOSIS_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("PostprocedureDiagnosisSection2PostprocedureDiagnosisSectionCode"),
						 new Object [] { postprocedureDiagnosisSection2 }));
			}
			 
			return false;
		}
		return true;
	}

} // PostprocedureDiagnosisSection2Operations
