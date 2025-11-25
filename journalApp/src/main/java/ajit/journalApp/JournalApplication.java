package ajit.journalApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JournalApplication {

    public static void main(String[] args) {
        System.out.println("Hi in main method");


        System.out.println("======================");
        SpringApplication.run(JournalApplication.class, args);

        System.out.println("Hi Started");
    }


}