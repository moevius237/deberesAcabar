package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int saldo;

    @ManyToOne
    @JoinColumn(nullable = false, name = "juegos_id")
    private Juegos juegosId;

    @OneToOne
    @JoinColumn(nullable = false, name = "mesas_id")
    private Mesas mesasID;

    public Usuarios(String nombre, int saldo, Juegos juegosId, Mesas mesasID) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.juegosId = juegosId;
        this.mesasID = mesasID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Juegos getJuegosId() {
        return juegosId;
    }

    public void setJuegosId(Juegos juegosId) {
        this.juegosId = juegosId;
    }

    public Mesas getMesasID() {
        return mesasID;
    }

    public void setMesasID(Mesas mesasID) {
        this.mesasID = mesasID;
    }
}
