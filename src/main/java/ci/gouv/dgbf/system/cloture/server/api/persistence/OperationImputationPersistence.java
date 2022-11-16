package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.Collection;

import org.cyk.utility.persistence.SpecificPersistence;

public interface OperationImputationPersistence extends SpecificPersistence<OperationImputation> {

	Collection<OperationImputation> readByOperationIdentifierByNotImputationsIdentifiers(String operationIdentifier,Collection<String> imputationsIdentifiers);
	Collection<OperationImputation> readByOperationIdentifier(String operationIdentifier);
	
}