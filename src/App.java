import java.util.Scanner;

import javax.xml.transform.Source;

@SuppressWarnings("unused")
public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double pi=3.14, r, alan, cevre;
        

        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = input.nextDouble();

        alan = pi * r * r;
        System.out.println("Dairenin Alanı: " + alan);
        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
