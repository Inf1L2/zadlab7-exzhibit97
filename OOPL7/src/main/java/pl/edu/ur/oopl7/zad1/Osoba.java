package pl.edu.ur.oopl7.zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;

    public Osoba(String imie, String nazwisko, String dataUrodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }


    public Osoba() {
        imie = "";
        nazwisko = "";
        dataUrodzenia = "";
    }

    @Override
    public String toString() {
        return "Imie: "+ getImie() + " | Nazwisko: "+ getNazwisko() + " | Data urodzenia: "+getDataUrodzenia();
    }

    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getDataUrodzenia(){
        return dataUrodzenia;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }


}
