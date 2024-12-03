package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "juegos_has_mesas")
public class JuegosMesas {
    @ManyToOne
    @JoinColumn(nullable = false,name = "juegos_id")
    private Juegos juegosID;

    @ManyToOne
    @JoinColumn(nullable = false,name = "mesas_id")
    private Mesas mesas;

    @Column(nullable = false, name = "tiempo_de_juego")
    private int tiempoDeJuego;

    public Mesas getMesas() {
        return mesas;
    }

    public void setMesas(Mesas mesas) {
        this.mesas = mesas;
    }

    public int getTiempoDeJuego() {
        return tiempoDeJuego;
    }

    public void setTiempoDeJuego(int tiempoDeJuego) {
        this.tiempoDeJuego = tiempoDeJuego;
    }

    public Juegos getJuegosID() {
        return juegosID;
    }

    public void setJuegosID(Juegos juegosID) {
        this.juegosID = juegosID;
    }

    public JuegosMesas(Mesas mesas, int tiempoDeJuego) {
        this.mesas = mesas;
        this.tiempoDeJuego = tiempoDeJuego;
    }
}
