package digitalhouse.com.appbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Toast;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        //TRAEMOS LA Toolbar CON EL id CORRESPONDIENTE AL include QUE HICIMOS EN EL activity_perfil.xml
        Toolbar unToolBar = findViewById(R.id.toolbar_activity_perfil);
        //EL include LA AÑADE VISUALMENTE, HACEMOS EL setSupportActionBar() PARA CONFIGURARLE FUNCIONALIDADES COMO EL MENÚ
        setSupportActionBar(unToolBar);

        //PARA COFIGURARLE A LA Toolbar LA FLECHA DE REGRESO A LA PRIMER PANTALLA NECESITAMOS TRAERNOS LA ActionBar QUE SETEAMOS ARRIBA
        ActionBar unActionBar = getSupportActionBar();
        //CON ESTA ActionBar PODEMOS AÑADIRLE LA FLECHA DE RETORNO CON EL SIGUIENTE MÉTODO:
        unActionBar.setDisplayHomeAsUpEnabled(true);

    }

    /*
    * CON SÓLO HACER EL setDisplayHomeAsUpEnabled() YA ALCANZA PARA QUE LA FLECHA VUELVA A LA PANTALLA ANTERIOR (HABIENDO SETEADO EL parentActivityName EN EL manifest
    *
    * SI QUEREMOS CONFIGURAR NUESTRO PROPIO COMPORTAMIENTO PODEMOS SOBREESCRIBIR EL MÉTODO onSupportNavigateUp() DE LA Activity
    */
    @Override
    public boolean onSupportNavigateUp() {
        Toast.makeText(this, "Este Toast se hizo antes de volver a la MainActivity", Toast.LENGTH_SHORT).show();
        return super.onSupportNavigateUp();
    }
}
