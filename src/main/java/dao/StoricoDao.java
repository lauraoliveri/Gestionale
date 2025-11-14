package dao;

import model.Storico;

import java.util.ArrayList;

public interface StoricoDao {

    public void inserisci(Storico s);
    public boolean aggiorna(Storico s);
    public boolean elimina(int idStorico);
    public int ricercaStorico(int idStorico);

}
