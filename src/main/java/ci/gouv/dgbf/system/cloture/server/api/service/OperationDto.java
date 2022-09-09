package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.Audited;
import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface OperationDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getTypeAsString();
	OperationDto setTypeAsString(String typeAsString);
	
	String getReason();
	OperationDto setReason(String reason);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_TYPE = "type";
	String JSON_TYPE_AS_STRING = JSON_TYPE+"_chaine";
	String JSON_REASON = "motif";
	String JSON_STATUS = "statut";
	String JSON_STATUS_CODE = JSON_STATUS+"_code";
	String JSON_STATUS_AS_STRING = JSON_STATUS+"_chaine";
	String JSON_CREATED = "creee";
	String JSON_STARTED = "demarree";
	String JSON_EXECUTED = "executee";
	String JSON_COLOR = "couleur";
	
	String JSON_TYPE_IDENTIFIER = "type_identifiant";
	String JSON_ACTS_IDENTIFIERS = "actes_identifiants";
	String JSON_EXISTING_IGNORABLE = "ignorer_existant";
	
	String JSON___AUDIT__ = Audited.JSON___AUDIT__;
	String JSONS___AUDITS__ = Audited.JSONS___AUDITS__;
	String JSON___AUDIT_WHO__ = Audited.JSON___AUDIT_WHO__;
	String JSON___AUDIT_FUNCTIONALITY__ = Audited.JSON___AUDIT_FUNCTIONALITY__;
	String JSON___AUDIT_WHAT__ = Audited.JSON___AUDIT_WHAT__;
	String JSON___AUDIT_WHEN__ = Audited.JSON___AUDIT_WHEN__;
	
	String JSONS_STRINGS = "chaines";
	String JSONS_STATUSES = "statuts";
}