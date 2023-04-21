import java.util.Scanner;

public class Portafoglio extends PortaMonete{
    int b5;
    int b10;
    int b20;

    double soldoni = 0;

    public Portafoglio(){
        this.b5 = 0;
        this.b10 = 0;
        this.b20 = 0;
    }

    public Portafoglio(int b5, int b10, int b20){
        this.b5 = b5;
        this.b10 = b10;
        this.b20 = b20;
    }

    public int getB5() {
        return b5;
    }

    public int getB10() {
        return b10;
    }

    public int getB20() {
        return b20;
    }

    public void setB5(int b5) {
        this.b5 = b5;
    }

    public void setB10(int b10) {
        this.b10 = b10;
    }

    public void setB20(int b20) {
        this.b20 = b20;
    }
    @Override
    public double disponibilita(){
        double soldi = getB5()*5 + getB10()*10 + getB20()*20;
        if(soldi == 0){
            System.out.print("SEI AL VERDE O HAI SOLO MONETE");
        }
        else{
            return soldi;
        }
        return soldi;
    }

    @Override
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


    @Override
    public void inserisci(){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un altra banconota: ");
        valore = tastiera.nextInt();

        if(valore == 5){
            setB5(b5 + 1);
        } else if (valore == 10) {
            setB10(b10 + 1);
        }
        else if(valore == 20){
            setB20(b20 + 1);
        }
        else{
            System.out.println("Non esiste una banconota da più di 20 euro");
        }

        System.out.println();
        System.out.println("Ora la tua disponibilita est: " + disponibilita());
        System.out.print("Conversione in lettere: ");
        conversioneEuro();
    }

    @Override
    public void inserisciDiPiu(){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Quante altre banconote vuoi inserire: ");
        int nBanconote = tastiera.nextInt();

        for(int i=0; i<nBanconote;i++){
            System.out.print("Inserisci un altra banconota: ");
            valore = tastiera.nextInt();


            if(valore == 5){
                setB5(b5 + 1);
            } else if (valore == 1) {
                setB10(b10 + 1);
            }
            else{
                setB20(b20 + 1);
            }

        }
        System.out.println("Ora la tua disponibilita est: " + disponibilita() + " euro");
        System.out.print("Conversione in lettere: ");
        conversioneEuro();
    }

    public void denaroPerTipo(){
        System.out.println("\n");
        System.out.print("Banconote da 5 euro: ");
        System.out.println(getB5());

        System.out.print("Banconote da 10 euro: ");
        System.out.println(getB10());

        System.out.print("Banconote da 20 euro: ");
        System.out.println(getB20());
    }

    public double getMonete(){
        return super.disponibilita();
    }

    public double setdisponibilita(){
        this.soldoni = this.disponibilita() + super.getDisponibilita();
        return soldoni;
    }


    public double contoTotale(){
        setdisponibilita();
        return soldoni;
    }



}
