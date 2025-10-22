package model;

import java.time.LocalDate;

public class Storico {

    private int idStorico;
    private int matricola;
    private int idRuolo;
    private LocalDate dataInizio;
    private LocalDate DataFine;

    public int getIdStorico() {
        return idStorico;
    }

    public void setIdStorico(int idStorico) {
        this.idStorico = idStorico;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getIdRuolo() {
        return idRuolo;
    }

    public void setIdRuolo(int idRuolo) {
        this.idRuolo = idRuolo;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return DataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        DataFine = dataFine;
    }

    public Storico(int idStorico, int matricola, int idRuolo, LocalDate dataInizio, LocalDate dataFine) {
        this.idStorico = idStorico;
        this.matricola = matricola;
        this.idRuolo = idRuolo;
        this.dataInizio = dataInizio;
        DataFine = dataFine;
    }
}
