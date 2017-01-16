package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {

		/*
		 * Vamos a crear una app stand alone, no necesitamos un servidor, va
		 * solam eso hace boostrap. Crea el contenedor servlet, hostea la app y
		 * la ejecuta.
		 * 
		 * → Establece la configuración por defecto. (esa mayoria de casos
		 * quedan bien configurados así.). 
		 * 
		 * → Inicializa el contexto inicial de
		 * Spring. Spring es un contenedor del codigo que se ejecuta en mi
		 * servidor de aplicaciones. Tenemos servicios de negocios,
		 * controladores, servicios de datos. Este container es el contexto.
		 * 
		 * → Realiza un escaneo del classpath. El marcado de las clases se marca
		 * con anotaciones y las lee de una manera distinta dependiendo de lo
		 * que le digamos. Este escaneo le dice a spring como tratar las clases
		 * anotadas. 
		 * 
		 * → Inicializa el servidor Tomcat.
		 */
		SpringApplication.run(CourseApiApp.class, args);

	}

}
