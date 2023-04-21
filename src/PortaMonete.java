import javax.sound.sampled.Port;
import java.util.Scanner;

public class PortaMonete{

    int monetacinquanta;
    int moneta1;
    int moneta2;
    double valore;
    public PortaMonete(){
        this.monetacinquanta = 0;
        this.moneta1 = 0;
        this.moneta2 = 0;
    }

    public PortaMonete(int monetacinquanta, int moneta1, int moneta2){
        this.monetacinquanta = monetacinquanta;
        this.moneta1 = moneta1;
        this.moneta2 = moneta2;
    }

    public int getMonetacinquanta() {
        return monetacinquanta;
    }

    public int getMoneta1() {
        return moneta1;
    }

    public int getMoneta2() {
        return moneta2;
    }

    public void setMonetacinquanta(int monetacinquanta) {
        this.monetacinquanta = monetacinquanta;
    }

    public void setMoneta1(int moneta1) {
        this.moneta1 = moneta1;
    }

    public void setMoneta2(int moneta2) {
        this.moneta2 = moneta2;
    }

    public double disponibilita(){
        double soldi = getMoneta1()*1 + getMoneta2()*2 + getMonetacinquanta()*0.50;
        if(soldi == 0){
            //System.out.print("SEI AL VERDE ");
        }
        else{
            return soldi;
        }
        return soldi;
    }

    public void conversioneEuro(){
        int n = (int)disponibilita();
        int unita = n%10;
        int decine =(n/10)%10;
        int centinaia = (n/100)%10;
        int migliaia =  n/1000;


        switch (migliaia){
            case 1:
                System.out.print("mille");
                break;

            case 2:
                System.out.print("duemila");
                break;

            case 3:
                System.out.print("tremila");
                break;

            case 4:
                System.out.print("quattromila");
                break;

            case 5:
                System.out.print("cinquemila");
                break;

            case 6:
                System.out.print("seimila");
                break;

            case 7:
                System.out.print("settemila");
                break;

            case 8:
                System.out.print("ottomila");
                break;

            case 9:
                System.out.print("novemila");
                break;
        }
        switch (centinaia) {
            case 1:
                System.out.print("cento");
                break;

            case 2:
                System.out.print("duecento");
                break;

            case 3:
                System.out.print("trecento");
                break;

            case 4:
                System.out.print("quattrcento");
                break;

            case 5:
                System.out.print("cinquecento");
                break;

            case 6:
                System.out.print("seicento");
                break;

            case 7:
                System.out.print("settecento");
                break;

            case 8:
                System.out.print("ottocento");
                break;

            case 9:
                System.out.print("novecento");
                break;
        }
        switch (decine) {
            case 1:
                System.out.print("dieci");
                break;

            case 2:
                System.out.print("venti");
                break;

            case 3:
                System.out.print("trenta");
                break;

            case 4:
                System.out.print("quaranta");
                break;

            case 5:
                System.out.print("cinquanta");
                break;

            case 6:
                System.out.print("sessanta");
                break;

            case 7:
                System.out.print("settanta");
                break;

            case 8:
                System.out.print("ottanta");
                break;

            case 9:
                System.out.print("novanta");
                break;
        }
        switch (unita){
            case 1:
                System.out.print("uno");
                break;

            case 2:
                System.out.print("due");
                break;

            case 3:
                System.out.print("tre");
                break;

            case 4:
                System.out.print("quattro");
                break;

            case 5:
                System.out.print("cinque");
                break;

            case 6:
                System.out.print("sei");
                break;

            case 7:
                System.out.print("sette");
                break;

            case 8:
                System.out.print("otto");
                break;

            case 9:
                System.out.print("nove");
                break;
        }

    }

    public void inserisci(){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un altra moneta: ");
        valore = tastiera.nextDouble();

        if(valore == 0.50){
            setMonetacinquanta(monetacinquanta + 1);
        } else if (valore == 1) {
            setMoneta1(moneta1 + 1);
        }
        else if(valore == 2){
            setMoneta2(moneta2 + 1);
        }
        else{
            System.out.println("Non esiste una moneta da 3 euro");
        }

        System.out.println();
        System.out.println("Ora la tua disponibilita est: " + disponibilita());
        System.out.print("Conversione in lettere: ");
        conversioneEuro();
    }

    public void inserisciDiPiu(){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Quante altre monete vuoi inserire: ");
        int nMonete = tastiera.nextInt();

        for(int i=0; i<nMonete;i++){
            System.out.print("Inserisci un altra moneta: ");
            valore = tastiera.nextDouble();


            if(valore == 0.50){
                setMonetacinquanta(monetacinquanta + 1);
            } else if (valore == 1) {
                setMoneta1(moneta1 + 1);
            }
            else{
                setMoneta2(moneta2 + 1);
            }

        }
        System.out.println("Ora la tua disponibilita est: " + disponibilita() + " euro");
        System.out.print("Conversione in lettere: ");
        conversioneEuro();
    }

    public void denaroPerTipo(){
        System.out.println("\n");
        System.out.print("Monete da 50 cent: ");
        System.out.println((int)getMonetacinquanta());

        System.out.print("Monete da 1 euro: ");
        System.out.println(getMoneta1());

        System.out.print("Monete da 2 euro: ");
        System.out.println(getMoneta2());
    }

}

