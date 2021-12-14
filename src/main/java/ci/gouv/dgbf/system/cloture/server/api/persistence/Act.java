package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Act extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	ActType getType();
	Act setType(ActType type);
	
	String getReference();
	Act setReference(String trigger);
	
	ActOperationType getOperationType();
	Act setOperationType(ActOperationType operationType);
	/*
	LocalDateTime getOperationDate();
	Act setOperationDate(LocalDateTime date);
	*/
	String getOperationDateString();
	Act setOperationDateString(String string);
	
	String getTrigger();
	Act setTrigger(String trigger);
}