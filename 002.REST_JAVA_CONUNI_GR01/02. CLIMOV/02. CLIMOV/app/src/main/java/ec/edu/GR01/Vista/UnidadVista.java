package ec.edu.GR01.Vista;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import ec.edu.GR01.ClienteWeb.ApiCliente;
import ec.edu.GR01.Controlador.UnidadControlador;
import ec.edu.GR01.Modelo.RespuestaUnidadModelo;
import ec.edu.GR01.R;
import ec.edu.GR01.Servicio.UnidadServicio;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UnidadVista extends AppCompatActivity {

    private EditText etValor;
    private Button btnCmToIn, btnInToCm;
    private TextView tvResultado;
    private UnidadControlador unidadControlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion); // Este debe ser el nombre correcto de tu layout XML

        etValor = findViewById(R.id.etValor);
        btnCmToIn = findViewById(R.id.btnCmToIn);
        btnInToCm = findViewById(R.id.btnInToCm);
        tvResultado = findViewById(R.id.tvResultado);

        unidadControlador = new UnidadControlador(ApiCliente.getClient().create(UnidadServicio.class));

        btnCmToIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertir(true);
            }
        });

        btnInToCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertir(false);
            }
        });
    }

    private void convertir(boolean cmToIn) {
        String input = etValor.getText().toString();
        if (input.isEmpty()) {
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show();
            return;
        }

        double valor = Double.parseDouble(input);
        Call<RespuestaUnidadModelo> llamada = cmToIn
                ? unidadControlador.convertirCentimetrosAPulgadas(valor)
                : unidadControlador.convertirPulgadasACentimetros(valor);

        llamada.enqueue(new Callback<RespuestaUnidadModelo>() {
            @Override
            public void onResponse(Call<RespuestaUnidadModelo> call, Response<RespuestaUnidadModelo> response) {
                if (response.isSuccessful() && response.body() != null) {
                    RespuestaUnidadModelo resultado = response.body();
                    tvResultado.setText("Tipo: " + resultado.getTipo() +
                            "\nEntrada: " + resultado.getEntrada() +
                            "\nResultado: " + resultado.getResultado());
                } else {
                    tvResultado.setText("Error en la conversión");
                }
            }


            @Override
            public void onFailure(Call<RespuestaUnidadModelo> call, Throwable t) {
                tvResultado.setText("Fallo de conexión: " + t.getMessage());
            }
        });
    }
}
