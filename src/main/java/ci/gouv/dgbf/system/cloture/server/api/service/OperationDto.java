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
	String JSON_TYPE_AS_STRING = "type_chaine";
	String JSON_REASON = "motif";
	
	String JSON_TYPE_IDENTIFIER = "type_identifiant";
	
	String JSON___AUDIT__ = Audited.JSON___AUDIT__;
	String JSONS___AUDITS__ = Audited.JSONS___AUDITS__;
	String JSON___AUDIT_WHO__ = Audited.JSON___AUDIT_WHO__;
	String JSON___AUDIT_FUNCTIONALITY__ = Audited.JSON___AUDIT_FUNCTIONALITY__;
	String JSON___AUDIT_WHAT__ = Audited.JSON___AUDIT_WHAT__;
	String JSON___AUDIT_WHEN__ = Audited.JSON___AUDIT_WHEN__;
	
	String JSONS_STRINGS = "chaines";
}