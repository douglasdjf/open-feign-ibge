package br.com.openfeign.service;


import br.com.openfeign.client.IBGELocalidadesClient;
import br.com.openfeign.dto.UfDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UfService {

    @Autowired
    private IBGELocalidadesClient ibgepPaisesClient;

    public List<UfDTO> getUfs(){
        return ibgepPaisesClient.getUfs();
    }

    public UfDTO getUfPorId(Long id){
        return ibgepPaisesClient.getUfPorId(id);
    }
}
