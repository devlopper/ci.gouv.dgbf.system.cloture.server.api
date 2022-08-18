package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Act extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	ActType getType();
	Act setType(ActType type);
	
	String NAME = "Acte";
	String NAME_PLURAL = "Actes";
}