package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface OperationData extends IdentifiableSystemScalarString {
	
	Operation getOperation();
	OperationData setOperation(Operation operation);
	
	Boolean getProcessed();
	OperationData setProcessed(Boolean processed);
}