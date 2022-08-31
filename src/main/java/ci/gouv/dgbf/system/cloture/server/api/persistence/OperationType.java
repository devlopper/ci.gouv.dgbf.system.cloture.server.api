package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface OperationType extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String NAME = "Type d'opération";
	String NAME_PLURAL = "Types d'opération";
}