package ci.gouv.dgbf.system.cloture.server.api.persistence;

import java.util.List;

import org.cyk.utility.__kernel__.string.StringHelper;
import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

public interface Imputation extends IdentifiableSystemScalarString {
	
	String getExerciseIdentifier();
	Imputation setExerciseIdentifier(String exerciseIdentifier);
	
	Short getExerciseYear();
	Imputation setExerciseYear(Short exerciseYear);
	
	String getActivityIdentifier();
	Imputation setActivityIdentifier(String activityIdentifier);
	
	String getEconomicNatureIdentifier();
	Imputation setEconomicNatureIdentifier(String economicNatureIdentifier);
	
	String getReference();
	Imputation setReference(String reference);
	
	String NAME = "Imputation";
	String NAME_PLURAL = "Imputations";
	
	String SEARCH_LABEL = "Recherche";
	String SEARCH_PLACEHOLDER = StringHelper.concatenate(List.of("<Code activité> <Code nature économique> <Année>"), " | ");
}