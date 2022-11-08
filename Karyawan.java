public class Karyawan {
    protected int nip;
    protected String nama;
    protected String alamat;
    protected String Tgl_Lahir;
    protected int Tahun_Masuk;
    protected int gaji;
    protected int sks;
    protected int jam;

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getJam() {
        return this.jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int gaji() {
        return gaji;

    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTgl_Lahir() {
        return Tgl_Lahir;
    }

    public void setTgl_Lahir(String Tgl_Lahir) {
        this.Tgl_Lahir = Tgl_Lahir;
    }

    public int getTahun_Masuk() {
        return Tahun_Masuk;
    }

    public void setTahun_Masuk(int Tahun_Masuk) {
        this.Tahun_Masuk = Tahun_Masuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
