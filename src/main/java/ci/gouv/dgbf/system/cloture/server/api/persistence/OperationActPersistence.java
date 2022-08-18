package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.Collection;

import org.cyk.utility.persistence.SpecificPersistence;

public interface OperationActPersistence extends SpecificPersistence<OperationAct> {

	Collection<OperationAct> readByOperationIdentifierByNotActsIdentifiers(String operationIdentifier,Collection<String> actsIdentifiers);
	Collection<OperationAct> readByOperationIdentifier(String operationIdentifier);
	
}