package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface OperationDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getGroupIdentifier();
	OperationDto setGroupIdentifier(String groupIdentifier);
	
	Long getEndDateNumberOfMillisecond();
	OperationDto setEndDateNumberOfMillisecond(Long endDateNumberOfMillisecond);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_GROUP_IDENTIFIER = "groupe_identifiant";
	String JSON_END_DATE_NUMBER_OF_MILLISECOND = "date_fin_nombre_milliseconde";
}