package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ActTypeService.PATH)
@Tag(name = "Types Actes",description = "Gestion des types d'actes")
public interface ActTypeService extends org.cyk.utility.service.SpecificService<ActTypeDto> {
	String PATH = "types-actes";
	
}