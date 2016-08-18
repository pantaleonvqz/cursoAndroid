package lctpc.com.mx.lab6.Fragmentos;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import lctpc.com.mx.lab6.Interfaces.EnviarMensaje;
import lctpc.com.mx.lab6.R;

/**
 * Created by android on 18/08/2016.
 */
//clase de freagmento de izquierda.
public class Izquierda extends Fragment{
    //
    View rootView;
    Button boton;
    EditText campo;
    EnviarMensaje EM;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            EM = (EnviarMensaje) activity;
        }catch (ClassCastException ex){
            throw new ClassCastException("Necesitas enviar un mensaje");
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        //indicamos donde obtenemos la vista para el fragmento
        rootView = inflater.inflate(R.layout.izquierda,container,false);
        campo = (EditText)rootView.findViewById(R.id.campo_texto);
        boton = (Button)rootView.findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje;
                mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });
        return rootView;
    }
}
