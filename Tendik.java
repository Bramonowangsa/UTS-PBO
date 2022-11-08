public class Tendik extends Karyawan{
    protected int total;

    // protected int totalGaji;
    @Override
    public int gaji() {
        return super.gaji();
    }

    public int gajiTotal() {
        return super.gaji();
    }

    public int lembur(int jam) {
        total = 50000 * jam;
        return total;
    }

    // overloading
    public int gajiTotal(int jam) {
        return gaji + total;
    }
}
