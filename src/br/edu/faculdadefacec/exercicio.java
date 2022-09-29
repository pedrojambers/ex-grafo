package br.edu.faculdadefacec;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class exercicio {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> hashtable
                = new Hashtable<String, ArrayList<String>>();

        ArrayList<String> listaContatosVoce
                = new ArrayList<String>();

        listaContatosVoce.add("CLAIRE");
        listaContatosVoce.add("BOB");
        listaContatosVoce.add("ALICE");

        hashtable.put("VOCE", listaContatosVoce);

        ArrayList<String> listaContatosClaire
                = new ArrayList<String>();

        listaContatosClaire.add("THOM");
        listaContatosClaire.add("JONNY");

        hashtable.put("CLAIRE", listaContatosClaire);

        ArrayList<String> listaContatosBob
                = new ArrayList<String>();

        listaContatosBob.add("ANUJ");
        listaContatosBob.add("PEGGY");

        hashtable.put("BOB", listaContatosBob);

        ArrayList<String> listaContatosAlice
                = new ArrayList<String>();

        listaContatosAlice.add("PEGGY");

        hashtable.put("ALICE", listaContatosAlice);

        for(Map.Entry<String, ArrayList<String>> entidade
                : hashtable.entrySet()){
            String chave = entidade.getKey();
            ArrayList<String> valor = entidade.getValue();

            System.out.println(chave + " / " + valor);
        }
    }
}
