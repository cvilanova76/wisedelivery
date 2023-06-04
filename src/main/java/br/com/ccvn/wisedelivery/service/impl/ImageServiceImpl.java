package br.com.ccvn.wisedelivery.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ImageServiceImpl {

    @Getter @Setter
    private static String diretorioDeUpload;

    public String uploadImagem(MultipartFile bytesDaImagem){
        StringBuilder buildNomeArquivo = new StringBuilder();
        Path nomeArquivoeCaminho = Paths.get(diretorioDeUpload, bytesDaImagem.getOriginalFilename());
        try {
            gravaArquivo(nomeArquivoeCaminho, bytesDaImagem.getBytes());
            buildNomeArquivo.append(nomeArquivoeCaminho);
        } catch (Exception e) {
            log.error("Erro de IO: " + e.getMessage());
        }
        
        return buildNomeArquivo.toString();
    }
    
    public static String criarPastaDeUpload(){
        Path diretorioCriado = Paths.get("");
        try {
            diretorioCriado = Files.createDirectory(Paths.get(System.getProperty("user.home") + "/uploads"));
            log.info("Diretório criado com sucesso: " + diretorioCriado);
        } catch (Exception e) {
            log.error("Erro ao criar diretório. " + e.getMessage());
        }
        setDiretorioDeUpload(diretorioCriado.toString());
        return diretorioDeUpload;
    }

    private void gravaArquivo(Path nomeArquivoECaminho, byte[] bytesDaImagem){
        try {
            Files.write(nomeArquivoECaminho, bytesDaImagem, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception e) {
            try {
                log.error("Erro ao salvar a imagem: " + e.getMessage());
                Files.write(nomeArquivoECaminho, bytesDaImagem);
            } catch (Exception e1) {
                log.error("Erro ao salvar a imagem: " + e1.getMessage());
            }
        }
        
    }

}
    