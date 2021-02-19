import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz...");

        String hareketler ="Geçerli Hareketler...\n"
                + "Burpee\n"
                + "Pushup (Şınav)\n"
                +"Situp (Mekik)\n"
                +"Squat";

        System.out.println(hareketler);
        System.out.println("Bir idman oluşturun...");

        System.out.print("Burpee Sayısı: ");
        int burpee = sc.nextInt();

        System.out.print("Pushup Sayısı: ");
        int pushup = sc.nextInt();

        System.out.print("Situp Sayısı: ");
        int situp = sc.nextInt();

        System.out.print("Squat Sayısı: ");
        int squat = sc.nextInt();
        sc.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);
        System.out.println("İdmanınız Başlıyor...");

        while (idman.idmanBittiMi()==false){
            System.out.print("Hareket Türü: ");
            String tur = sc.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? : ");
            int sayi = sc.nextInt();
            sc.nextLine();
            idman.hareketYap(tur,sayi);
        }
        System.out.println("İdmanını başarıyla bitirdin. Tebrikler!");

    }
}
