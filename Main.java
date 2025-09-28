package main;

import service.CrudService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudService crud = new CrudService();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n        Selamat Datang di Pomodoro Tracker        ");
            System.out.println("Manajemen Waktu Belajarmu dengan Pomodoro Tracker!");
            System.out.println("===  Manajemen Waktu Belajar/Pomodoro Tracker  ===");
            System.out.println("1. Tambah Sesi Belajar");
            System.out.println("2. Lihat Semua Sesi Belajar");
            System.out.println("3. Update Sesi Belajar");
            System.out.println("4. Hapus Sesi Belajar");
            System.out.println("5. Cari Sesi Belajar");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            while (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka yang valid (1-6).");
                sc.next();
                System.out.print("Pilih menu: ");
            }
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> crud.tambahSesi();
                case 2 -> crud.tampilkanSesi();
                case 3 -> crud.updateSesi();
                case 4 -> crud.hapusSesi();
                case 5 -> crud.cariSesi();
                case 6 -> System.out.println("Terima kasih telah mengunjungi Pomodoro Tracker.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        sc.close();
    }
}
