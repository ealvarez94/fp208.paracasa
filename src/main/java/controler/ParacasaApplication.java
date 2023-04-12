package controler;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;


// ...


public class ParacasaApplication {

	@GetMapping("/welcome")
	public String welcome() {return "Hello, World!";}

	public static void main(String[] args) {
		SpringApplication.run(ParacasaApplication.class, args);
	}

	@GetMapping("/mi-vista")
	public String miVista(Model model) {
		model.addAttribute("titulo", "Mi Título");
		model.addAttribute("mensaje", "¡Hola desde Thymeleaf!");
		return "mi-vista";
	}


}
