package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(OperationStatusService.PATH)
@Tag(name = "Statuts Opérations",description = "Gestion des statuts d'opérations")
public interface OperationStatusService extends org.cyk.utility.service.SpecificService<OperationStatusDto> {
	String PATH = "statuts-operations";
	
}