package br.edu.uniaeso.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.uniaeso.model.Enquete;

public class EnqueteController {
    Enquete enquete = new Enquete();

    public ArrayList<String> getListaOpcoes() {
        ArrayList<String> listaOpcoes = new ArrayList<String>();
        for (String opt : getOpcoes()) {
            listaOpcoes.add(opt);
        }
        return listaOpcoes;
    }

    public void criarEnquete(List<String> opcoes) {

    }

    public int getVotos(String opcao) {
        return enquete.getVotos(opcao);
    }

    public int getTotalVotos() {
        return enquete.getTotalVotos();
    }

    public void adicionaOpcao(String opcao) {
        enquete.adicionaOpcao(opcao);
    }

    public String[] getOpcoes() {
        return enquete.getOpcoesMap().keySet().toArray(new String[enquete.getOpcoesMap().size()]);
    }

    public void votar(String opcao) {
        enquete.votar(opcao);
    }
}
