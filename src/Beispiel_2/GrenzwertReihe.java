package Beispiel_2;

public class GrenzwertReihe {

    private static double Grenzwert;

    public static void main(String[] args) {
        System.out.println(berechneGrenzwert(0.1));

    }

    public static double berechneGrenzwert(double genauigkeit) {
        double aWert=0, vWert=0,divisor=1;

        while (true) {

            aWert+=1.0/divisor;
            if (aWert-vWert<genauigkeit) break;
            vWert=aWert;
            divisor*=2;
            System.out.println(aWert);


        }
        return aWert;
    }
}
