package lctpc.com.mx.lab5;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText input;
    ListView list;
    FloatingActionButton add;

    ArrayList<String> listArray;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.edt_input);
        list = (ListView) findViewById(R.id.ls);
        add = (FloatingActionButton)findViewById(R.id.add);

        listArray = new ArrayList<String>();
        listArray.add("hola campo1");
        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row,listArray);
        list.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String task = input.getText().toString();
                if(task.isEmpty()){
                    Snackbar.make(view,"Esta Vacio",Snackbar.LENGTH_LONG).show();
                }else{
                    listArray.add(task);
                    adapter.notifyDataSetChanged();
                    input.setText("");
                }
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                listArray.remove(i);
                adapter.notifyDataSetChanged();
                return true;
            }
        });

    }
}
