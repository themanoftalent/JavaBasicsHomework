import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Hesap Makinesi Menüsü:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");

        System.out.print("Bir işlem seçin (1/2/3/4): ");
        String secim = tarayici.nextLine();

        int sayi1, sayi2, sonuc;

        switch (secim) {
            case "1":
                System.out.print("Birinci sayıyı girin: ");
                sayi1 = tarayici.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                sayi2 = tarayici.nextInt();
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case "2":
                System.out.print("Birinci sayıyı girin: ");
                sayi1 = tarayici.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                sayi2 = tarayici.nextInt();
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case "3":
                System.out.print("Birinci sayıyı girin: ");
                sayi1 = tarayici.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                sayi2 = tarayici.nextInt();
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;

            case "4":
                System.out.print("Bölüneni girin: ");
                sayi1 = tarayici.nextInt();
                System.out.print("Böleni girin: ");
                sayi2 = tarayici.nextInt();

                if (sayi2 == 0) {
                    System.out.println("Sıfıra bölme hatası!");
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                }
                break;

            default:
                System.out.println("Geçersiz seçenek!");
        }
    }
}
