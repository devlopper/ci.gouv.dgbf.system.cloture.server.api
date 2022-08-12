package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ScriptPersistence extends SpecificPersistence<Script> {

	void executeProcedure(String name);
}