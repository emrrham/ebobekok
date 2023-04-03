 import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısıını yazın : ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);
        int k = 1;
        int ekok = 1;
        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının ekok'u: " + ekok);


    }

}