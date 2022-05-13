package br.com.openfeign.service;

import br.com.openfeign.client.IBGEPPaisesClient;
import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.dto.PaisesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class MunicipioService {

    @Autowired
    private IBGEPPaisesClient ibgepPaisesClient;

    //  private final IBGEPPaisesClient ibgepPaisesClient;

    public List<MunicipioDTO> getMunicipios(){
        return ibgepPaisesClient.getMunicipios();
    }
}
