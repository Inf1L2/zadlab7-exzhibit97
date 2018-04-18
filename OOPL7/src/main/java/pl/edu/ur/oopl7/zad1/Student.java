package pl.edu.ur.oopl7.zad1;

public class Student extends Osoba {

    private int nrIndeksu;
    private String typStudiow;
    private String kierunekStudiow;
    private int rokStudiow;

    public Student(String imie, String nazwisko, String dataUrodzenia, int nrIndeksu, String typStudiow, String kierunekStudiow, int rokStudiow){
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setDataUrodzenia(dataUrodzenia);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunekStudiow = kierunekStudiow;
        this.rokStudiow = rokStudiow;

    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public String getKierunekStudiow() {
        return kierunekStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public void setKierunekStudiow(String kierunekStudiow) {
        this.kierunekStudiow = kierunekStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }
    @Override
    public String toString() {
        return "Imie: "+ getImie() + " | Nazwisko: "+ getNazwisko() + " | Data urodzenia: "+getDataUrodzenia() +
                " | Indeks: " +getNrIndeksu() + " | Typ studiow: " + getTypStudiow() + " | Kierunek: " +getKierunekStudiow() + " | Rok: " + getRokStudiow();
    }
}
