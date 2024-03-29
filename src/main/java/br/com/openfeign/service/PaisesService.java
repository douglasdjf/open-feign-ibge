package br.com.openfeign.service;

import br.com.openfeign.client.IBGELocalidadesClient;
import br.com.openfeign.dto.PaisesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisesService {

    @Autowired
    private IBGELocalidadesClient ibgepPaisesClient;

    public List<PaisesDTO> getPaises(){
        return ibgepPaisesClient.getPaises();
    }
}
