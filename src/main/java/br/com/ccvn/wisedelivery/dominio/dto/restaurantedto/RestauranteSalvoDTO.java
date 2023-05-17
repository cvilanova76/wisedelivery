package br.com.ccvn.wisedelivery.dominio.dto.restaurantedto;

import java.util.Set;

import br.com.ccvn.wisedelivery.dominio.RestauranteCategoria;
import lombok.Data;

@Data
public class RestauranteSalvoDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;
    private String logotipo;
    private String tempoEntrega;
    private Set<RestauranteCategoria> categorias;
    
}