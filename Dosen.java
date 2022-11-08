public class Dosen extends Karyawan{
    private String Jurusan;
    private int nidn;

    protected int total;
    //overriding
    @Override
    public int gaji() {
        return super.gaji();
    }

    public int gajiTotal() {
        return super.gaji();
    }

    public int mengajarLebih(int sks) {
        total = 100000 * sks;
        return total;
    }

    // overloading
    public int gajiTotal(int sks) {
        return gaji + total;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }
    
}
