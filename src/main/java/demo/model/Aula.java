package demo.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Juan Daniel on 24/06/2015.
 */

@Entity
public class Aula {

    public Long getIdAula() {
        return idAula;
    }

    public void setIdAula(Long idAula) {
        this.idAula = idAula;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAula;

    @ManyToMany
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Set<Servicio> servicios = new HashSet<>();

    @Max(20)
    private Long capacidad;


    public Set<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Aula() {}

    public Long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Long capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aula aula = (Aula) o;

        if (servicios != null ? !servicios.equals(aula.servicios) : aula.servicios != null) return false;
        return !(capacidad != null ? !capacidad.equals(aula.capacidad) : aula.capacidad != null);

    }

    @Override
    public int hashCode() {
        int result = servicios != null ? servicios.hashCode() : 0;
        result = 31 * result + (capacidad != null ? capacidad.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "servicios=" + servicios +
                ", capacidad=" + capacidad +
                '}';
    }
}
