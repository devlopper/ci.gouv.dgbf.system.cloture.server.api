package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Operation extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	OperationGroup getGroup();
	Operation setGroup(Operation group);
	
	String getGroupIdentifier();
	Operation setGroupIdentifier(String groupIdentifier);
	
	LocalDateTime getEndDate();
	Operation setEndDate(LocalDateTime endDate);
	
	/* Execution */
	
	String getTrigger();
	Operation setTrigger(String trigger);
	
	LocalDateTime getExecutionBeginDate();
	Operation setExecutionBeginDate(LocalDateTime executionBeginDate);
	
	LocalDateTime getExecutionEndDate();
	Operation setExecutionEndDate(LocalDateTime executionEndDate);
}