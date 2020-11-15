package pboif2.pkg10116374.latihan43.gajipegawai;
import java.util.Scanner;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung gaji pegawai
 *
 */
public class PBOIF210116374Latihan43GajiPegawai {
    private static int totalGaji;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        totalGaji = gp.totalGaji(
            gp.getUangTunjangan(),
            gp.getUangTransport(),
            gp.getGajiPokok()
        );
        
        gp.tampilData(
            gp.getNama(),
            gp.getAlamat(),
            gp.getUangTunjangan(),
            gp.getUangTransport(),
            gp.getGajiPokok(),
            totalGaji
        );
    }
    
}
