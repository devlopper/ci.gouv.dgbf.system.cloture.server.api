package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.SpecificPersistence;

public interface OperationPersistence extends SpecificPersistence<Operation> {

	void executeProcedure(String name);
}