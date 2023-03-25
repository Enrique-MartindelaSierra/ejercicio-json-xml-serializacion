package com.enrique.ejercicio_json_xml_serializacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.enrique.ejercicio_json_xml_serializacion.entities.Pelicula;
import com.enrique.ejercicio_json_xml_serializacion.entities.Personaje;
import com.enrique.ejercicio_json_xml_serializacion.utilities.BasicUtils;
import com.enrique.ejercicio_json_xml_serializacion.utilities.JsonUtils;
import com.enrique.ejercicio_json_xml_serializacion.utilities.SerializacionUtils;

public class App {
//	static int numUrl= BasicUtils.devolverNumeroConsola();
//	static String url= "https://swapi.dev/api/people/"+numUrl+"/?format=json";
	static String urlNave= "https://swapi.dev/api/starships/2/?format=json";//la del archivo cr90
	static String urlTodasLasPeliculas= "https://swapi.dev/api/films/?format=json";//para sacar por codigo
	static String fJson = "?format=json";

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Set<Personaje> listaPersonajes = new HashSet<Personaje>();

		do {
			System.out.print(
					"1.-Películas comunes \n2.-Serializar Actores \n3.-Dessereializar Actores \n0.-Salir\nOpcion: \n");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduzca el codigo del primer actor");
				int numUrlP1 = Integer.parseInt(sc.nextLine());
				String urlP1 = "https://swapi.dev/api/people/" + numUrlP1 + fJson;// podria devolver un array de estos
																					// numeros y trabajar con ellos
																					// luego en otro metodo

				System.out.println("Introduzca el codigo del segundo actor");
				int numUrlP2 = Integer.parseInt(sc.nextLine());
				String urlP2 = "https://swapi.dev/api/people/" + numUrlP2 + fJson;

				Set<String> peliculasComunes = new HashSet<String>();

				Personaje personaje1 = JsonUtils.leerObjeto(urlP1, Personaje.class);
				listaPersonajes.add(personaje1);
				List<String> urlsP1 = personaje1.getFilms();
				List<Pelicula> peliculasP1 = new ArrayList<Pelicula>();
				urlsP1.forEach(u -> peliculasP1.add(JsonUtils.leerObjeto(u + fJson, Pelicula.class)));
				peliculasP1.forEach(pelicula -> peliculasComunes.add(pelicula.getTitle()));

				Personaje personaje2 = JsonUtils.leerObjeto(urlP2, Personaje.class);
				listaPersonajes.add(personaje2);
				List<String> urlsP2 = personaje2.getFilms();
				List<Pelicula> peliculasP2 = new ArrayList<Pelicula>();
				urlsP2.forEach(u -> peliculasP2.add(JsonUtils.leerObjeto(u + fJson, Pelicula.class)));
				peliculasP2.forEach(pelicula -> peliculasComunes.add(pelicula.getTitle()));

				peliculasComunes.forEach(e -> System.out.println(e));

			}
			case 2 -> {
				if (SerializacionUtils.serializarListaObjetos("assets/files/listaPersonajes.dat",
						listaPersonajes.stream().collect(Collectors.toList()))) {
					System.out.println("La serialización fue satisfactoria");
				} else {
					System.out.println("La serialización falló");
				}
			}
			case 3 -> {
				List<Personaje> personajesSerie = SerializacionUtils
						.desSerializarListaObjetos("assets/files/listaPersonajes.dat");
				personajesSerie.forEach(e->System.out.println(e));
			}
			case 0 -> System.out.println("Hasta luego");
			default -> System.out.println("Por favor elige una opción del menú");
			}

		} while (opcion != 0);
	}

	public static void main(String[] args) {
//    	Personaje personaje1 = JsonUtils.leerObjeto(url, Personaje.class);
//    	System.out.println(personaje1.getFilms().get(0)+"?format=json");
//    	Pelicula peliculaP1=JsonUtils.leerObjeto(personaje1.getFilms().get(0)+fJson, Pelicula.class);
//    	System.out.println(peliculaP1);
//    	
//    	List<String> urls = personaje1.getFilms();
//    	List<Pelicula> peliculasP1= new  ArrayList<Pelicula>();
//    	urls.forEach(u->peliculasP1.add(JsonUtils.leerObjeto(u+fJson, Pelicula.class)));
//    	peliculasP1.forEach(pelicula ->System.out.println(pelicula.getTitle()));

		menu();
	}

}
