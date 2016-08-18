package lctpc.com.mx.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showMovie extends AppCompatActivity {
    TextView cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_movie);
        cadena = (TextView) findViewById(R.id.npelicula);
        Bundle Extras = getIntent().getExtras();
        cadena.setText(""+Extras.get("cadena"));
    }
}
