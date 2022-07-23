package com.pruebaInet.pruebaInet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SpringBootApplication
public class PruebaInetApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PruebaInetApplication.class, args);
		
		leer();
		
	}

	private static void leer() {
		String nombre, profesion, edad, lenguajes, disponibilidad, rangop;
		
		JSONParser parser = new JSONParser();
		
		try {
			
			Object obj = parser.parse(new FileReader("usuario.json"));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println("JSON LEIDO: " + jsonObject); 
			
			JSONArray array = (JSONArray) jsonObject.get("usuario");
			System.out.println("");
			nombre = (String) jsonObject.get("nombre");
			profesion = (String) jsonObject.get("profesion");
			edad = (Long)jsonObject.get("edad");
			lenguajes = (String)jsonObject.get("lenguajes");
			disponibilidad = (String)jsonObject.get("disponibilidadParaViajar");
			//rangop = (String)jsonObject.get("rangoProfesional");
			
			System.out.println("nombre: " + nombre);
			System.out.println("profesion: " + profesion);
			System.out.println("edad: " + edad);
			System.out.println("lenguajes: " + lenguajes);
			System.out.println("disponibilidadParaViajar: " + disponibilidad);
			//System.out.println("rangoProfesional: " + rangop);
			
			
			
		}catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			
		}
		catch(ParseException e) {
			
		}
	}

	

	

}
