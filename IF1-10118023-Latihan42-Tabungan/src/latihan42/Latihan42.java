/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan42;
import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Tabungan
 */

public class Latihan42 {

    public static void main(String[] args) {
        int saldo ;
        Scanner input = new Scanner(System.in);
       
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Anda : " );
        saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);     
    }
    
}
