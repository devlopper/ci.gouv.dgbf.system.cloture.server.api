package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ActService.PATH)
@Tag(name = "Actes")
public interface ActService extends org.cyk.utility.service.SpecificService<ActDto> {
	String PATH = "actes";
	
}