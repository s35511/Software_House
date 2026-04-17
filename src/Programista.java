public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, Double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }
    @Override
    public double obliczKosztMiesieczny(){
        double mnoznikStawki=1.5;
        if(liczbaRepozytoriow>3){
            mnoznikStawki*=1.2;
        }
        return getStawkaBazowa()*mnoznikStawki;
    }
    @Override
    public String przedstawSie(){
        return getImie() + " " + getNazwisko() + " jestem programista i programuje w " + glownyJezyk;
    }
    public String wypiszTechnologie(){
        return "Jezyk " + glownyJezyk + " liczba repozytoriow " + liczbaRepozytoriow;
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "nazwisko='" + getNazwisko() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", idPracownika='" + pobierzIdPracownika() + '\'' +
                ", jezyk programowania='" + glownyJezyk + '\'' +
                ", liczba repozytoriow='" + liczbaRepozytoriow + '\'' +
                '}';
    }

}
