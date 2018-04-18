package pl.edu.ur.oopl7.zad1;

public class Wykladowca extends Osoba{

    private String tytulNaukowy;
    private int lataPracy;
    private int iloscUwalonychStudentow;

    public Wykladowca(String imie, String nazwisko, String dataUrodzenia, String tytulNaukowy, int lataPracy, int iloscUwalonychStudentow){
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setDataUrodzenia(dataUrodzenia);
        this.tytulNaukowy = tytulNaukowy;
        this.lataPracy = lataPracy;
        this.iloscUwalonychStudentow = iloscUwalonychStudentow;
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public int getLataPracy() {
        return lataPracy;
    }

    public int getIloscUwalonychStudentow() {
        return iloscUwalonychStudentow;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    public void setLataPracy(int lataPracy) {
        this.lataPracy = lataPracy;
    }

    public void setIloscUwalonychStudentow(int iloscUwalonychStudentow) {
        this.iloscUwalonychStudentow = iloscUwalonychStudentow;
    }
    @Override
    public String toString() {
        return "Imie: "+ getImie() + " | Nazwisko: "+ getNazwisko() + " | Data urodzenia: "+getDataUrodzenia() +
                " | Tytul naukowy: " +getTytulNaukowy() + " | Lata pracy: " + getLataPracy() + " | Ilosc uwalonych studentow: " +getIloscUwalonychStudentow();
    }
}
