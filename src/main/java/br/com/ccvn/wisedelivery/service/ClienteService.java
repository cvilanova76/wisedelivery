package br.com.ccvn.wisedelivery.service;

import br.com.ccvn.wisedelivery.dominio.dto.clientedto.ClienteDTO;
import br.com.ccvn.wisedelivery.dominio.dto.clientedto.ClienteLoginDTO;
import br.com.ccvn.wisedelivery.dominio.dto.clientedto.ClienteSalvoDTO;

public interface ClienteService {
    ClienteSalvoDTO salvar(ClienteDTO dto);

    boolean login(ClienteLoginDTO cliente);
    
}