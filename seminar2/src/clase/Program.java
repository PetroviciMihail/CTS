package clase;

import clase.interfete.IReader;
import clase.readers.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
		IReader reader = new AngajatReader();
        try {
            listaAngajati = reader.readAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
