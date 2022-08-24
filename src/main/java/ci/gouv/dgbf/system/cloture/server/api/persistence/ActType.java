package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface ActType extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String NAME = "Type d'acte";
	String NAME_PLURAL = "Types d'actes";
	
	String CODE_ENGAGEMENT = "ENGAGEMENT";
}