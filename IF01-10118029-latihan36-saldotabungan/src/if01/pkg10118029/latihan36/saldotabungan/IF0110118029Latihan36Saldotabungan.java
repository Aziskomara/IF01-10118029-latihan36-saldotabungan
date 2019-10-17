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
public class IF0110118029Latihan36Saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tabungan tabungan = new tabungan();
        tabungan.saldo = 3500000;
        tabungan.bunga = 8;
        int saldoTarget = 6000000;
        
        tabungan.targetBulanan(tabungan.saldo, saldoTarget);
    }
    
}
