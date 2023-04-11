package model;

import javax.persistence.*;

@Entity
@Table(name = "plato")
public class Plato {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPlato;
    private String nombrePlato;

    public Plato(int idPlato, String nombrePlato) {
        this.idPlato = idPlato;
        this.nombrePlato = nombrePlato;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }
}
