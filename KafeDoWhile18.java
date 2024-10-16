import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);

        int kopi = 0;
        int teh = 0;
        int roti = 0;
        int totalHarga = 0;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc18.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc18.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc18.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc18.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar: Rp " + totalHarga);
            sc18.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc18.close();
    }
}