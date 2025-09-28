package model;

import java.util.ArrayList;

public class SesiFokus extends SesiBelajar {
    private ArrayList<String> daftarTugas;
    
    public SesiFokus(String namaSesi, int waktuBelajar) {
        super(namaSesi, waktuBelajar);
        this.daftarTugas = new ArrayList<>();
    }
    
    public ArrayList<String> getDaftarTugas() {
        return daftarTugas;
    }
    
    public void tambahTugas(String tugas) {
        if (tugas != null && !tugas.trim().isEmpty()) {
            daftarTugas.add(tugas);
        }
    }
    
//    OVERRIDE
    @Override
    public void infoSesi() {
        System.out.println("Nama Sesi: " + this.getNamaSesi());
        System.out.println("Waktu Belajar: " + this.getWaktuBelajar() + " menit");
        System.out.print("Daftar Tugas: ");
        if (daftarTugas.isEmpty()) {
            System.out.println("(kosong)");
        } else {
            System.out.println();
            for (String tugas : daftarTugas) {
                System.out.println(" - " + tugas);
            }
        }
    }
    
//    OVERLOADING
    public void mulai() {
        System.out.println("Fokus on. Matikan gangguan, mulai sesi " + getWaktuBelajar() + " menit.");
    }
    
    public void mulai(int durasiMenit) {
        System.out.println("Mulai sesi " + getNamaSesi() + " dengan durasi: " + durasiMenit + " menit.");
    }
}
