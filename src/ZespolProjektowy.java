import java.util.ArrayList;

public class ZespolProjektowy{
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        pracownicy = new ArrayList<>();
    }
    public void dodajPracownika(Pracownik p){
        pracownicy.add(p);
    }
    public void wypiszSkladZespolu(){
        for(Pracownik p : pracownicy){
            System.out.println(p);
        }
    }
    public double policzLacznyKoszt(){
        double suma = 0;
        for(Pracownik p : pracownicy){
            suma+=p.obliczKosztMiesieczny();
        }
        return suma;
    }
    public Pracownik znajdzPracownika(String id){
        for(Pracownik p : pracownicy){
            if(id.equalsIgnoreCase(p.pobierzIdPracownika())){
                return p;
            }
        }
        return null;
    }
    public void wypiszProgramistow(){
        for(Pracownik p : pracownicy){
            if(p instanceof Programista){
                System.out.println(p);
            }
        }
    }
    public void wypiszTesterowAutomatyzujacych(){
        for(Pracownik p : pracownicy){
            if(p instanceof Tester t){
                if(t.isCzyAutomatyzujacy()){
                    System.out.println(p);
                }

            }
        }
    }

}
