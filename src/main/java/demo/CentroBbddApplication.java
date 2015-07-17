package demo;


import demo.service.AlumnoService;
import demo.service.AsignaturaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CentroBbddApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CentroBbddApplication.class, args);
        AlumnoService alumnoService = context.getBean(AlumnoService.class);
        alumnoService.testAlumno();
        AsignaturaService asignaturaService = context.getBean(AsignaturaService.class);
        //ProfesorService profesorService = context.getBean(ProfesorService.class);
        //AulaService aulaService = context.getBean(AulaService.class);
        //EmployeeService employeeService = context.getBean(EmployeeService.class);
        //employeeService.testEmployes();
        //employeeService.testDevelopers();
        //employeeService.testManager();
        asignaturaService.testAsignatura();
        //profesorService.testProfesor();
        //aulaService.testAula();
    }
}
