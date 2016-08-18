package lctpc.com.mx.lab7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import lctpc.com.mx.lab7.Adaptador.SeriesAdapter;
import lctpc.com.mx.lab7.Model.Series;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List items = new ArrayList();
        items.add(new Series(R.drawable.images,"The It crow",500));
        items.add(new Series(R.drawable.images,"The Robot",200));

        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        adapter = new SeriesAdapter(items);
        recycler.setAdapter(adapter);
    }
}
