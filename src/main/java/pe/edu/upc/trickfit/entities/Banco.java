package pe.edu.upc.trickfit.entities;

import javax.persistence.*;

@Entity
@Table(name = "Banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanco;

    @Column(name = "nombreBanco", length = 30, nullable = false)
    private String nombreBanco;

    public Banco() {
    }

    public Banco(int idBanco, String nombreBanco) {
        this.idBanco = idBanco;
        this.nombreBanco = nombreBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
}
