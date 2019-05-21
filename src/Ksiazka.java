public class Ksiazka {
    private String tytul;
    private String autor;
    private int ileStron;
    private int ilePrzeczytanych = 10;

    public Ksiazka(String tytul, String autor, int iloscStron, int ilePrzeczytanych) {
        this.tytul = tytul;
        this.autor = autor;
        this.ileStron = iloscStron;
        this.ilePrzeczytanych = ilePrzeczytanych;
    }


    void jakaKsiazka() {
        System.out.println(this.tytul + " " + this.autor + ". Przeczytales " + this.ilePrzeczytanych + " stron");
    }


    boolean czyPrzeczytana() {
        if ((ilePrzeczytanych == ileStron) || (ilePrzeczytanych > ileStron))
            return true;
        else
            return false;
    }


    String czytaj(int ileStron) {
        if (czyPrzeczytana() == true)
            return "Ksiazka przeczytana";
        else if (ilePrzeczytanych + ileStron > this.ileStron) {
            ilePrzeczytanych = this.ileStron;
            return "Przeczytałeś cala ksiazke - " + this.ileStron + " stron.";
        }

        else
        {
            ilePrzeczytanych += ileStron;
            return "Przeczytałeś " + ilePrzeczytanych + " stron.";
        }
    }
}
