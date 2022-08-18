package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.Collection;

import javax.persistence.EntityManager;

import org.cyk.utility.persistence.SpecificPersistence;

public interface ActPersistence extends SpecificPersistence<Act> {

	Collection<String> readIdentifiersWhereNotExistByOperationIdentifier(String operationIdentifier);
	
	void lock(String identifier,String lockType,String targetTable);
	void lock(String identifier,String lockType,String targetTable,EntityManager entityManager);
	
	void unlock(String identifier,String lockType,String targetTable);
	void unlock(String identifier,String lockType,String targetTable,EntityManager entityManager);
}