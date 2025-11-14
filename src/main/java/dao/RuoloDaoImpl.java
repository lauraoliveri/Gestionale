package dao;

import model.Ruolo;

import java.util.ArrayList;

public class RuoloDaoImpl implements RuoloDao{


    ArrayList<Ruolo> listaRuoli = new ArrayList<>();

    // aggiungi un ruolo alla lista
    public void inserisci(Ruolo r){

        listaRuoli.add(r);
    }

    // aggiorna dati ruolo
    public boolean aggiorna(Ruolo r){

        boolean trovato = false;
        for (Ruolo ruolo : listaRuoli) {
            if (r.getIdRuolo()==(ruolo.getIdRuolo())) {
                trovato = true;
                ruolo.setIdRuolo(r.getIdRuolo());
                ruolo.setDescrizione(r.getDescrizione());
                break;
            }
        }
        return trovato;
    }

    // elimina ruolo
    public boolean elimina(int r){
        boolean eliminato = false;

        for (int i = 0; i < listaRuoli.size(); i++) {
            Ruolo ruolo = listaRuoli.get(i);
            if (r == ruolo.getIdRuolo()) {
                listaRuoli.remove(i); // rimuovo ruolo
                eliminato = true;
                break;
            }
        }

        return eliminato;
    }

    // ricerca ruolo
    public int ricercaRuolo(int r){
        int ru = 0;
        for (Ruolo ruolo : listaRuoli) {
            if (r == ruolo.getIdRuolo()) {
                ru = ruolo.getIdRuolo();
            }
        }
        return ru;
    }
}
