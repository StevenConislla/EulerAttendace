package com.plug.eulerattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.plug.eulerattendance.adapters.ProfesorAdapter;
import com.plug.eulerattendance.database.MetodoSQL;
import com.plug.eulerattendance.entidades.ProfesoresEntidad;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.RealmResults;

public class ListaActivity extends AppCompatActivity {

    @BindView(R.id.rvDatos)
    RecyclerView rvDatos;

    private RealmResults<ProfesoresEntidad> profesores;
    private ProfesorAdapter adapter;

    private MetodoSQL metodoSQL;

    public ListaActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        ButterKnife.bind(this);


        metodoSQL = new MetodoSQL();
        adapter = new ProfesorAdapter(getApplicationContext(), metodoSQL.obtenerProfesores(), ListaActivity.this);
        //Esto me dice si es un listado o una grilla
        rvDatos.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvDatos.setAdapter(adapter);
    }

    @OnClick(R.id.btnMenuPrincipal)
    public void onViewClicked() {
        Intent intent = new Intent(ListaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnEliminarRegistro)
    public void onViewClicked3() {
        final MetodoSQL metodoSQL = new MetodoSQL();
        profesores=metodoSQL.obtenerProfesores();
        int i=0;
        //Recorremos la lista de secciones
        //For normal
        //for(int i=0;i<secciones.length;i++)

    if (profesores.size()==0){
        Toast.makeText(this, "Registro vacio", Toast.LENGTH_SHORT).show();
    }
    else {
        while(true)//Preguntamos si la seccion que tenemos almacenada es igual a la seccion de las opciones
        {if (profesores.size()==0){
              Toast.makeText(this, "Se elimino correctamente", Toast.LENGTH_SHORT).show();
              break;
          }
          else{
            ProfesoresEntidad profesoresEntidad = profesores.get(0);
            metodoSQL.eliminarProfesor(profesoresEntidad.getId());}
        }

        //notifyDataSetChanged();
        //Sumamos en 1 al contador

        adapter.notifyDataSetChanged();

    }
        //Intent intent=new Intent(ListaActivity.this,MainActivity.class);
        //startActivity(intent);




/*        for(ProfesoresEntidad item:profesores){
            //Preguntamos si la seccion que tenemos almacenada es igual a la seccion de las opciones
            if(item.equals(noticia.getSeccion())){
                //Si son iguales, mostramos la sección, le decimos en donde esta(numero)
                spSeccion.setSelection(i);
                //Dejamos de recorrer el for
                break;
            }
            //Sumamos en 1 al contador
            i++;
        }*/

    }
}
