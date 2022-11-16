package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ExerciseService.PATH)
@Tag(name = "Exercices")
public interface ExerciseService extends org.cyk.utility.service.SpecificService<ExerciseDto> {
	String PATH = "exercices";
	
}