package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ActPersistence extends SpecificPersistence<Act> {

	void lock(String identifier);
	
	void unlock(String identifier);
}