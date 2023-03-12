import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double armut1;
        double elma1;
        double domates1;
        double muz1;
        double patlican1;

        double tarmut;
        double telma;
        double tdomates;
        double tmuz;
        double tpatlican;

        double toplam;

        System.out.print("Armut Kaç Kilo? : ");
        armut1 = input.nextDouble();
        tarmut = armut1*armut;

        System.out.print("Elma Kaç Kilo? : ");
        elma1 = input.nextDouble();
        telma = elma1*elma;

        System.out.print("Domates Kaç Kilo? : ");
        domates1 = input.nextDouble();
        tdomates = domates1*domates;

        System.out.print("Muz Kaç Kilo? : ");
        muz1 = input.nextDouble();
        tmuz = muz1*muz;

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlican1 = input.nextDouble();
        tpatlican = patlican1*patlican;

        toplam = (tarmut + telma + tdomates + tmuz + tpatlican);

        System.out.print("Toplam Tutar : " + toplam);



    }
}