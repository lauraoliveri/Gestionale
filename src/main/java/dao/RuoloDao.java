package dao;

import model.Impiegato;
import model.Ruolo;

import java.util.ArrayList;

public interface RuoloDao {

    public void inserisci(Ruolo r);
    public boolean aggiorna(Ruolo r);
    public boolean elimina(int r);
    public int ricercaRuolo(int r);

}
