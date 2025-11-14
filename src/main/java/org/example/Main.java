package org.example;

import dao.ImpiegatoDao;
import dao.ImpiegatoDaoImpl;
import dao.RuoloDao;
import dao.StoricoDao;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



            // Creo il DAO
            ImpiegatoDao dao = new ImpiegatoDaoImpl();

            // Inserisco alcuni impiegati
            Impiegato imp1 = new Impiegato("Mario", "Rossi", "MRORSS80A01H501X", 1001);
            Impiegato imp2 = new Impiegato("Luigi", "Bianchi", "LGBNCH85B02H501Y", 1002);

            dao.inserisci(imp1);
            dao.inserisci(imp2);

            System.out.println("Lista iniziale:");
            System.out.println("Ricerca MRORSS80A01H501X: " + dao.ricercaPerCodiceFiscale("MRORSS80A01H501X"));
            System.out.println("Ricerca LGBNCH85B02H501Y: " + dao.ricercaPerCodiceFiscale("LGBNCH85B02H501Y"));

            // Aggiorno un impiegato
            Impiegato impAggiornato = new Impiegato("Mario", "Verdi", "MRORSS80A01H501X", 1001);
            boolean aggiornato = dao.aggiorna(impAggiornato);
            System.out.println("\nAggiornamento Mario Rossi: " + (aggiornato ? "OK" : "NON TROVATO"));
            System.out.println("Ricerca MRORSS80A01H501X dopo aggiornamento: " + dao.ricercaPerCodiceFiscale("MRORSS80A01H501X"));

            // Elimino un impiegato
            boolean eliminato = dao.elimina("LGBNCH85B02H501Y");
            System.out.println("\nEliminazione Luigi Bianchi: " + (eliminato ? "OK" : "NON TROVATO"));
            System.out.println("Ricerca LGBNCH85B02H501Y dopo eliminazione: " + dao.ricercaPerCodiceFiscale("LGBNCH85B02H501Y"));



            // TEST Ruolo e RuoloDao

            RuoloDao ruoloDao = new RuoloDao();

            // inserisco ruoli
            Ruolo ruolo1 = new Ruolo();
            ruolo1.setIdRuolo(1);
            ruolo1.setDescrizione("Amministratore");

            Ruolo ruolo2 = new Ruolo();
            ruolo2.setIdRuolo(2);
            ruolo2.setDescrizione("Utente");

            ruoloDao.inserisci(ruolo1);
            ruoloDao.inserisci(ruolo2);

            System.out.println("=== RUOLI INSERITI ===");
            System.out.println("Ruolo 1 ID: " + ruoloDao.ricercaRuolo(1));
            System.out.println("Ruolo 2 ID: " + ruoloDao.ricercaRuolo(2));

            // aggiorno ruolo1
            ruolo1.setDescrizione("Super Amministratore");
            boolean aggiornatoRuolo = ruoloDao.aggiorna(ruolo1);
            System.out.println("\nAggiornamento Ruolo 1: " + (aggiornatoRuolo ? "OK" : "NON TROVATO"));

            // elimino ruolo2
            boolean eliminatoRuolo = ruoloDao.elimina(2);
            System.out.println("Eliminazione Ruolo 2: " + (eliminatoRuolo ? "OK" : "NON TROVATO"));

            System.out.println("Ruolo 2 ID dopo eliminazione: " + ruoloDao.ricercaRuolo(2));


            // TEST Storico e StoricoDao

            StoricoDao storicoDao = new StoricoDao();

            // creo due storici
            Storico storico1 = new Storico(1, 1001, 1, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 12, 31));
            Storico storico2 = new Storico(2, 1002, 1, LocalDate.of(2021, 2, 1), LocalDate.of(2022, 12, 31));

            // inserisco storici
            storicoDao.inserisci(storico1);
            storicoDao.inserisci(storico2);

            System.out.println("\n=== STORICI INSERITI ===");
            System.out.println("Storico 1 ID: " + storicoDao.ricercaStorico(1));
            System.out.println("Storico 2 ID: " + storicoDao.ricercaStorico(2));

            // aggiorno storico1
            storico1.setDataFine(LocalDate.of(2022, 6, 30));
            boolean aggiornatoStorico = storicoDao.aggiorna(storico1);
            System.out.println("\nAggiornamento Storico 1: " + (aggiornatoStorico ? "OK" : "NON TROVATO"));

            // elimino storico2
            boolean eliminatoStorico = storicoDao.elimina(2);
            System.out.println("Eliminazione Storico 2: " + (eliminatoStorico ? "OK" : "NON TROVATO"));

            System.out.println("Storico 2 ID dopo eliminazione: " + storicoDao.ricercaStorico(2));

    }
}