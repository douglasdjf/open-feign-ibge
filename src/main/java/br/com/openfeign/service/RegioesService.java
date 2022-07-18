package br.com.openfeign.service;

import br.com.openfeign.client.IBGELocalidadesClient;
import br.com.openfeign.dto.RegiaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegioesService {

    @Autowired
    private IBGELocalidadesClient ibgeLocalidadesClient;

    public List<RegiaoDTO> getRegioes(){
        return ibgeLocalidadesClient.gerRegioes();
    }
}
