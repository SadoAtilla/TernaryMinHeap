/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.heap;

import java.util.Scanner;

/**
 *
 * @author sadik
 */
public class Heap {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String giris = input.nextLine();
        String yeniGiris = giris.replaceAll(",", " "); // Burada string olarak girdiğimiz inputtaki virgülleri siliyoruz.
        String[] elemanlar = yeniGiris.split(" "); // Elimizde ki stringi tek tek bölüp listeye alıyoruz.
        int n = elemanlar.length;
        int[] arr = new int[n];
        int sayi;

        for (int i = 0; i < n; i++) {
            sayi = Integer.parseInt(elemanlar[i]); // Burada listeye aldığımız string haldeki elemanları integer a çeviriyoruz.
            arr[i] = sayi;
        }

        Ternary tt = new Ternary(n, 3);
        for (int i = 0; i < n; i++) {
            tt.ekle(arr[i]);
        }
        tt.karsilastirma(arr, n);
    }
}
