import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        //kulanıcıdan bir sayı alın
        System.out.println("fibonacci serisinin eleman sayısını giriniz:");
        int n = klavye.nextInt();

        //Girdiğiniz değeri kontrol edin.
        if (n <= 0) {
            System.out.println("lütfen pozitif bir sayı giriniz:");
        } else {
            System.out.println("fibonacci serisi");
            //fibonacci serisisni hesapla ve yazdır
            main(n);
        }

        klavye.close();
    }

    public static void main(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            //ilk sayıyı yazdır.
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}



