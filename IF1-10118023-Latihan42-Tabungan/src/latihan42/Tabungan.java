/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan42;
import java.util.Scanner;

/**
 *
 * @author Zaenal PC
 */
public final class Tabungan {
    private final int saldo;
    
    /**
     * 
     * @param saldo
     */
    public Tabungan(int saldo) {
        int jumlah;
        Scanner input = new Scanner(System.in);
        this.saldo = saldo;
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = input.nextInt();
        System.out.println("Saldo Anda Sekarang : " + ambilUang(jumlah));                         
    }

    /** 
     * 
     * @param jumlah
     * @return 
     */
    public int ambilUang(int jumlah) {		
	return saldo - jumlah;
    }

}
