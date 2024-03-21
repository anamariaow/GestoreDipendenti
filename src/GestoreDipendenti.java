import java.util.ArrayList;

public class GestoreDipendenti {
    private ArrayList<Dipendente> dipendenteArrayList;

    public GestoreDipendenti() {
        this.dipendenteArrayList = new ArrayList<>();
    }

    public ArrayList<Dipendente> getDipendenteArrayList() {
        return dipendenteArrayList;
    }

    public void setDipendenteArrayList(ArrayList<Dipendente> dipendenteArrayList) {
        this.dipendenteArrayList = dipendenteArrayList;
    }
    public void aggiungiDipendente(Dipendente dipendente) {
        dipendenteArrayList.add(dipendente);
    }
    {

    }
    public void rimuoviDipendente(Dipendente dipendente) {
        dipendenteArrayList.remove(dipendente);
    }

    public void visualizzaElenco() {
        for (Dipendente dipendente : dipendenteArrayList) {
            dipendente.stampaDettagli();
        }
    }

    public Double calcoloTotale() {
        Double stipendioTotale = 0.0;
        for (Dipendente dipendente : dipendenteArrayList) {
            stipendioTotale += dipendente.calcolaSalarioAnnuo();
        }
        return stipendioTotale;
    }

}
