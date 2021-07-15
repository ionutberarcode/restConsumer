package com.example.servingwebcontent;

import com.example.servingwebcontent.pojo.Root;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/beers")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Root> getBeer() {
        final String uri = "https://api.punkapi.com/v2/beers/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers=new HttpHeaders();
        headers.add("User-Agent", "My own REST client");
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<List<Root>> responseEntity =
                restTemplate.exchange(
                        uri,
                        HttpMethod.GET,
                        entity,
                        new ParameterizedTypeReference<List<Root>>() {}
                );
        return responseEntity.getBody();
    }
}
