package combatalhaanderson.github.consultacep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import model.CEP;
import service.CorreiosService;


public class ConsultaActivity extends AppCompatActivity {

    EditText edtCEP;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        this.edtCEP = findViewById(R.id.edt_consulta_cep);
        this.tvResultado = findViewById(R.id.tv_consulta_resultado);

    }

    public void buscarCEP(View view) {

        String cep = this.edtCEP.getText().toString();

        try {
            CEP cepRetorno = new CorreiosService(cep).execute().get();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
        }
    }
}
