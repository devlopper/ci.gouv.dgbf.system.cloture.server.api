package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import ci.gouv.dgbf.system.cloture.server.api.persistence.OperationExecutionStatus;

public interface OperationDto extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String getGroupIdentifier();
	OperationDto setGroupIdentifier(String groupIdentifier);
	
	String getTrigger();
	OperationDto setTrigger(String trigger);
	
	String getProcedureName();
	OperationDto setProcedureName(String procedureName);
	
	Long getStartDateNumberOfMillisecond();
	OperationDto setStartDateNumberOfMillisecond(Long startDateNumberOfMillisecond);
	String getStartDateString();
	
	Long getExecutionBeginDateNumberOfMillisecond();
	OperationDto setExecutionBeginDateNumberOfMillisecond(Long executionBeginDateNumberOfMillisecond);
	String getExecutionBeginDateString();
	
	Long getExecutionEndDateNumberOfMillisecond();
	OperationDto setExecutionEndDateNumberOfMillisecond(Long executionEndDateNumberOfMillisecond);
	String getExecutionEndDateString();
	
	OperationExecutionStatus getExecutionStatus();
	OperationDto setExecutionStatus(OperationExecutionStatus executionStatus);
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_CODE = "code";
	String JSON_NAME = "libelle";
	String JSON_GROUP = "groupe";
	String JSON_GROUP_IDENTIFIER = "groupe_identifiant";
	String JSON_START_DATE_NUMBER_OF_MILLISECOND = "date_debut_nombre_milliseconde";
	String JSON_START_DATE_STRING = "date_debut_chaine";
	String JSON_PROCEDURE_NAME = "procedure_nom";
	String JSON_TRIGGER = "declencheur";
	String JSON_EXECUTION_BEGIN_DATE_NUMBER_OF_MILLISECOND = "execution_date_debut_nombre_milliseconde";
	String JSON_EXECUTION_BEGIN_DATE_STRING = "execution_date_debut_chaine";
	String JSON_EXECUTION_END_DATE_NUMBER_OF_MILLISECOND = "execution_date_fin_nombre_milliseconde";
	String JSON_EXECUTION_END_DATE_STRING = "execution_date_fin_chaine";
	String JSON_EXECUTION_STATUS = "execution_status";
}