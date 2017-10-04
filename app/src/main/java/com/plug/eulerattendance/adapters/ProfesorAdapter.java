package com.plug.eulerattendance.adapters;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.plug.eulerattendance.EntradaActivity;
import com.plug.eulerattendance.ListaActivity;
import com.plug.eulerattendance.R;
import com.plug.eulerattendance.database.MetodoSQL;
import com.plug.eulerattendance.entidades.ProfesoresEntidad;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.RealmResults;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class ProfesorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private RealmResults<ProfesoresEntidad> profesores;
    private Activity activity;

    public ProfesorAdapter(Context context, RealmResults<ProfesoresEntidad> profesores, Activity activity) {
        this.context = context;
        this.profesores = profesores;
        this.activity = activity;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvDia)
        TextView tvDia;
        @BindView(R.id.tvNombre)
        TextView tvNombre;
        @BindView(R.id.tvHora)
        TextView tvHora;
        @BindView(R.id.tvFechaExacta)
        TextView tvFechaExacta;
        @BindView(R.id.contenedorPersonal)
        CardView contenedorPersonal;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        //Con el foco rojo creamos el constructor matching super
        /*public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }*/
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_personal, parent, false);
        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        //Aqui vinculamos el recicler con sus variables
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        //Validamos que el viewholder este creado
        final MetodoSQL metodoSQL = new MetodoSQL();
        if (myViewHolder != null) {
            final ProfesoresEntidad profesoresEntidad = profesores.get(position);
            myViewHolder.tvDia.setText(profesoresEntidad.getDia());
            myViewHolder.tvNombre.setText(profesoresEntidad.getNombre());
            myViewHolder.tvHora.setText(profesoresEntidad.getHora());
            myViewHolder.tvFechaExacta.setText(profesoresEntidad.getFechaExacta());
            myViewHolder.contenedorPersonal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //No olvides de ponerle el contexto, y del .builder
                    final AlertDialog.Builder builder1 = new AlertDialog.Builder(activity);
                    builder1.setMessage("Desea eliminarlo");
                    builder1.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            metodoSQL.eliminarProfesor(profesoresEntidad.getId());
                            notifyDataSetChanged();
                            Toast.makeText(context, "Se elimino correctamente", Toast.LENGTH_SHORT).show();

                        }
                    });
                    builder1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    builder1.show();




                }
            });

            //myViewHolder.tvPlaca.setText(clienteEntidad.getPlaca());
        }
            //Ejecutamos una acción por cada elemento de la lista

    }

    @Override
    public int getItemCount() {
        return profesores.size();
    }
}
