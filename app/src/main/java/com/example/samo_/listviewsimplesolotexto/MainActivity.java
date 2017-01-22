package com.example.samo_.listviewsimplesolotexto;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

////////////////////////////////////////////////////////////////////////////////////////////////////
// debe extender de ListActivity
public class MainActivity extends ListActivity {

    private String[] contenido = {"contenido 1", "contenido 2", "contenido 3", "contenido 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListAdapter(new ArrayAdapter<>(this,R.layout.layout_listview,R.id.textView_texto,contenido));

    }
}
