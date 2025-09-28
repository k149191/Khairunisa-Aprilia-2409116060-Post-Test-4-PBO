package model;

public class SesiIstirahat extends SesiBelajar {
    private int waktuIstirahat;
    
    public SesiIstirahat(String namaSesi, int waktuBelajar, int waktuIstirahat) {
        super(namaSesi, waktuBelajar);
        this.setWaktuIstirahat(waktuIstirahat);
    }

    public int getWaktuIstirahat() {
        return waktuIstirahat;
    }

    public void setWaktuIstirahat(int waktuIstirahat) {
        if (waktuIstirahat <= 0) {
            throw new IllegalArgumentException("Waktu istirahat harus lebih dari 0.");
        }
        this.waktuIstirahat = waktuIstirahat;
    }

    @Override
    public void infoSesi() {
        System.out.println("Nama Sesi: " + this.getNamaSesi());
        System.out.println("Waktu Belajar: " + this.getWaktuBelajar() + " menit");
        System.out.println("Waktu Istirahat: " + this.getWaktuIstirahat() + " menit");
    }
}