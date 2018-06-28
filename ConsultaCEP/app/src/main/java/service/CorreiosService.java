package service;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

import model.CEP;

public class CorreiosService extends AsyncTask<Void, Void, CEP>{

    private String cep;

    public CorreiosService(String cep) {
        if (cep != null && cep.length() == 8) {
            this.cep = cep;
        }
        else {
            throw new IllegalArgumentException("CEP inválido");
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.i("AST", "onPreExecute");
    }

    @Override
    protected void onPostExecute(CEP cep) {
        super.onPostExecute(cep);
        Log.i("AST", "onPostExecute");
    }

    @Override
    protected CEP doInBackground(Void... voids) {
        Log.i("AST", "doInBackground");

        StringBuilder resposta = new StringBuilder();

        try {
            URL url = new URL("https://viacep.com.br/ws/01001000/json/");

            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                connection.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }

            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            try {
                connection.connect();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    resposta.append(scanner.toString());
                }

                Log.i("AST", resposta.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
