package com.example.progrmacinmultimedia5ejercicio2;

import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorJuegos extends RecyclerView.Adapter<AdaptadorJuegos.JuegosViewHolder> {

    private Juegos[] listaJuegos;

    public AdaptadorJuegos(Juegos[] listaJuegos)
    {
        this.listaJuegos = listaJuegos;
    }
}
