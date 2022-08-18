package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface OperationAct extends IdentifiableSystemScalarString {
	
	Operation getOperation();
	OperationAct setOperation(Operation operation);
	
	Act getAct();
	OperationAct setAct(Act act);
}