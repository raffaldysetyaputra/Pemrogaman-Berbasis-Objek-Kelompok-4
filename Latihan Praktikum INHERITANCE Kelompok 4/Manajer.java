package latihan.praktikum.inheritance;

class Manajer extends Pegawai {
    public String departemen;

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return this.departemen;
    }

    public void IsiData(String n, String d, double g) {
        setNama(n);
        setDepartemen(d);
        setGaji(g);
    }

    public void tampilkanData() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Departemen  : " + getDepartemen());
        System.out.println("Gaji        : Rp " + String.format("%.0f", getGaji()));
    }
}
