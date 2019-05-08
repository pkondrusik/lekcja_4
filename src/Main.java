public class Main {

    public static void main(String[] args) {

        Pokoj maczuPikczu = new Pokoj();


        maczuPikczu.pokazPowierzchnie();
        maczuPikczu.obliczPowierzchnie(10,10);
        maczuPikczu.pokazPowierzchnie();

        maczuPikczu.setIloscOkien(4);
        System.out.println(maczuPikczu.getIloscOkien());

        Czlowiek lukasz = new Czlowiek("lukasz", "jakis tam");
        Czlowiek marcin = new Czlowiek("marcin", "p");
        lukasz.przedstawSie();
        marcin.przedstawSie();

        Ksiazka pan = new Ksiazka();

        pan.coToZaKsiazka();
        System.out.println(pan.czytaj(10));

        System.out.println(pan.czyPrzeczytana(100, 70));

    }
}
