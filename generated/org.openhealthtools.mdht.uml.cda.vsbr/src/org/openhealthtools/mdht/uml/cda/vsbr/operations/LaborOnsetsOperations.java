/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Labor Onsets</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborOnsetsOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborOnsetsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborOnsetsTemplateId(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsTemplateId(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.23')";

  /**
   * The cached OCL invariant for the '{@link #validateLaborOnsetsTemplateId(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsTemplateId(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.23')
   * @param laborOnsets The receiving '<em><b>Labor Onsets</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborOnsetsTemplateId(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABOR_ONSETS);
      try
      {
        VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborOnsets))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABOR_ONSETS__LABOR_ONSETS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborOnsetsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborOnsets, context) }),
             new Object [] { laborOnsets }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborOnsetsClassCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsClassCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateLaborOnsetsClassCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsClassCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param laborOnsets The receiving '<em><b>Labor Onsets</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborOnsetsClassCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABOR_ONSETS);
      try
      {
        VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborOnsets))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABOR_ONSETS__LABOR_ONSETS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborOnsetsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborOnsets, context) }),
             new Object [] { laborOnsets }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborOnsetsCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateLaborOnsetsCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param laborOnsets The receiving '<em><b>Labor Onsets</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborOnsetsCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABOR_ONSETS);
      try
      {
        VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborOnsets))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABOR_ONSETS__LABOR_ONSETS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborOnsetsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborOnsets, context) }),
             new Object [] { laborOnsets }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborOnsetsMoodCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsMoodCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateLaborOnsetsMoodCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsMoodCode(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param laborOnsets The receiving '<em><b>Labor Onsets</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborOnsetsMoodCode(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABOR_ONSETS);
      try
      {
        VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborOnsets))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABOR_ONSETS__LABOR_ONSETS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborOnsetsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborOnsets, context) }),
             new Object [] { laborOnsets }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateLaborOnsetsValue(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsValue(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateLaborOnsetsValue(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateLaborOnsetsValue(LaborOnsets, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param laborOnsets The receiving '<em><b>Labor Onsets</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateLaborOnsetsValue(LaborOnsets laborOnsets, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABOR_ONSETS);
      try
      {
        VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborOnsets))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABOR_ONSETS__LABOR_ONSETS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborOnsetsValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborOnsets, context) }),
             new Object [] { laborOnsets }));
      }
       
      return false;
    }
    return true;
  }

} // LaborOnsetsOperations