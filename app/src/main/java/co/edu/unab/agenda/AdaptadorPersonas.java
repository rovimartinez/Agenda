package co.edu.unab.agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.unab.agenda.model.Personas;

public class AdaptadorPersonas extends BaseAdapter {

    private Context contexto;
    private  int layout;
    private ArrayList<Personas> personas;

    //Se debe crear un constructor para que traiga los datos que va a utilizar
    public AdaptadorPersonas(Context contexto, int layout, ArrayList<Personas> personas){

    }

    //Verifica cuantas personas hay
    @Override
    public int getCount() {
        return personas.size(); //Para que cuente el total de personas que tenga
    }
    //Cual es el item seleccionado cuando pasan una posicion
    @Override
    public Object getItem(int posicion) {
        return posicion;
    }
    //Devuelve el ID del item cuando pasan la posicion
    @Override
    public long getItemId(int posicion) {
        return posicion;
    }
    //Recibe la posicion, la vista y el viewGroup para que retornemos una vista
    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(contexto);

        View vistaItem = inflater.inflate(layout,null );
        Personas persona = personas.get(posicion);

        TextView textViewNombre = vistaItem.findViewById(R.id.TextViewNombre);
        textViewNombre.setText(persona.getNombre());

        TextView textViewApellido = vistaItem.findViewById(R.id.TextViewApellido);
        textViewApellido.setText(persona.getApellido());

        return vistaItem;
    }
}
