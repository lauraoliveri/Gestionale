package dao;

import model.Impiegato;

import java.util.ArrayList;

public class ImpiegatoDaoImpl implements ImpiegatoDao{

    ArrayList<Impiegato> listaImpiegato = new ArrayList<>();

    public String ricercaPerCodiceFiscale(String codiceFiscale){
        String i = null;
        for (Impiegato impiegato : listaImpiegato) {
            if (codiceFiscale.equalsIgnoreCase(impiegato.getCodiceFiscale())) {
                i = impiegato.getNome();
            }
        }

        return i;
    }

    // aggiungi un impiegato alla lista
    public void inserisci(Impiegato i){

        listaImpiegato.add(i);
    }

    // aggiorna dati impiegato
    public boolean aggiorna(Impiegato i){

        boolean trovato = false;
        for (Impiegato impiegato : listaImpiegato) {
            if (i.getCodiceFiscale().equalsIgnoreCase(impiegato.getCodiceFiscale())) {
                trovato = true;
                impiegato.setNome(i.getNome());
                impiegato.setCognome(i.getCognome());
                impiegato.setCodiceFiscale(i.getCodiceFiscale());
                impiegato.setMatricola(i.getMatricola());
                break;
            }
        }
        return trovato;
    }

    // elimina dati impiegato
    public boolean elimina(String codiceFiscale){
        boolean eliminato = false;

        for (int i = 0; i < listaImpiegato.size(); i++) {
            Impiegato impiegato = listaImpiegato.get(i);
            if (codiceFiscale.equalsIgnoreCase(impiegato.getCodiceFiscale())) {
                listaImpiegato.remove(i); // rimuovo l'impiegato
                eliminato = true;
                break;
            }
        }

        return eliminato;
    }

}
