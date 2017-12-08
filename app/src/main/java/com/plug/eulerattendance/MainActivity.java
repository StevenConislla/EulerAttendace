package com.plug.eulerattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.plug.eulerattendance.pruebas.OnSwipeTouchListener;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.contenedor)
    LinearLayout contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        contenedor.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
                                          public void onSwipeTop() {
                                              Toast.makeText(MainActivity.this, "arriba", Toast.LENGTH_SHORT).show();
                                          }

                                          public void onSwipeRight() {
                                              Toast.makeText(MainActivity.this, "derecha", Toast.LENGTH_SHORT).show();
                                          }

                                          public void onSwipeLeft() {
                                              Toast.makeText(MainActivity.this, "izquierda", Toast.LENGTH_SHORT).show();
                                          }

                                          public void onSwipeBottom() {
                                              Toast.makeText(MainActivity.this, "abajo", Toast.LENGTH_SHORT).show();
                                          }
                                      }


        );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        String titulo = "";

        if (id == R.id.nav_verListaEntrada) {
            Intent intent = new Intent(MainActivity.this, ListaActivity.class);
            startActivity(intent);
            //fragment=new VerListaFragment();
            //titulo="Ver Lista";
            // Handle the camera action
        }
        //else if (id == R.id.nav_verListaSalida) {
        //Intent intent=new Intent(MainActivity.this,Lista2Activity.class);
        //startActivity(intent);
        //fragment=new VerListaFragment();
        //titulo="Ver Lista";
        // Handle the camera action
        //}
        else if (id == R.id.nav_entrada) {
            Intent intent = new Intent(MainActivity.this, EntradaActivity.class);
            startActivity(intent);

            //fragment=new EntradaFragment();
            //titulo="Marcar Entrada";

        } //else if (id == R.id.nav_salida) {

        //Intent intent=new Intent(MainActivity.this,SalidaActivity.class);
        //startActivity(intent);
        //fragment=new SalidaFragment();
        //titulo="Marcar Salida";}
        //else if(id==R.id.nav_cerrar_sesion){
        //Eliminamos la sesion del sharedPreferences
          /*  SharedPreferences.Editor editor=getSharedPreferences("class3",MODE_PRIVATE).edit();
            editor.clear();
            editor.apply();
            //Cargamos la pantalla de inicio
            Intent intent=new Intent(MainActivity.this,IniciarActivity.class);
            //Agregamos unos flags para limpiar las pantallas, luego de cerrar la sesion
            //Limpia las tareas pendientes
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            //Limpia todo el historial de pantallas
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            //Crea la nueva actividad en una pantalla
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
           finish();}*/
        /*

        if(fragment!=null){
            //Obtenemos la configuracion del fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //Reemplazamos el componente por el fragmento
            fragmentManager.beginTransaction()
                    .replace(R.id.contenedor,fragment)
                    .commit();
            //Cambiamos el titulo a mostrar
            setTitle(titulo);
        }*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
