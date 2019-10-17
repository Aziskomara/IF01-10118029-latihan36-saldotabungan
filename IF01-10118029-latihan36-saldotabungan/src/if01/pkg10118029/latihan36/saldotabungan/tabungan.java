/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan36.saldotabungan;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan saldo tabungan
 * 
 */
public class tabungan {
    public int bunga;
    public int saldo;

    public double hitungBunga(int parSaldo, int parBunga) {
        return parSaldo * parBunga / 100;
        
    }

    public void targetBulanan(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);
            String hasilSaldo = String.format("%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-%d Rp. %s%n", i, hasilSaldo);
            i++;

        }
    }
}
