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


        Ksiazka book1 = new Ksiazka("tytul ksiazki 1", "autor ksiazki 1", 100, 10);
        book1.jakaKsiazka();
        System.out.println(book1.czytaj(50));
        System.out.println(book1.czytaj(60));

        Samochod samochod = new Samochod("bmw", "czarny", 40, 198000, 10, 50);
        samochod.coToZaAuto();
        System.out.println("w zbiorniku masz: " + samochod.getIlePaliwa() + "l paliwa");
        System.out.println("Przebieg auta przed trasa: " + samochod.getPrzebieg() + "km");
        samochod.jedz(500);
        System.out.println("Przebieg po trasie: " + samochod.getPrzebieg() + "km");
        System.out.println("w zbiorniku masz: " + samochod.getIlePaliwa() + "l paliwa");
        samochod.tankuj(60);
        System.out.println("w zbiorniku masz: " + samochod.getIlePaliwa() + "l paliwa");

    }
}
