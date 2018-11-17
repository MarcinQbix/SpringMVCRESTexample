package sda.pl.usersviewer.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@Component
public class ReqresSampleUserDataConnector {

    private static final String REQRES_URL="https://reqres.in/api/users";
    private final RestTemplate restTemplate;
    @Autowired
    public ReqresSampleUserDataConnector(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ReqresSampleUsersDataResponse connect(Integer page, Integer perPage){

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(REQRES_URL)
                .queryParam("page", page)
                .queryParam("per_page", perPage);


        return restTemplate.getForObject( builder.toUriString(),ReqresSampleUsersDataResponse.class,new HashMap<>());
    }


}
