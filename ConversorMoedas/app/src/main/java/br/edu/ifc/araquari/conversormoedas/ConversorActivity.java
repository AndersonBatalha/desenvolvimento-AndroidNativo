package br.edu.ifc.araquari.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConversorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_converter;
    private TextView text_valor_convertido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        this.btn_converter = findViewById(R.id.btn_activity_converter);

//        btn_converter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                id_edt = R.id.edit_conversor_valorreal;
//                EditText edt_valorEmReal = findViewById(id_edt);
//
//                id_tv = R.id.text_conversor_valorconvertido;
//                TextView text_valor_convertido = findViewById(id_tv);
//
//                Double valorEmReal = Double.valueOf(edt_valorEmReal.getText().toString());
//
//                Double valorConvertido = valorEmReal / 3.3;
//
//                text_valor_convertido.setText(valorConvertido.toString());
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_activity_converter) {
            EditText edt_valorEmReal = findViewById(R.id.edit_conversor_valorreal);

            TextView text_valor_convertido = findViewById(R.id.text_conversor_valorconvertido);

            Double valorEmReal = Double.valueOf(edt_valorEmReal.getText().toString());

            Double valorConvertido = valorEmReal / 3.3;

            this.text_valor_convertido.setText(String.format("%.2f", valorEmReal /  3));
            }

    }

//    public void converterMoedas(View view) {
//        id_edt = R.id.edit_conversor_valorreal;
//        EditText edt_valorEmReal = findViewById(id_edt);
//
//        id_tv = R.id.text_conversor_valorconvertido;
//        TextView text_valor_convertido = findViewById(id_tv);
//
//        Double valorEmReal = Double.valueOf(edt_valorEmReal.getText().toString());
//
//        Double valorConvertido = valorEmReal / 3.3;
//
//        text_valor_convertido.setText(valorConvertido.toString());
//    }
}
