package service;

import model.SesiBelajar;
import model.SesiFokus;
import model.SesiIstirahat;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudService {
    private ArrayList<SesiBelajar> daftarSesi;
    private Scanner input;

    public CrudService() {
        daftarSesi = new ArrayList<>();
        input = new Scanner(System.in);

        SesiFokus sesi1 = new SesiFokus("Fisika", 20);
        sesi1.tambahTugas("Review Materi Hukum Termodinamika I & II");

        SesiFokus sesi2 = new SesiFokus("Matematika", 30);
        sesi2.tambahTugas("Mengerjakan Tugas Limit 1");
        sesi2.tambahTugas("Mengerjakan Quiz Limit");

        SesiIstirahat sesi3 = new SesiIstirahat("Istirahat Siang", 60, 30);

        daftarSesi.add(sesi1);
        daftarSesi.add(sesi2);
        daftarSesi.add(sesi3);
    }

    // CREATE
    public void tambahSesi() {
        System.out.println("Pilih jenis sesi yang ingin ditambahkan:");
        System.out.println("1. Sesi Fokus");
        System.out.println("2. Sesi Istirahat");
        System.out.print("Pilihan Anda: ");
        int pilihan = validasiInputInt("");

        System.out.print("Masukkan nama sesi: ");
        String nama = input.nextLine();
        int waktuBelajar = validasiInputInt("Masukkan waktu belajar (menit): ");
        
        if (pilihan == 1) {
            SesiFokus sesiFokus = new SesiFokus(nama, waktuBelajar);
            String tambahTugas;
            do {
                System.out.print("Masukkan tugas (atau ketik 'selesai'): ");
                tambahTugas = input.nextLine();
                if (!tambahTugas.equalsIgnoreCase("selesai")) {
                    sesiFokus.tambahTugas(tambahTugas);
                }
            } while (!tambahTugas.equalsIgnoreCase("selesai"));
            daftarSesi.add(sesiFokus);
            System.out.println("Sesi fokus berhasil ditambahkan.");
            sesiFokus.mulai();               
            sesiFokus.mulai(waktuBelajar);   
        } else if (pilihan == 2) {
            int waktuIstirahat = validasiInputInt("Masukkan waktu istirahat (menit): ");
            SesiIstirahat sesiIstirahat = new SesiIstirahat(nama, waktuBelajar, waktuIstirahat);
            daftarSesi.add(sesiIstirahat);
            System.out.println("Sesi istirahat berhasil ditambahkan.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    // READ
    public void tampilkanSesi() {
        if (daftarSesi.isEmpty()) {
            System.out.println("Belum ada sesi belajar.");
        } else {
            System.out.println("===  Daftar Sesi Belajar  ===");
            for (int i = 0; i < daftarSesi.size(); i++) {
                SesiBelajar s = daftarSesi.get(i);
                System.out.println((i + 1) + ". ");
                s.infoSesi(); 
                System.out.println("------------------------------------");
            }
        }
    }

    // UPDATE
    public void updateSesi() {
        tampilkanSesi();
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi yang dapat diupdate.");
            return;
        }

        System.out.print("Pilih nomor sesi belajar yang ingin diupdate: ");
        int idxUpdate = validasiInputInt("");
        if (idxUpdate > 0 && idxUpdate <= daftarSesi.size()) {
            SesiBelajar s = daftarSesi.get(idxUpdate - 1);

            System.out.print("Nama sesi belajar baru (" + s.getNamaSesi() + "): ");
            String newNama = input.nextLine();
            if (!newNama.isEmpty()) {
                s.setNamaSesi(newNama);
            }

            System.out.print("Waktu belajar baru (" + s.getWaktuBelajar() + "): ");
            String ws = input.nextLine();
            if (!ws.isEmpty()) {
                s.setWaktuBelajar(Integer.parseInt(ws));
            }
            
            if (s instanceof SesiFokus sesiFokus) {
                System.out.print("Apakah ingin update daftar tugas? (y/n): ");
                String jawab = input.nextLine();
                if (jawab.equalsIgnoreCase("y")) {
                    sesiFokus.getDaftarTugas().clear();
                    String tugasBaru;
                    do {
                        System.out.print("Masukkan tugas (atau 'selesai'): ");
                        tugasBaru = input.nextLine();
                        if (!tugasBaru.equalsIgnoreCase("selesai")) {
                            sesiFokus.tambahTugas(tugasBaru);
                        }
                    } while (!tugasBaru.equalsIgnoreCase("selesai"));
                }
            } else if (s instanceof SesiIstirahat sesiIstirahat) {
                System.out.print("Waktu istirahat baru (" + sesiIstirahat.getWaktuIstirahat() + "): ");
                String wi = input.nextLine();
                if (!wi.isEmpty()) {
                    sesiIstirahat.setWaktuIstirahat(Integer.parseInt(wi));
                }
            }
            
            System.out.println("Sesi telah berhasil diupdate!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapusSesi() {
        tampilkanSesi();
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi yang bisa dihapus.");
            return;
        }

        System.out.print("Pilih nomor sesi yang ingin dihapus: ");
        int idxHapus = validasiInputInt("");
        if (idxHapus > 0 && idxHapus <= daftarSesi.size()) {
            daftarSesi.remove(idxHapus - 1);
            System.out.println("Sesi telah berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // SEARCH
    public void cariSesi() {
        System.out.print("Masukkan nama sesi yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("=== Hasil Pencarian ===");
        for (SesiBelajar sesi : daftarSesi) {
            if (sesi.getNamaSesi().toLowerCase().contains(keyword)) {
                sesi.infoSesi();
                System.out.println("------------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sesi tidak ditemukan.");
        }
    }

    // VALIDASI INPUT ANGKA
    private int validasiInputInt(String pesan) {
        int nilai;
        while (true) {
            try {
                if (!pesan.isEmpty()) {
                    System.out.print(pesan);
                }
                nilai = Integer.parseInt(input.nextLine());
                if (nilai <= 0) {
                    throw new NumberFormatException();
                }
                return nilai;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka yang valid dan lebih dari 0.");
            }
        }
    }
}