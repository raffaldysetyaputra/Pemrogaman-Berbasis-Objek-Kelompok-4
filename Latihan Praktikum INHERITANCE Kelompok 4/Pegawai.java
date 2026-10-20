package latihan.praktikum.inheritance;

class Pegawai {
    protected String nama; 
    protected double gaji; 
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return this.gaji;
    }
}

