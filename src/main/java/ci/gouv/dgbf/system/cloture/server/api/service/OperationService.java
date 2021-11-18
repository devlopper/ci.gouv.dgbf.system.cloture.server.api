package ci.gouv.dgbf.system.cloture.server.api.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(OperationService.PATH)
@Tag(name = "Opérations",description = "Gestion des opérations")
public interface OperationService extends org.cyk.utility.service.SpecificService<OperationDto> {
	String PATH = "operations";
	
	@POST
	@Path("execution")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Exécuter une opération")
	@APIResponses(value = {
			@APIResponse(description = "Une opération exécutée",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'exécution d'une opération",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response execute(
		@Parameter(name = OperationDto.JSON_IDENTIFIER,description = "Identifiant")
		@QueryParam(OperationDto.JSON_IDENTIFIER) String identifier
		
		,@Parameter(name = OperationDto.JSON_TRIGGER,description = "Déclencheur")
		@QueryParam(OperationDto.JSON_TRIGGER) String trigger
		
		,@Parameter(name = PARAMETER_NAME_BLOCKING,description = "Bloquant")
		@QueryParam(PARAMETER_NAME_BLOCKING) Boolean blocking
	);
	/*
	@GET
	@Path("status")
	@Produces({MediaType.TEXT_PLAIN})
	@Operation(description = "Obtenir le status d'exécution d'une opération")
	@APIResponses(value = {
			@APIResponse(description = "Le status d'exécution d'une opération obtenue",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'obtention du status d'exécution d'une opération",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response getStatus(
		@Parameter(name = PARAMETER_NAME_IDENTIFIER,description = PARAMETER_NAME_IDENTIFIER_DESCRIPTION_FRENCH)
		@QueryParam(PARAMETER_NAME_IDENTIFIER) String identifier
	);
	*/
	
	String PARAMETER_NAME_BLOCKING = "bloquant";
}