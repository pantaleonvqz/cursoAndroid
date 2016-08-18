package lctpc.com.mx.lab4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by android on 17/08/2016.
 */
public class PeliculasAdapter extends ArrayAdapter<Peliculas> {
    Context context;
    int LayoutResourceId;
    Peliculas datos[] = null;

    public PeliculasAdapter(Context context, int layoutResourceId, Peliculas datos[]) {
        super(context, layoutResourceId, datos);
        this.context = context;
        this.LayoutResourceId = layoutResourceId;
        this.datos = datos;
    }

    public View getView(int position, View view, ViewGroup parent) {
        View row = view;
        PeliculasHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(LayoutResourceId, parent, false);

            holder = new PeliculasHolder();

            holder.imagen = (ImageView) row.findViewById(R.id.img);
            holder.texto = (TextView) row.findViewById(R.id.nombre);

            row.setTag(holder);
        } else {
            holder = (PeliculasHolder) row.getTag();
        }
        Peliculas peliculas = datos[position];
        holder.texto.setText(peliculas.nombre);
        holder.imagen.setImageResource(peliculas.imagen);

        return row;
    }

    static class PeliculasHolder {
    ImageView imagen;
        TextView texto;
    }
}
