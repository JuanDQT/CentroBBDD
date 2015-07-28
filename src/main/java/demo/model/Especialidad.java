package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Juan Daniel on 17/07/2015.
 */
@Entity
public class Especialidad {
    @Id
    private Long id;

    private EnumEspecialidad enumEspecialidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public EnumEspecialidad getEnumEspecialidad() {
        return enumEspecialidad;
    }

    @ManyToOne
    private Alumno alumno;

    @OneToMany(mappedBy = "especialidad")
    private Set<Asignatura> asignaturas = new HashSet<>();

    public void setEnumEspecialidad(EnumEspecialidad enumEspecialidad) {
        this.enumEspecialidad = enumEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", enumEspecialidad=" + enumEspecialidad +
                '}';
    }

}
