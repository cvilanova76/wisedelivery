package br.com.ccvn.wisedelivery.dominio.dto.restaurantedto;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import br.com.ccvn.wisedelivery.dominio.RestauranteCategoria;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RestauranteDTO {

    private Long id;
    
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 80)
    private String nome;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 80)
    @Email(message = "Formato inválido")
    private String email;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 80)
    private String senha;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 80)
    private String confirmaSenha;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 20)
    private String telefone;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 14)
    @Pattern(regexp = "[0-9]{14}")
    private String cnpj;

    private MultipartFile arquivoLogotipo;
    
    private String logotipo;

    @NotNull(message = "Não pode ser 0")
    private BigDecimal taxaEntrega;

    @NotNull(message = "Não pode ser 0")
    private Integer tempoEntrega;
    
    private Set<RestauranteCategoria> categorias;

    
}