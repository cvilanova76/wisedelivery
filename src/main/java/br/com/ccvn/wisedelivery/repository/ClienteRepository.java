package br.com.ccvn.wisedelivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ccvn.wisedelivery.dominio.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Optional <Cliente> findByEmail(String email);
    
}