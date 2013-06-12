/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>First Unit On Scene</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirstUnitOnSceneOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FirstUnitOnSceneOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateFirstUnitOnSceneTemplateId(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneTemplateId(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.85')";

	/**
	* The cached OCL invariant for the '{@link #validateFirstUnitOnSceneTemplateId(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneTemplateId(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param firstUnitOnScene The receiving '<em><b>First Unit On Scene</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFirstUnitOnSceneTemplateId(FirstUnitOnScene firstUnitOnScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE);
			try {
				VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitOnScene)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_ON_SCENE__FIRST_UNIT_ON_SCENE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("FirstUnitOnSceneTemplateId"), new Object[] { firstUnitOnScene }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFirstUnitOnSceneCodeP(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneCodeP(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateFirstUnitOnSceneCodeP(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneCodeP(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param firstUnitOnScene The receiving '<em><b>First Unit On Scene</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFirstUnitOnSceneCodeP(FirstUnitOnScene firstUnitOnScene, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE);
			try {
				VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitOnScene)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_ON_SCENE__FIRST_UNIT_ON_SCENE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("FirstUnitOnSceneCodeP"), new Object[] { firstUnitOnScene }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnSceneCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnSceneCodeP", passToken);
				}
				passToken.add(firstUnitOnScene);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFirstUnitOnSceneCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67481-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateFirstUnitOnSceneCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param firstUnitOnScene The receiving '<em><b>First Unit On Scene</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFirstUnitOnSceneCode(FirstUnitOnScene firstUnitOnScene, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnSceneCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(firstUnitOnScene)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE);
			try {
				VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitOnScene)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_ON_SCENE__FIRST_UNIT_ON_SCENE_CODE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitOnSceneCode"), new Object[] { firstUnitOnScene }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFirstUnitOnSceneValue(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneValue(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ST)))";

	/**
	* The cached OCL invariant for the '{@link #validateFirstUnitOnSceneValue(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneValue(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param firstUnitOnScene The receiving '<em><b>First Unit On Scene</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFirstUnitOnSceneValue(FirstUnitOnScene firstUnitOnScene, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE);
			try {
				VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitOnScene)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_ON_SCENE__FIRST_UNIT_ON_SCENE_VALUE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitOnSceneValue"), new Object[] { firstUnitOnScene }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFirstUnitOnSceneMoodCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneMoodCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateFirstUnitOnSceneMoodCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFirstUnitOnSceneMoodCode(FirstUnitOnScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param firstUnitOnScene The receiving '<em><b>First Unit On Scene</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFirstUnitOnSceneMoodCode(FirstUnitOnScene firstUnitOnScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.FIRST_UNIT_ON_SCENE);
			try {
				VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			firstUnitOnScene)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.FIRST_UNIT_ON_SCENE__FIRST_UNIT_ON_SCENE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("FirstUnitOnSceneMoodCode"), new Object[] { firstUnitOnScene }));
			}

			return false;
		}
		return true;
	}

} // FirstUnitOnSceneOperations
