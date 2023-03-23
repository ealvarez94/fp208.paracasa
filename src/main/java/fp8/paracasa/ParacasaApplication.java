package fp8.paracasa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParacasaApplication {

	@GetMapping("/welcome")
	public String welcome() {return "Hello, World!";}

	public static void main(String[] args) {
		SpringApplication.run(ParacasaApplication.class, args);
	}

}
