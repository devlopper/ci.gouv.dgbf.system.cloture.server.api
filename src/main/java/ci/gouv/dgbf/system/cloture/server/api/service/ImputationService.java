package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ImputationService.PATH)
@Tag(name = "Imputations")
public interface ImputationService extends org.cyk.utility.service.SpecificService<ImputationDto> {
	String PATH = "imputations";
	
}