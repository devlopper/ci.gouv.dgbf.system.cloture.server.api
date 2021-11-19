package ci.gouv.dgbf.system.cloture.server.api.service;

import java.util.List;

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

@Path(ActService.PATH)
@Tag(name = "Actes",description = "Gestions des actes")
public interface ActService extends org.cyk.utility.service.SpecificService<ActDto> {
	String PATH = "actes";
	/*
	@POST
	@Path("verouillage")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Vérouiller une liste d'actes")
	@APIResponses(value = {
			@APIResponse(description = "Une liste d'actes vérouillés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du vérouillage d'une liste d'actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response lock(
			@Parameter(name = ActDto.JSON_IDENTIFIER,description = "Identifiant")
			@QueryParam(ActDto.JSON_IDENTIFIER) List<String> identifiers
			
			,@Parameter(name = ActDto.JSON_TRIGGER,description = "Déclencheur")
			@QueryParam(ActDto.JSON_TRIGGER) String trigger);
	
	@POST
	@Path("deverouillage")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Dévérouiller une liste d'actes")
	@APIResponses(value = {
			@APIResponse(description = "Une liste d'actes dévérouillés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du dévérouillage d'une liste d'actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response unlock(
			@Parameter(name = ActDto.JSON_IDENTIFIER,description = "Identifiant")
			@QueryParam(ActDto.JSON_IDENTIFIER) List<String> identifiers
			
			,@Parameter(name = ActDto.JSON_TRIGGER,description = "Déclencheur")
			@QueryParam(ActDto.JSON_TRIGGER) String trigger);
	*/
}