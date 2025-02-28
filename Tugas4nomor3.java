/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4nomor3;
import java.util.Scanner;

public class Tugas4nomor3 {
    public static void main(String[] args) {

        Scanner inputObjk = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = inputObjk.nextInt();
        
        int faktorial = 1;
        System.out.println(n + "! = ");
        
        for (int i = n; i > 0; i--) {
            faktorial *= i;
            System.out.println(i + (i > 1 ? "*" : " = "));
        }
        
        System.out.println(faktorial);
        inputObjk.close();
    }
}
  
    

