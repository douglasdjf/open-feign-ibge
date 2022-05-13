package br.com.openfeign.service;

import br.com.openfeign.client.IBGEPPaisesClient;
import br.com.openfeign.dto.PaisesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
//@RequiredArgsConstructor
public class PaisesService {

    @Autowired
    private IBGEPPaisesClient ibgepPaisesClient;

    //  private final IBGEPPaisesClient ibgepPaisesClient;

    public List<PaisesDTO> getPaises(){
        return ibgepPaisesClient.getPaises();
    }
}
