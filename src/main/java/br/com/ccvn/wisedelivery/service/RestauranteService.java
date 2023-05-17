package br.com.ccvn.wisedelivery.service;

import java.util.List;

import br.com.ccvn.wisedelivery.dominio.RestauranteCategoria;
import br.com.ccvn.wisedelivery.dominio.dto.restaurantedto.RestauranteDTO;
import br.com.ccvn.wisedelivery.dominio.dto.restaurantedto.RestauranteSalvoDTO;

public interface RestauranteService {

    RestauranteSalvoDTO salvar(RestauranteDTO dto);

    List<RestauranteCategoria> pegaTodasAsCategorias();
    
}