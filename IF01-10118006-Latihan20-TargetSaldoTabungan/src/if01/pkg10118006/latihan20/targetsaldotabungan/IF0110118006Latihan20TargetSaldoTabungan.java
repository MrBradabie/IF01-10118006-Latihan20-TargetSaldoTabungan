package if01.pkg10118006.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan target saldo perbulan  
 */

public class IF0110118006Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        int i, saldo;
        DecimalFormat satuan = new DecimalFormat();
        i = 1;
        saldo = 3500000;
        while (i < 10) {
            saldo += (0.08 * saldo);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(saldo));
            i++;
            if (saldo >= 6000000) {
                break;
            }
        }
    }
}
