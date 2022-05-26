package com.maxprogramer.api.satelites.services;

import com.maxprogramer.api.satelites.dto.SateliteDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SateliteService {

    public SateliteDto buscaSatelite(){
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate =  restTemplateBuilder.build();

        SateliteDto sateliteDto = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544",
                SateliteDto.class);

        return sateliteDto;
    }
}
