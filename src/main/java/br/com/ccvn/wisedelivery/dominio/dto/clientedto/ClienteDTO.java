package br.com.ccvn.wisedelivery.dominio.dto.clientedto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClienteDTO {

    private Long id;
    
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 80)
    private String nome;
    
    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 60)
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
    @Pattern(regexp = "[0-9]")
    private String telefone;

    @NotBlank(message = "Não pode estar em branco")
    @Size(max = 11)
    @Pattern(regexp = "[0-9]{11}")
    private String cpf; 
    
}