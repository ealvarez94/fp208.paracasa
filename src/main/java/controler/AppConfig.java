package controler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
@ComponentScan("interfaces") // Reemplaza "com.example.service" con el paquete correcto
public class AppConfig {
    // Configuración adicional de Spring
}
