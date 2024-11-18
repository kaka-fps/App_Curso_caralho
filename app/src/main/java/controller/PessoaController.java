package controller;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;

import model.Pessoa;

public class PessoaController {

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
        editor.commit();

        Log.d("mvc-controller", "DADOS SALVOS: "  + pessoa.toString());




}

}
