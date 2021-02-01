package Beispiel_1;

public class Turmdemo {
    public static void main(String[] args) {
        int i=2,k=2,vor=2,nach=2,ergebnis;

        while (i>=2 && i<=9) {

            vor=nach;
            ergebnis=vor*i;
            i++;
            System.out.println(ergebnis);
            while (k>=2 && k<=9) {
                nach=ergebnis*i;
                i++;
                k++;
                System.out.println(nach);
               break;
            }
        }
        i--;
        k--;
        while (i>=2 && i<=9) {

            vor=nach;
            ergebnis=vor/i;
            i--;
            System.out.println(ergebnis);
            while (k>=2 && k<=9) {
                nach=ergebnis/i;
                i--;
                k--;
                System.out.println(nach);
                break;
            }
        }
    }
}
