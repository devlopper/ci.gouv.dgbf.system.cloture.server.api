package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.List;

import org.cyk.utility.__kernel__.string.StringHelper;
import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Activity extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	String NAME = "Activité";
	String NAME_PLURAL = "Activités";
	
	String CODES_LABEL = "Numéros";
	String SEARCH_LABEL = "Recherche";
	String SEARCH_PLACEHOLDER = StringHelper.concatenate(List.of("Numéro","Libellé"), " | ");
}