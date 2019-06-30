package digitalhouse.com.appbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TRAEMOS LA Toolbar CON EL id CORRESPONDIENTE AL include QUE HICIMOS EN EL activity_main.xml
        Toolbar miToolbar = findViewById(R.id.toolbar_activity_main);
        //EL include LA AÑADE VISUALMENTE, HACEMOS EL setSupportActionBar() PARA CONFIGURARLE FUNCIONALIDADES COMO EL MENÚ
        setSupportActionBar(miToolbar);
    }

    //SOBREESCRIBIMOS ESTE MÉTODO PARA INFLAR EL MENÚ DE NUESTRA ActionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    //SOBREESCRIBIMOS ESTE MÉTODO PARA REACCIONAR AL item ELEGIDO EN EL menu DE LA ActionBar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.perfil_item:
                startActivity(new Intent(MainActivity.this,PerfilActivity.class));
                return true;
            case R.id.toast_item:
                Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
