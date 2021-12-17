package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ActLockService.PATH)
@Tag(name = "Verrous",description = "Gestions des verrous")
public interface ActLockService extends org.cyk.utility.service.SpecificService<ActLockDto> {
	String PATH = "verrous";
	
}