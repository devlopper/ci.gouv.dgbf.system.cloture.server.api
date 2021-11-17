package ci.gouv.dgbf.system.cloture.server.api.business;

import javax.transaction.Transactional;

import org.cyk.utility.business.SpecificBusiness;

import ci.gouv.dgbf.system.cloture.server.api.persistence.Operation;

public interface OperationBusiness extends SpecificBusiness<Operation> {

	@Transactional
	void execute(String identifier,String trigger);
}