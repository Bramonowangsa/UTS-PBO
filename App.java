import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Tendik obj1 = new Tendik();
        obj1.setNama("Bagas");
        obj1.setNip(12345678);
        obj1.setTgl_Lahir("08-05-2022");
        obj1.setAlamat("Gunungkidul");
        obj1.setTahun_Masuk(2021);
       
        Dosen obj2 = new Dosen();
        obj2.setJurusan("Informatika");
        obj2.setNidn(2100018163);
        obj2.setNama("Bram");
        obj2.setNip(2100018224);
        obj2.setTgl_Lahir("11-08-2002");
        obj2.setAlamat("Guungkidul");
        obj2.setTahun_Masuk(2021);

        
        //dosen
        // dinamis
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        // tendik
        // dinamis
        System.out.println("Masukkan Nama Tendik :");
        String nama1 = inputString.nextLine();
        System.out.println("Masukkan NIP Tendik :");
        int nip1 = inputInt.nextInt();
        System.out.println("Masukkan Tanggal Lahir : ");
        String Tgl_Lahir1 = inputString.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat1 = inputString.nextLine();
        System.out.println("Masukkan Tahun Masuk : ");
        int Tahun_Masuk1 = inputInt.nextInt();
        System.out.println("Masukkan Gaji : ");
        int gaji1 = inputInt.nextInt();
        System.out.println("Masukkan jam Lembur : ");
        int jam1 = inputInt.nextInt();
        // cetak
        obj1.setNama(nama1);
        obj1.setNip(nip1);
        obj1.setTgl_Lahir(Tgl_Lahir1);
        obj1.setAlamat(alamat1);
        obj1.setTahun_Masuk(Tahun_Masuk1);
        obj1.setGaji(gaji1);
        obj1.setJam(jam1);

        //input
        System.out.println("Masukkan Nama Dosen :");
        String nama=inputString.nextLine();
        System.out.println("Masukkan NIDN Dosen :");
        int nidn = inputInt.nextInt();
        System.out.println("Masukkan Jurusan :");
        String Jurusan = inputString.nextLine();
        System.out.println("Masukkan NIP Dosen :");
        int nip=inputInt.nextInt();
        System.out.println("Masukkan Tanggal Lahir : ");
        String Tgl_Lahir=inputString.nextLine();
        System.out.println("Masukkan Alamat : ");
        String alamat=inputString.nextLine();
        System.out.println("Masukkan Tahun Masuk : ");
        int Tahun_Masuk=inputInt.nextInt();
        System.out.println("Masukkan Gaji : ");
        int gaji=inputInt.nextInt();
        System.out.println("Masukkan Kelebihan SKS : ");
        int sks=inputInt.nextInt();
        //cetak
        obj2.setNama(nama);
        obj2.setNidn(nidn);
        obj2.setJurusan(Jurusan);
        obj2.setNip(nip);
        obj2.setTgl_Lahir(Tgl_Lahir);
        obj2.setAlamat(alamat);
        obj2.setTahun_Masuk(Tahun_Masuk);
        obj2.setGaji(gaji);
        obj2.setSks(sks);
        
        System.out.println("Nama Tendik         : "+ obj1.getNama());
        System.out.println("NIP  Tendik         : "+ obj1.getNip());
        System.out.println("Tanggal Lahir       : "+ obj1.getTgl_Lahir());
        System.out.println("Alamat              : "+ obj1.getAlamat());
        System.out.println("Tahun masuk         : "+ obj1.getTahun_Masuk());
        System.out.println("Gaji pokok          : "+obj1.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ obj1.lembur(jam1));
        System.out.println("Gaji total          : "+ obj1.gajiTotal(jam1));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ obj2.getNama());
        System.out.println("NIDN                : " +obj2.getNidn());
        System.out.println("Jurusan             : " + obj2.getJurusan());
        System.out.println("NIP  Dosen          : "+ obj2.getNip());
        System.out.println("Tanggal Lahir       : "+ obj2.getTgl_Lahir());
        System.out.println("Alamat              : "+ obj2.getAlamat());
        System.out.println("Tahun masuk         : "+ obj2.getTahun_Masuk());
        System.out.println("Gaji pokok          : "+ obj2.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ obj2.mengajarLebih(sks));
        System.out.println("Gaji total          : "+ obj2.gajiTotal(sks));
    }
}
