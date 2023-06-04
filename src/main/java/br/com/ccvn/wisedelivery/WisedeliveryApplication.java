package br.com.ccvn.wisedelivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ccvn.wisedelivery.dominio.RestauranteCategoria;
import br.com.ccvn.wisedelivery.repository.RestauranteCategoriaRepository;
import br.com.ccvn.wisedelivery.service.impl.ImageServiceImpl;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class WisedeliveryApplication implements CommandLineRunner {

	@Autowired
	private RestauranteCategoriaRepository restauranteCategoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(WisedeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var cat1 = RestauranteCategoria.builder()
			.nome("Churrasco")
			.build();

		var cat2 = RestauranteCategoria.builder()
			.nome("Massas")
			.build();
		
		var cat3 = RestauranteCategoria.builder()
			.nome("Asiática")
			.build();

		var cat4 = RestauranteCategoria.builder()
			.nome("Lanches")
			.build();

		restauranteCategoriaRepository.saveAll(List.of(cat1, cat2, cat3, cat4));
		
		log.info(ImageServiceImpl.criarPastaDeUpload());
		
	}

}
