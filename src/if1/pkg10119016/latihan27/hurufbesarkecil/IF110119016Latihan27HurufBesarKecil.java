/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan27.hurufbesarkecil;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * huruf besar dan kecil
 */
public class IF110119016Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String besar, kecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String nama = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+nama.toUpperCase());
        System.out.println("Huruf Kecil : "+nama.toLowerCase());
    }
}