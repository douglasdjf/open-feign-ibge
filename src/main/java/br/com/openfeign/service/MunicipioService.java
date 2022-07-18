package br.com.openfeign.service;

import br.com.openfeign.client.IBGELocalidadesClient;
import br.com.openfeign.dto.MunicipioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MunicipioService {

    @Autowired
    private IBGELocalidadesClient ibgepPaisesClient;

    public List<MunicipioDTO> getMunicipios(){
        return ibgepPaisesClient.getMunicipios();
    }


    public List<MunicipioDTO> getMunicipiosPoUfId(Long id){
        return ibgepPaisesClient.getMunicipiosPoUfId(id);
    }

    public MunicipioDTO getMunicipioPorId(Long id){
        return ibgepPaisesClient.getMunicipioPorId(id);
    }

}
