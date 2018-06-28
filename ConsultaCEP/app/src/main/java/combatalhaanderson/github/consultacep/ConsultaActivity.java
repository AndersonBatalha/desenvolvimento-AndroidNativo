package combatalhaanderson.github.consultacep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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

        CorreiosService correiosService = new CorreiosService(cep);
    }
}
