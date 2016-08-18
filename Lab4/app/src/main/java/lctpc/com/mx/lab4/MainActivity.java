package lctpc.com.mx.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Peliculas peliculas_datos[] = new Peliculas[]{
                new Peliculas(R.mipmap.ic_launcher,"Pelicula1"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula2"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula3"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula4"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula5"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula6"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula7"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula8"),
                new Peliculas(R.mipmap.ic_launcher,"Pelicula9"),
        };
        PeliculasAdapter adapter=new PeliculasAdapter(this,R.layout.row,peliculas_datos);
        ls = (ListView)findViewById(R.id.ls);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView vista = (TextView) view.findViewById(R.id.nombre);
                Toast.makeText(getApplicationContext(),vista.getText()+" "+i,Toast.LENGTH_SHORT).show();
                //anexamos pantalla para mostrar peliculas.
                Intent intent = new Intent(getApplicationContext(),showMovie.class);
                intent.putExtra("cadena",vista.getText().toString());
                startActivity(intent);
            }
        });
    }
}
