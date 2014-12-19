package org.punnoose.jersey.client;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class ActivitySearchClient {
	private Client client;
	private String baseUri = "http://localhost:8080/exercise-service-multimodule-web/rest";

	public ActivitySearchClient() {
		client = ClientBuilder.newClient();
	}

	public Collection<HashMap<String, Object>> search(String param, List<String> searchValues) {
		URI uri = UriBuilder.fromUri(baseUri)
				.path("activities")
				.queryParam(param, searchValues)
				.build();
		
		WebTarget target = client.target(uri);

		return target.request(MediaType.APPLICATION_JSON).get(new GenericType<Collection<HashMap<String, Object>>>(){});
	}
}