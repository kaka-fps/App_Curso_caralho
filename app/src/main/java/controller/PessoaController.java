package controller;

import android.content.SharedPreferences;
import android.util.Log;

import View.MainActivity;
import model.Pessoa;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class PessoaController {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listavip";
    SharedPreferences.Editor listaVip;

    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();

    }

    @Override
    public String toString() {
        Log.d("mvc-controller", "CONTROLLER INICIADA");
        return "PessoaController{}";
    }

    public void  SALVAR(Pessoa pessoa, SharedPreferences.Editor editor){
        editor.putString("Nome", pessoa.getPrimeiroNome());
        editor.putString("Sobrenome", pessoa.getSobrenome());
        editor.putString("Curso", pessoa.getCursoDesejado());
        editor.putString("Telefone", pessoa.getTelefoneContato());
        editor.apply();

        Log.d("mvc-controller", "DADOS SALVOS: "  + pessoa.toString());

    }

            public void LIMPAR (EditText primeiroNome, EditText sobreNome, EditText cursoDesejado, EditText telefoneContato) {
                primeiroNome.setText("");
                sobreNome.setText("");
                cursoDesejado.setText("");
                telefoneContato.setText("");
            }
}
