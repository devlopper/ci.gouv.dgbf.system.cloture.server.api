package ci.gouv.dgbf.system.cloture.server.api.business;

import org.cyk.utility.business.Result;
import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Operation;

public interface OperationBusiness extends SpecificBusiness<Operation> {

	String CREATE_AUDIT_IDENTIFIER = "CREATION_OPERATION";
	Result create(String typeIdentifier,String code,String name,String reason,String auditWho);
	
}