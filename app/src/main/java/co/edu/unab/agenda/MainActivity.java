package co.edu.unab.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.agenda.model.Personas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //Se crea una lista de contactos llamada nombres
        ArrayList<Personas> nombres = new ArrayList<Personas>();
        nombres.add(new Personas("Juan", "Mendoza"));
        nombres.add(new Personas("Carlos", "Molina"));
        nombres.add(new Personas("Maria", "Miranda"));

        //Se crea un adaptador para la lista nombres ya que no se puede enviar directo al ListView
        AdaptadorPersonas adaptadorListaContactos = new AdaptadorPersonas(this, R.layout.layout_para_item, nombres);

        //Se le pasa el adaptador al ListView
        ListView listaContactos = (ListView) findViewById(R.id.listContact);
        listaContactos.setAdapter(adaptadorListaContactos);
    }
}





















