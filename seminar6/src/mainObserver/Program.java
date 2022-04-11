package mainObserver;

import observer.Autobuz;
import observer.Calator;
import observer.ICalator;
import observer.MijlocTransport;

public class Program {

    public static void main(String[] args) {

        MijlocTransport autobuz = new Autobuz(133);

        ICalator calator1 = new Calator("Popescu");
        ICalator calator2 = new Calator("Petrezcu");
        ICalator calator3 = new Calator("Ionel");
        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.stergeCalator(calator2);
        autobuz.adaugaCalator(calator3);
        autobuz.anuntaCalatori();
    }
}
