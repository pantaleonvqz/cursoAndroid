package lctpc.com.mx.lab6.Fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lctpc.com.mx.lab6.R;

/**
 * Created by android on 18/08/2016.
 */
public class Derecha extends Fragment{
    View rootView;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        //indicamos de donde obtenemos la lista del fragmento, enlazamos el txt
        //devolvemos la vista con return
        rootView = inflater.inflate(R.layout.derecha,container,false);
        txt = (TextView)rootView.findViewById(R.id.texto);
        return rootView;
    }
    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
