package dao;

import model.Storico;

import java.util.ArrayList;

public class StoricoDaoImpl implements StoricoDao {
    ArrayList<Storico> listaStorici = new ArrayList<>();

    // aggiungi uno storico alla lista
    public void inserisci(Storico s) {
        listaStorici.add(s);
    }

    // aggiorna dati storico
    public boolean aggiorna(Storico s) {
        boolean trovato = false;
        for (Storico storico : listaStorici) {
            if (s.getIdStorico() == storico.getIdStorico()) {
                trovato = true;
                storico.setMatricola(s.getMatricola());
                storico.setIdRuolo(s.getIdRuolo());
                storico.setDataInizio(s.getDataInizio());
                storico.setDataFine(s.getDataFine());
                break;
            }
        }
        return trovato;
    }

    // elimina storico
    public boolean elimina(int idStorico) {
        boolean eliminato = false;

        for (int i = 0; i < listaStorici.size(); i++) {
            Storico storico = listaStorici.get(i);
            if (idStorico == storico.getIdStorico()) {
                listaStorici.remove(i); // rimuovo lo storico
                eliminato = true;
                break;
            }
        }

        return eliminato;
    }

    // ricerca storico tramite id
    public int ricercaStorico(int idStorico) {
        int trovato = 0;
        for (Storico storico : listaStorici) {
            if (idStorico == storico.getIdStorico()) {
                trovato = storico.getIdStorico();
            }
        }
        return trovato;
    }
}
