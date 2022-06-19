package com.maxprogramer.api.satelites.services;

import com.maxprogramer.api.satelites.dto.SateliteDto;
import com.maxprogramer.api.satelites.model.SateliteModel;
import com.maxprogramer.api.satelites.repository.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SateliteService {

    @Autowired
    SateliteRepository sateliteRepository;

    public void importarSatelite() {
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        SateliteDto sateliteDto = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544", SateliteDto.class);

        save(sateliteDto);
    }

    public void save(SateliteDto sateliteDto) {

        SateliteModel possivelSateliteModel = sateliteDto.novoSatelite();

        SateliteModel recebidoSateliteDto = sateliteRepository.findSateliteModelById(possivelSateliteModel.getId());

        if (recebidoSateliteDto == null) {
            sateliteRepository.save(possivelSateliteModel);
        }
    }
}
