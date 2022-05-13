package br.com.openfeign.service;

import br.com.openfeign.client.ProfileOperacaoClient;
import br.com.openfeign.dto.OperacaoDTO;
import br.com.openfeign.dto.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileOperacaoService {

    @Autowired
    private ProfileOperacaoClient profileOperacaoClient;

    public List<ProfileDTO> getProfiles(){
        return profileOperacaoClient.getProfiles();
    }

    public List<OperacaoDTO> getOperacoes(){
        return profileOperacaoClient.getOperacoes();
    }
}
