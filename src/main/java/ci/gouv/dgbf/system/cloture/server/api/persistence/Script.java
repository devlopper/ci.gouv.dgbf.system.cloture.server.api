package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.time.LocalDateTime;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Script extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	OperationGroup getGroup();
	Script setGroup(Script group);
	
	String getGroupIdentifier();
	Script setGroupIdentifier(String groupIdentifier);
	
	LocalDateTime getStartDate();
	Script setStartDate(LocalDateTime startDate);
	
	/* Execution */
	
	String getProcedureName();
	Script setProcedureName(String procedureName);
	
	String getTrigger();
	Script setTrigger(String trigger);
	
	LocalDateTime getExecutionBeginDate();
	Script setExecutionBeginDate(LocalDateTime executionBeginDate);
	
	LocalDateTime getExecutionEndDate();
	Script setExecutionEndDate(LocalDateTime executionEndDate);
	
	OperationExecutionStatus getExecutionStatus();
	Script setExecutionStatus(OperationExecutionStatus executionStatus);
}