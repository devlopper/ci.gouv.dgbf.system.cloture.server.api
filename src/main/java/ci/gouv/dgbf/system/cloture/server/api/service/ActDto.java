package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import ci.gouv.dgbf.system.cloture.server.api.persistence.ActOperationType;
import ci.gouv.dgbf.system.cloture.server.api.persistence.ActType;

public interface ActDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	ActType getType();
	ActOperationType getOperationType();
	String getTrigger();	
	String getOperationDateString();
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_TYPE = "type";
	String JSON_OPERATION_TYPE = "operation";
	String JSON_TRIGGER = "operation_declencheur";
	String JSON_OPERATION_DATE_STRING = "operation_date";
	String JSON_LOCKED = "verouille";
	String JSON_NUMBER_OF_LOCKS = "nombre_verrou";
	String JSON_NUMBER_OF_LOCKS_ENABLED = "nombre_verrou_actif";
	String JSON_STATUS_STRING = "status";
	String JSON_LATEST_OPERATION_STRING = "derniere_operation";
}