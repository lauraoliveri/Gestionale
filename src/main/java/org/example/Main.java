package org.example;

import dao.ImpiegatoDao;
import model.Impiegato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



            // Creo il DAO
            ImpiegatoDao dao = new ImpiegatoDao();

            // Inserisco alcuni impiegati
            Impiegato imp1 = new Impiegato("Mario", "Rossi", "MRORSS80A01H501X", 1001);
            Impiegato imp2 = new Impiegato("Luigi", "Bianchi", "LGBNCH85B02H501Y", 1002);

            dao.inserisci(imp1);
            dao.inserisci(imp2);

            System.out.println("Lista iniziale:");
            System.out.println("Ricerca MRORSS80A01H501X: " + dao.ricercaPerCodiceFiscale("MRORSS80A01H501X"));
            System.out.println("Ricerca LGBNCH85B02H501Y: " + dao.ricercaPerCodiceFiscale("LGBNCH85B02H501Y"));

            // 2️⃣ Aggiorno un impiegato
            Impiegato impAggiornato = new Impiegato("Mario", "Verdi", "MRORSS80A01H501X", 1001);
            boolean aggiornato = dao.aggiorna(impAggiornato);
            System.out.println("\nAggiornamento Mario Rossi: " + (aggiornato ? "OK" : "NON TROVATO"));
            System.out.println("Ricerca MRORSS80A01H501X dopo aggiornamento: " + dao.ricercaPerCodiceFiscale("MRORSS80A01H501X"));

            // 3️⃣ Elimino un impiegato
            boolean eliminato = dao.elimina("LGBNCH85B02H501Y");
            System.out.println("\nEliminazione Luigi Bianchi: " + (eliminato ? "OK" : "NON TROVATO"));
            System.out.println("Ricerca LGBNCH85B02H501Y dopo eliminazione: " + dao.ricercaPerCodiceFiscale("LGBNCH85B02H501Y"));


    }
}