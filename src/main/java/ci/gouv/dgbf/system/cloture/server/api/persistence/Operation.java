package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Operation extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	OperationType getType();
	Operation setType(OperationType type);
	
	String getReason();
	Operation setReason(String reason);
	
	@Override
	Operation setCode(String code);
	
	@Override
	Operation setName(String name);
	
	String NAME = "Opération";
	String NAME_PLURAL = NAME+"s";
}