package ci.gouv.dgbf.system.cloture.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

public interface Exercise extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {
	
	Short getYear();
	Exercise setYear(Short year);
	
	String NAME = "Exercice";
	String NAME_PLURAL = "Exercices";
}