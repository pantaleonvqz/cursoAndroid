package lctpc.com.mx.lab6.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lctpc.com.mx.lab6.Fragmentos.Derecha;
import lctpc.com.mx.lab6.Interfaces.EnviarMensaje;
import lctpc.com.mx.lab6.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarDatos(String mensaje){
        Derecha derecha=(Derecha) getFragmentManager().findFragmentById(R.id.der);
        derecha.ObtenerDatos(mensaje);
    }
}
