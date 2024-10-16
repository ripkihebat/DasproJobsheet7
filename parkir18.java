import java.util.Scanner;

public class parkir18 {
    public static void main(String[] args) {
        
        int jenis, durasi, total = 0;
        Scanner sc18 = new Scanner(System.in);

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc18.nextInt();

            if (jenis == 1 || jenis == 2) { 
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc18.nextInt();

                if (durasi > 5) {
                    total += 12500;  
                } else if (jenis == 1) {
                    total += durasi * 3000;  
                } else if (jenis == 2) {
                    total += durasi * 2000; 
                }
            }

        } while (jenis != 0);  

        System.out.println("Total pembayaran parkir: Rp " + total);

        sc18.close(); 
    }
}