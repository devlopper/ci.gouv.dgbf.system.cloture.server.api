package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import ci.gouv.dgbf.system.cloture.server.api.persistence.ActOperationType;

public interface ActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	ActOperationType getOperationType();
	String getTrigger();	
	String getOperationDateString();
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_OPERATION_TYPE = "operation";
	String JSON_TRIGGER = "operation_declencheur";
	String JSON_OPERATION_DATE_STRING = "operation_date";
}