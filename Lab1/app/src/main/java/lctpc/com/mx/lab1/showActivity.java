package lctpc.com.mx.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {
    TextView cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        cadena = (TextView) findViewById(R.id.t_cadena);
        Bundle Extras = getIntent().getExtras();
        cadena.setText(""+Extras.get("cadena"));

    }
}
