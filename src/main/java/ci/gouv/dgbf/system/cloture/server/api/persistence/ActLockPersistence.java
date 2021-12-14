package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.Collection;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ActLockPersistence extends SpecificPersistence<ActLock> {

	Collection<Object[]> readWhereEnabledIsTrueByActIdentifiersForOperation(Collection<String> actIdentifiers);
	
}