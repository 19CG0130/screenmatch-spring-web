package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.principal.EjemploStreams;
import com.aluracursos.screenmatch.principal.Principal;
import com.aluracursos.screenmatch.repository.SerieRepository;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();

		//se optimizo en la clase Principal
//		var consumoApi = new ConsumoAPI();
//		var json = consumoApi.obtenerDatos("h28ttps://www.omdbapi.com/?t=breaking+bad&apikey=a047acaa");
//		System.out.println(json);
//		ConvierteDatos conversor = new ConvierteDatos();
//		var datos = conversor.obtenerDatos(json, DatosSerie.class);
//		System.out.println(datos);
//
//		json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=breaking+bad&Season=1&episode=1&apikey=a047acaa");
//		DatosEpisodio episodios = conversor.obtenerDatos(json, DatosEpisodio.class);
//		System.out.println(episodios);

		//STREAMS EJEMPLO
//		EjemploStreams ejemploStreams = new EjemploStreams();
//		ejemploStreams.muestraEjemplo();

	}
}
