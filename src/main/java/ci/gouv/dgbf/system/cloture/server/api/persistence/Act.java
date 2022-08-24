package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.List;

import org.cyk.utility.__kernel__.string.StringHelper;
import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Act extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	ActType getType();
	Act setType(ActType type);
	
	String NAME = "Acte";
	String NAME_PLURAL = "Actes";
	
	String CODES_LABEL = "Numéros";
	String SEARCH_LABEL = "Recherche";
	String SEARCH_PLACEHOLDER = StringHelper.concatenate(List.of("Numéro","Libellé"), " | ");
}