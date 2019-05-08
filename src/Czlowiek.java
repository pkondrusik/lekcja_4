public class Czlowiek {
    String imie;
    String nazwisko;


    public Czlowiek(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    void przedstawSie()
    {
        System.out.println("Nazywam sie " + imie +" "+ nazwisko);
    }


}
