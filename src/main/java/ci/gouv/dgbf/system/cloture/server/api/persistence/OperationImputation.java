package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface OperationImputation extends IdentifiableSystemScalarString {
	
	Operation getOperation();
	OperationImputation setOperation(Operation operation);
	
	Imputation getImputation();
	OperationImputation setImputation(Imputation imputation);
	
	Boolean getProcessed();
	OperationImputation setProcessed(Boolean processed);
}