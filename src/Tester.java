public class Tester extends Pracownik{
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return getStawkaBazowa()*1.2;
    }
    @Override
    public String przedstawSie(){
        return getImie() + " " + getNazwisko() + " jestem testerem";
    }
    public String uruchomRaportTestow(){
        return "testy zostaly wykonane dla " + liczbaScenariuszy + " scenariuszy";
    }


}
