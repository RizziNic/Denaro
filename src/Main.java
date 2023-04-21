import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {
        PortaMonete prova = new PortaMonete(2, 3, 4);
        //PortaMonete prova2 = new PortaMonete();
        Portafoglio prova2 = new Portafoglio(2, 5, 1);

        System.out.print("Disponibilità: ");
        System.out.println(prova.disponibilita() + " euro");

        System.out.print("Conversione in lettere: ");
        prova.conversioneEuro();
        System.out.println("\n");

        prova.inserisci();
        System.out.println();
        prova.inserisciDiPiu();

        prova.denaroPerTipo();

        System.out.print("Disponibilità: ");
        System.out.println(prova2.disponibilita() + " euro");

        System.out.print("Conversione in lettere: ");
        prova2.conversioneEuro();
        System.out.println("\n");

        prova2.inserisci();
        System.out.println();
        prova2.inserisciDiPiu();

        prova2.denaroPerTipo();

        double dispomonete = prova.disponibilita();
        double dispobanconote = prova2.disponibilita();
        double somma = dispomonete + dispobanconote;

        System.out.print("Conto totale: ");
        System.out.println(somma);


    }
}