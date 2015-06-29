package demo;


import demo.service.AsignaturaService;
import demo.service.AulaService;
import demo.service.ProfesorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CentroBbddApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CentroBbddApplication.class, args);
        AsignaturaService asignaturaService = context.getBean(AsignaturaService.class);
        ProfesorService profesorService = context.getBean(ProfesorService.class);
        AulaService aulaService = context.getBean(AulaService.class);
        //EmployeeService employeeService = context.getBean(EmployeeService.class);
        //employeeService.testEmployes();
        //employeeService.testDevelopers();
        //employeeService.testManager();
        asignaturaService.testAsignatura();
        profesorService.testProfesor();
        aulaService.testAula();
    }
}
