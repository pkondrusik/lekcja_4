public class Ksiazka {
    String tytul = "pan tadeusz";
    String autor = "mickiewicz";
    int iloscStron = 100;
    int iloscPrzeczytanychStron = 0;


    void coToZaKsiazka(){
        System.out.println(tytul + " " + autor);

    }

    int czytaj(int ilePrzeczytal){
        iloscPrzeczytanychStron += ilePrzeczytal;
        return iloscPrzeczytanychStron;
    }

    boolean czyPrzeczytana(int iloscStron, int iloscPrzeczytanychStron){
        if (iloscStron > iloscPrzeczytanychStron) return false;
        else return true;
    }

}
