package ci.gouv.dgbf.system.cloture.server.api.service;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface ImputationDto extends IdentifiableSystemScalarString {

	String JSON_IDENTIFIER = "identifiant";
	String JSON_EXERCISE_AS_STRING = "exercice_chaine";
	String JSON_ACTIVITY_AS_STRING = "activite_chaine";
	String JSON_ECONOMIC_NATURE_AS_STRING = "nature_economique_chaine";
	
	String JSONS_AS_STRING = "_chaine";
}