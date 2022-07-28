import java.util.Scanner;

public class DongulerOrt {
    public static void main(String[] args) {
        int a, adet=0, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        a = input.nextInt();

        for (int i = 1; i<=a; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
                toplam +=i;
                adet++;
            }
        }
        System.out.print("Ortalama :" + toplam/adet);
    }
}
