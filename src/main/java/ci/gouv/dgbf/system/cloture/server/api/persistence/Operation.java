package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;
import org.cyk.utility.persistence.entity.audit.AuditedAction;

public interface Operation extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	OperationType getType();
	Operation setType(OperationType type);
	
	String getReason();
	Operation setReason(String reason);
	
	@Override
	Operation setCode(String code);
	
	@Override
	Operation setName(String name);
	
	AuditedAction getCreation();
	Operation setCreation(AuditedAction creation);
	
	AuditedAction getExecution();
	Operation setExecution(AuditedAction execution);
	
	String NAME = "Opération";
	String NAME_PLURAL = NAME+"s";
}