package lctpc.com.mx.lab1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    Button saludar;
    EditText t_saludo;
    TextView t_mostrar;
    int hourofday;
    String mensaje;
    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saludar = (Button)findViewById(R.id.button);
        t_saludo=(EditText)findViewById(R.id.usuario);
        t_mostrar=(TextView)findViewById(R.id.Mostrar);

        saludar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                hourofday = cal.get(Calendar.HOUR_OF_DAY);
                if(hourofday==0 && hourofday<12) {
                    mensaje = "Buen dia";
                }else if(hourofday>12 && hourofday<18) {
                    mensaje = "Buenas tardes";
                }else{
                    mensaje = "Buenas noches";
                }
                t_mostrar.setText("Hola "+t_saludo.getText().toString()+" "+mensaje);

                Intent intent = new Intent(getApplicationContext(),showActivity.class);
                intent.putExtra("cadena",t_saludo.getText().toString());
                startActivity(intent);
            }
        });



    }
}
