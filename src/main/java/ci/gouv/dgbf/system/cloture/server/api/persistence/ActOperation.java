package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface ActOperation extends IdentifiableSystemScalarString {
	
	String getActIdentifier();
	ActOperation setActIdentifier(String actIdentifier);
	
	Act getAct();
	ActOperation setAct(Act act);
	
	ActOperationType getOperationType();
	ActOperation setOperationType(ActOperationType operationType);
	
	String getTrigger();
	ActOperation setTrigger(String trigger);
	
	LocalDateTime getOperationDate();
	ActOperation setOperationDate(LocalDateTime date);
	
	String getOperationDateString();
	ActOperation setOperationDateString(String string);
}