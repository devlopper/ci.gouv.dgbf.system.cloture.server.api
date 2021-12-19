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
	
	@POST
	@Path("verouillage")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Verouiller une liste d'actes")
	@APIResponses(value = {
			@APIResponse(description = "Une liste d'actes verouillés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du verouillage d'une liste d'actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response lock(
			@Parameter(name = "identifiants",description = "Identifiants")
			@QueryParam("identifiants") List<String> identifiers
			
			,@Parameter(name = ActDto.JSON_TRIGGER,description = "Déclencheur")
			@QueryParam(ActDto.JSON_TRIGGER) String trigger);
	
	@POST
	@Path("deverouillage")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Déverouiller une liste d'actes")
	@APIResponses(value = {
			@APIResponse(description = "Une liste d'actes déverouillés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du déverouillage d'une liste d'actes",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response unlock(
			@Parameter(name = "identifiants",description = "Identifiants")
			@QueryParam("identifiants") List<String> identifiers
			
			,@Parameter(name = ActDto.JSON_TRIGGER,description = "Déclencheur")
			@QueryParam(ActDto.JSON_TRIGGER) String trigger
			
			,@Parameter(name = ActDto.JSON_PROCESSED_IGNORABLE,description = "Ne pas traiter les actes déja déverouillés")
			@QueryParam(ActDto.JSON_PROCESSED_IGNORABLE) Boolean processedIgnorable);
}