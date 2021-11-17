package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(OperationGroupService.PATH)
@Tag(name = "Groupes d'opérations",description = "Gestion des groupes d'opérations")
public interface OperationGroupService extends org.cyk.utility.service.SpecificService<OperationGroupDto> {
	String PATH = "groupes-operations";
}