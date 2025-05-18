package ec.edu.GR01;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Lanzar directamente LoginVista
        Intent intent = new Intent(this, ec.edu.GR01.Vista.LoginVista.class);
        startActivity(intent);
        finish(); // Para que no se pueda regresar con el botón "atrás"
    }
}
