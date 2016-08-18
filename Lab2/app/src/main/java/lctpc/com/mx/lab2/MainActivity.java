package lctpc.com.mx.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button cel;
    Button far;
    Button kel;
    TextView resultado;
    String Texto;
    Double oper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cel = (Button)findViewById(R.id.celsius);
        far = (Button)findViewById(R.id.fahrenheit);
        kel = (Button)findViewById(R.id.kelvin);

        resultado = (TextView)findViewById(R.id.textView);
        text = (EditText)findViewById(R.id.editText);

        cel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Texto = text.getText().toString();
                oper =  Double.parseDouble(Texto);
                resultado.setText(""+oper);
            }
        });
        far.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Texto = text.getText().toString();
                oper =  (Double.parseDouble(Texto)* 1.8000) + 32.00;
                resultado.setText(""+oper);
            }
        });
        kel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Texto = text.getText().toString();
                oper =  Double.parseDouble(Texto)+273.15;
                resultado.setText(""+oper);
            }
        });

    }
}
