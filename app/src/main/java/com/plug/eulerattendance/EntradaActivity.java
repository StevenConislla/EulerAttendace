package com.plug.eulerattendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.plug.eulerattendance.database.MetodoSQL;
import com.plug.eulerattendance.entidades.ProfesoresEntidad;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EntradaActivity extends AppCompatActivity {

    @BindView(R.id.txtResult)
    TextView txtResult;
    private MetodoSQL metodoSQL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
        ButterKnife.bind(this);


        metodoSQL = new MetodoSQL();

    }


    @OnClick(R.id.btnScanEntra)
    public void onViewClicked() {
        final Activity activity = this;
        IntentIntegrator integrator = new IntentIntegrator(activity);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Scan");
        integrator.setCameraId(0);
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(false);
        integrator.initiateScan();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        //final String A="Alumno_A";
        //final String B="Alumno_B";
        //final String C="Alumno_C";
        final String UURLCARNET;
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Cancelaste el scaneo!", Toast.LENGTH_LONG).show();
            }

            else{
                UURLCARNET = result.getContents();
                txtResult.setText(result.getContents());


                Date horaActual = new Date();

            /*txtResult.setText((horaActual.getYear() + 1900) + "" + (horaActual.getMonth() + 1) + ""



                    + horaActual.getDate() + "" + horaActual.getHours() + "" + horaActual.getMinutes()

                    + "" + horaActual.getSeconds());*/


                String Nombre = result.getContents();
                String Hora = (String) (horaActual.getHours() + ":" + horaActual.getMinutes() + ":" + horaActual.getSeconds());
                String Dia = (String) (horaActual.getDay() + "");
                String FechaExacta = (String) (horaActual.getDate() + "-" + (horaActual.getMonth() + 1) + "-" + (horaActual.getYear() + 1900));
/*
            if(modelos==null) {
                Toast.makeText(getActivity(),
                        "Debe seleccionar un modelo",Toast.LENGTH_SHORT).show();
                return;
            }
            //Obtenemos el modelo seleccionado
            String modelo=spModelo.getSelectedItem().toString();
            //Obtenemos el modelo (objeto)seleccionado
            ModelosEntidad model=null;
            for (ModelosEntidad item:modelos){
                if (item.getDescripcion().equals(modelo)) {
                    model=item;
                    break;
                }
            }*/
                ProfesoresEntidad profesoresEntidad = new ProfesoresEntidad();
                profesoresEntidad.setId(metodoSQL.obtenerIdProfesor());
                profesoresEntidad.setNombre(Nombre);
                profesoresEntidad.setHora(Hora);
                profesoresEntidad.setDia(Dia);
                profesoresEntidad.setFechaExacta(FechaExacta);
                metodoSQL.agregar(profesoresEntidad);
                Toast.makeText(this, "Se registro Correctamente", Toast.LENGTH_SHORT).show();


            }


            //Log.i("TAG","No_entro");
            //Log.i("TAG",UURLCARNET);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @OnClick(R.id.btnFecha)
    public void onViewClicked2() {

    }

    @OnClick(R.id.btnMenuPrincipal)
    public void onViewClicked3() {
        Intent intent=new Intent(EntradaActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
