package br.com.ccvn.wisedelivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ccvn.wisedelivery.dominio.Cliente;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("clientes")
public class ClienteController {

    @GetMapping("form-cadastro")
    public String formCadastroCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cliente-cadastro";
    } 

    @PostMapping("/save")
    public String salvarCliente( @ModelAttribute("cliente") Cliente cliente){
        log.info("CLIENTE SALVO: " + cliente.getNome());
        return "cliente-cadastro";
    }
    
}