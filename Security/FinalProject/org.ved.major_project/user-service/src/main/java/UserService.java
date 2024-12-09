import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserService {
    static public void main(String[] args) {
    	SpringApplication.run(UserService.class);
    	System.out.println("User Servcie Application is now Active");
    }
}
