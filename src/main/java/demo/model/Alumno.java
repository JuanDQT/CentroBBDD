package demo.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Juan Daniel on 19/06/2015.
 */

@Entity
@Table(name="ALUMNOS")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="alum_cod")
    private Long alumCod;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    private LocalDate fechaNacimiento;

    //ANOTACIONES MANY-TO-ONE--ONE-TO-MANY--MANY-TO-MANY

    @OneToMany(mappedBy = "alumno")
    private Set<Especialidad> especialidads;

    public Alumno() {}

    public Long getAlumCod() {
        return alumCod;
    }

    public void setAlumCod(Long alumCod) {
        this.alumCod = alumCod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
