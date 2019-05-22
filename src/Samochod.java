public class Samochod {
    private String markaAuta;
    private String kolorAuta;
    private int ilePaliwa;
    private int jakiPrzebieg;
    private double spalanie;
    private int pojemnoscZbiornika;

    public Samochod (String markaAuta, String kolorAuta, int iloscPaliwa, int jakiPrzebieg, double spalanie, int pojemnoscZbiornika) {
        this.markaAuta = markaAuta;
        this.kolorAuta = kolorAuta;
        this.ilePaliwa = iloscPaliwa;
        this.jakiPrzebieg = jakiPrzebieg;
        this.spalanie = spalanie / 100;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
    }

    void coToZaAuto() {
        System.out.println("\nAuto to " + markaAuta + " w kolorze " + kolorAuta + "m.");
    }


    public int getIlePaliwa() {
        return ilePaliwa;
    }

    public int getPrzebieg() {
        return jakiPrzebieg;
    }

    void jedz(int kilometry) {
        if (ilePaliwa < (kilometry * spalanie)) {
            double przejechaneKM = ilePaliwa / spalanie;
            ilePaliwa = 0;
            jakiPrzebieg += przejechaneKM;
            System.out.println("Przejechałeś " + przejechaneKM + "km i skończyło ci się paliwo.");
        //    kilometry += przejechaneKM;
        } else {
            kilometry += kilometry;
            ilePaliwa -= kilometry * spalanie;
            jakiPrzebieg += kilometry;
            System.out.println("Przejechałeś " + kilometry + "km.");
        }
    }

    void tankuj(double iloscPaliwaZatankowanego) {
        if (iloscPaliwaZatankowanego > (pojemnoscZbiornika - ilePaliwa)) {
            double ile = pojemnoscZbiornika - ilePaliwa;
            ilePaliwa += ile;
            if (ile > 0) System.out.println("Za mała pojemność baku.\nZatankowano tylko " + ile + "l paliwa.");
            else System.out.println("Za mała pojemność baku.\nZatankowano tylko " + ile * (-1) + "l paliwa.");
        } else {
            ilePaliwa += iloscPaliwaZatankowanego;
            System.out.println("Zatankowano " + iloscPaliwaZatankowanego + "l paliwa.");
        }
    }
}