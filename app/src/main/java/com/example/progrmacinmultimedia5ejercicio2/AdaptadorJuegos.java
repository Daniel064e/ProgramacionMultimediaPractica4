package com.example.progrmacinmultimedia5ejercicio2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programacinmultimedia5.R;

public class AdaptadorJuegos extends RecyclerView.Adapter<AdaptadorJuegos.JuegosViewHolder> {

    private Juegos[] listaJuegos;

    public AdaptadorJuegos(Juegos[] listaJuegos)
    {
        this.listaJuegos = listaJuegos;
    }

    @NonNull
    @Override
    public AdaptadorJuegos.JuegosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorJuegos.JuegosViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class JuegosViewHolder extends RecyclerView.ViewHolder {

        public TextView tituloView;

        public ImageView portadaView;

        private Context context;
        private Juegos[] listaJuegos;

        public JuegosViewHolder(View view, Context context) {
            
            super(view);
            this.context = context;
            
            tituloView = view.findViewById(R.id.textView3);
            portadaView = view.findViewById(R.id.imageView7);
            
        }
        
        public void BindJuego(Juegos juegos) {
            tituloView.setText(juegos.title);
            portadaView.setImageResource(
                    context.getResources().getIdentifier(
                            juegos.image,
                            "drawable",
                            context.getPackageName()
                    )
            );
        }

        @NonNull
        @Override
        public JuegosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
            View view = layoutInflater.from(parent.getContext())
                    .inflate(R.layout.juegos_item, parent, false);

            return new JuegosViewHolder(view, parent.getContext());
        }
        
        @Override
        public void onBindViewHolder(@NonNull JuegosViewHolder holder, int position) {
            holder.BindJuego(this.listaJuegos[position]);
        }


        @Override
        public int getItemCount() {
            return this.listaJuegos.length;
        }



    }
}
