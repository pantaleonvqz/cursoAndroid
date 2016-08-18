package lctpc.com.mx.lab8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    String FIREBASE_URL="https://primer-ejemplo.firebaseio.com/";
    String FIREBASE_CHILD = "test";
    @Bind(R.id.editText)
    EditText editText;
    Firebase fireBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Firebase.setAndroidContext(this);
        fireBase = new Firebase(FIREBASE_URL).child(FIREBASE_CHILD);
        fireBase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(getApplicationContext(),dataSnapshot.getValue().toString(),Toast.LENGTH_SHORT).show();
                Log.e(getLocalClassName(),dataSnapshot.getValue().toString());
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
    @OnClick(R.id.boton)
    public void writeToFireBase(){
        fireBase.setValue(editText.getText().toString());
        editText.setText("");
    }
}
