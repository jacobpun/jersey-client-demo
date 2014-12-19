package org.punnoose.jersey.client;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.junit.Test;

public class ActivitySearchClientTest {

	
	@Test
	public void testActivitySerarch() {		
		ActivitySearchClient client = new ActivitySearchClient();
		List<String> searchVals = new ArrayList<String>();
		searchVals.add("swimming");
		searchVals.add("running");
		Collection<HashMap<String, Object>> resp = client.search("description", searchVals);
		
		//assertThat(resp.getStatus(), is(200));		
		assertThat(resp.size(), is(0));
		
	}
}