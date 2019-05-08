public class Pokoj {
    boolean czyOtwarty;
    private Integer iloscOkien;
    double powierzchnia = 0;
    int numerPietra;
    boolean czyPosprzatany;


    void obliczPowierzchnie(double szerokosc, double dlugosc){
        powierzchnia = szerokosc * dlugosc;

    }

    void pokazPowierzchnie(){
        System.out.println(powierzchnia);
    }

    void setIloscOkien(int okna){
        iloscOkien = okna;
    }

    int getIloscOkien(){
        return iloscOkien;
    }



}
