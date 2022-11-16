package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ActivityService.PATH)
@Tag(name = "Activités")
public interface ActivityService extends org.cyk.utility.service.SpecificService<ActivityDto> {
	String PATH = "activites";
	
}