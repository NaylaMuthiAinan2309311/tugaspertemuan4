/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4nomor2;
import java.util.Scanner;

public class Tugas4nomor2 {
    public static void main(String[] args) {
        Scanner inputObjk = new Scanner(System.in);
        System.out.println("Masukkan batas awal: ");
        int batasAwal = inputObjk.nextInt();
        System.out.println("Masukkan batas akhir: ");
        int batasAkhir = inputObjk.nextInt();

        int jumlahGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        inputObjk.close();
    }
}
