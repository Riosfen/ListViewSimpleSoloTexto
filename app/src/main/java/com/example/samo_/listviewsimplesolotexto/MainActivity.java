package com.example.samo_.listviewsimplesolotexto;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

////////////////////////////////////////////////////////////////////////////////////////////////////
// debe extender de ListActivity
// el xml de la lista tiene que llamarse obligatoriamente layout_listview.xml
// el activity_main.xml tiene que contener un listview con un id (android:id="@android:id/list")
public class MainActivity extends ListActivity {

    private String[] contenido = {"contenido 1", "contenido 2", "contenido 3", "contenido 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListAdapter(new ArrayAdapter<>(this,R.layout.layout_listview,R.id.textView_texto,contenido));

        // como la clase extiende de ListActivity, la misma clase tiene el ListView,
        // asi que llamamos a la clase y hacemos un getListView() para obtener la lista.
        ListView lista = this.getListView();

        // ahora la podemos tratar y asignarle acciones a los item.
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////