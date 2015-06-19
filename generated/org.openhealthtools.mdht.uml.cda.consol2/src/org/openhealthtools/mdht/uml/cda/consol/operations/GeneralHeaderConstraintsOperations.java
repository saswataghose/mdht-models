/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsVersionNumberSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSupportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Day TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Minute TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Second TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM If More Precise Than Day Include Time Zone Offset TS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name US Realm Patient Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient If Sdtc Enforce Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has One Assigned Person Or One Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeIdRoot(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdRoot(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined() and self.typeId.root = '2.16.840.1.113883.1.3'";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeIdRoot(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdRoot(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTypeIdRoot(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTypeIdRoot"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined() and self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTypeIdExtension(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTypeIdExtension"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetIdVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.setId.oclIsUndefined() implies not self.versionNumber.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetIdVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsSetIdVersionNumber(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsSetIdVersionNumber"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsVersionNumberSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumberSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.versionNumber.oclIsUndefined() implies not self.setId.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsVersionNumberSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumberSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsVersionNumberSetId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsVersionNumberSetId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTemplateId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRealmCodeP(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE_P,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRealmCodeP"),
					new Object[] { generalHeaderConstraints }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRealmCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRealmCodeP", passToken);
				}
				passToken.add(generalHeaderConstraints);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (true)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRealmCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(generalHeaderConstraints)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRealmCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTypeId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTitle"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsEffectiveTime"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsConfidentialityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsConfidentialityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsConfidentialityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsConfidentialityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsConfidentialityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsConfidentialityCodeP"),
					new Object[] { generalHeaderConstraints }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsConfidentialityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsConfidentialityCodeP",
						passToken);
				}
				passToken.add(generalHeaderConstraints);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsConfidentialityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsConfidentialityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(generalHeaderConstraints)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsConfidentialityCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "
			+ "not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLanguageCode"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsLanguageCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_P,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLanguageCodeP"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsSetId(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsSetId"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsVersionNumber(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsVersionNumber"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthor(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthor"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEnterer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsDataEnterer(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEnterer"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCustodian(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodian"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInformationRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipient"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsLegalAuthenticator(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticator"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticator(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthenticator(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticator"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTarget"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsComponentOf(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsComponentOf"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInformant(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformant"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSupportParticipant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsSupportParticipant(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsSupportParticipant"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInFulfillmentOf(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInFulfillmentOf"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOf(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsDocumentationOf(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOf"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->exists(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthorization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorization"),
					new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Day TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies (not value.oclIsUndefined() implies value.size() >= 8))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Day TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_DAY_TS,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Minute TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies (not value.oclIsUndefined() implies value.size() >= 12))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Minute TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_MINUTE_TS,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Second TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies (not value.oclIsUndefined() implies value.size() >= 14))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM Precise To The Second TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_PRECISE_TO_THE_SECOND_TS,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM If More Precise Than Day Include Time Zone Offset TS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Date And Time DTM If More Precise Than Day Include Time Zone Offset TS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DTM_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_TS,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressUseP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmAddressUseP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmAddressUseP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and "
			+ "let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in "
			+ "value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmAddressUseP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressCountry(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressCountry(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressCountry(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressCountry(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressCountry(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressState(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressState(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressState(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressState(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressState(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressCity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressCity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressCity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressCity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressCity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressPostalCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressPostalCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressPostalCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressPostalCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressPostalCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name US Realm Patient Name Mixed Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject(getText(true)='')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name US Realm Patient Name Mixed Content</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::EntityNameUse) and "
			+ "let value : vocab::EntityNameUse = element.oclAsType(vocab::EntityNameUse) in "
			+ "value = vocab::EntityNameUse::A or value = vocab::EntityNameUse::ABC or value = vocab::EntityNameUse::ASGN or value = vocab::EntityNameUse::C or value = vocab::EntityNameUse::I or value = vocab::EntityNameUse::IDE or value = vocab::EntityNameUse::L or value = vocab::EntityNameUse::P or value = vocab::EntityNameUse::PHON or value = vocab::EntityNameUse::R or value = vocab::EntityNameUse::SNDX or value = vocab::EntityNameUse::SRCH or value = vocab::EntityNameUse::SYL) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Family</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((family->isEmpty() or family->exists(element | element.isNullFlavorUndefined())) implies (family->size() = 1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Family</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Given</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((given->isEmpty() or given->exists(element | element.isNullFlavorUndefined())) implies (not given->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Given</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((prefix->isEmpty() or prefix->exists(element | element.isNullFlavorUndefined())) implies (not prefix->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Prefix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Suffix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((suffix->isEmpty() or suffix->exists(element | element.isNullFlavorUndefined())) implies (not suffix->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Suffix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 4)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 8)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmPatientNameUseP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).guardianPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((not code.oclIsUndefined()) and code.isNullFlavorUndefined() implies"
			+ "(code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'ADOPT' or value.code = 'AUNT' or value.code = 'CHILD' or value.code = 'CHLDINLAW' or value.code = 'COUSN' or value.code = 'DOMPART' or value.code = 'FAMMEMB' or value.code = 'CHLDFOST' or value.code = 'GRNDCHILD' or value.code = 'GPARNT' or value.code = 'GRPRN' or value.code = 'GGRPRN' or value.code = 'HSIB' or value.code = 'MAUNT' or value.code = 'MCOUSN' or value.code = 'MGRPRN' or value.code = 'MGGRPRN' or value.code = 'MUNCLE' or value.code = 'NCHILD' or value.code = 'NPRN' or value.code = 'NSIB' or value.code = 'NBOR' or value.code = 'NIENEPH' or value.code = 'PRN' or value.code = 'PRNINLAW' or value.code = 'PAUNT' or value.code = 'PCOUSN' or value.code = 'PGRPRN' or value.code = 'PGGRPRN' or value.code = 'PUNCLE' or value.code = 'ROOM' or value.code = 'SIB' or value.code = 'SIBINLAW' or value.code = 'SIGOTHR' or value.code = 'SPS' or value.code = 'STEP' or value.code = 'STPPRN' or value.code = 'STPSIB' or value.code = 'UNCLE' or value.code = 'FRND' or value.code = 'RESPRSN' or value.code = 'EXCEST' or value.code = 'GUADLTM' or value.code = 'GUARD' or value.code = 'POWATT' or value.code = 'DPOWATT' or value.code = 'HPOWATT' or value.code = 'SPOWATT')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null).place->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null)->reject(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in "
			+ "not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined() and modeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined() and proficiencyLevelCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient If Sdtc Enforce Race Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(sDTCRaceCode->notEmpty() implies not raceCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient If Sdtc Enforce Race Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (true))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (true))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (not maritalStatusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (not maritalStatusCode.oclIsUndefined() and maritalStatusCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'P' or value.code = 'S' or value.code = 'T' or value.code = 'W')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (not religiousAffiliationCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (not religiousAffiliationCode.oclIsUndefined() and religiousAffiliationCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined() and raceCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((sDTCRaceCode->isEmpty() or sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (not sDTCRaceCode->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((sDTCRaceCode->isEmpty() or sDTCRaceCode->exists(element | element.isNullFlavorUndefined())) implies (sDTCRaceCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = element.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined() and ethnicGroupCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(providerOrganization->one(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsComponentOfEncompassingEncounterId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has One Assigned Person Or One Assigned Authoring Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(element | not element.oclIsUndefined() implies (element.isNullFlavorDefined() or element->size() = 1) ) xor assignedAuthoringDevice->one(element | not element.oclIsUndefined() implies (element.isNullFlavorDefined() or element->size() = 1) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has One Assigned Person Or One Assigned Authoring Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not assignedPerson.oclIsUndefined() and not id->isEmpty()) implies id->exists(id | (id.isNullFlavorDefined() and id.extension->isEmpty() and id.root->isEmpty()) or (id.isNullFlavorDefined() and id.root='2.16.840.1.113883.4.6') or (id.root='2.16.840.1.113883.4.6' and id.extension->size() = 1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorAssignedAuthorCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthorTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorTime(GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorAssignedAuthor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorAssignedAuthor"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEntererAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDataEntererAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodianAssignedCustodian(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsCustodianAssignedCustodian(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCustodianAssignedCustodian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformationRecipientIntendedRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in " + "value.code = 'S'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorSignatureCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorSignatureCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorSignatureCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorSignatureCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in " + "value.code = 'S'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorSignatureCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthenticatorSignatureCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorSignatureCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthenticatorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityAddr(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantRelatedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantRelatedEntityPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantRelatedEntityPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((not associatedEntity.associatedPerson.oclIsUndefined()) or (not associatedEntity.scopingOrganization.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsParticipantSupportTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsParticipantSupportTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsParticipantSupportTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOfOrderId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInFulfillmentOfOrderId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOfOrder(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsInFulfillmentOfOrder(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsInFulfillmentOfOrder"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.88'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(effectiveTime->forAll(not low.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEventPerformer"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEvent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEvent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOfServiceEvent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOfServiceEvent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorizationConsentCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorizationConsentCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorizationConsentId(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorizationConsentId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorizationConsentStatusCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorizationConsentStatusCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorizationConsentStatusCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null).consent->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsAuthorizationConsentStatusCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorizationConsentStatusCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->excluding(null)->reject(consent->one(consent : cda::Consent | not consent.oclIsUndefined() and consent.oclIsKindOf(cda::Consent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorizationConsent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorizationConsent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsAuthorizationConsent(
			GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT,
						ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsAuthorizationConsent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // GeneralHeaderConstraintsOperations
