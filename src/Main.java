import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Dit à Java que cette classe peut répondre à des requêtes Web
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/") // La route racine : http://localhost:8080/
    public String home() {
        return "Bienvenue dans la Boutique de Simaw sur le port 8080 !";
    }
}