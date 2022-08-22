package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(OperationTypeService.PATH)
@Tag(name = "Types Opérations",description = "Gestion des types d'opérations")
public interface OperationTypeService extends org.cyk.utility.service.SpecificService<OperationTypeDto> {
	String PATH = "types-operations";
	
}