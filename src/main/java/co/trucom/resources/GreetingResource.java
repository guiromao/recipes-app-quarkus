package co.trucom.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.trucom.models.Recipe;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Recipe hello() {
    	return new Recipe("Bacalhau com grão", "Mix the cod and the grains", 300);
    }
}