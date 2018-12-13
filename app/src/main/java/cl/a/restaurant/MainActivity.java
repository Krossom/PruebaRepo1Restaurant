package cl.a.restaurant;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtId, edtNombre, edtDescripcion, edtPrecio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtId = (EditText) findViewById(R.id.edtId);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtDescripcion = (EditText) findViewById(R.id.edtDescripcion);
        edtPrecio = (EditText) findViewById(R.id.edtPrecio);
    }

    public void agregar(View view){
        final DBTarde dbTarde = new DBTarde(getApplicationContext());
       dbTarde.agregarMenu(edtId.getText().toString(), edtNombre.getText().toString(),edtDescripcion.getText().toString(),edtPrecio.getText().toString());

        Toast.makeText(this,"El menu fue añadido exitosamente", Toast.LENGTH_LONG).show();


    }




}
