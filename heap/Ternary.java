/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heap;

public class Ternary {

    private int d;
    private int boyut;
    private int[] heap;

    public Ternary(int kapasite, int cocuk) {
        boyut = 0;
        d = cocuk;
        heap = new int[kapasite];
    }

    private int parent(int i) {
        return (i - 1) / d;
    }

    public void ekle(int x) {
        heap[boyut++] = x;
        heapify(boyut - 1);
    }

    private void heapify(int indis) {
        int tmp = heap[indis];
        while (indis > 0 && tmp < heap[parent(indis)]) { //burada çocuğun değeri ile parentin değerini ve indisin 0 dan büyüklüğünü karşılaştırıyoruz.
            heap[indis] = heap[parent(indis)]; // Eğer ki çocuğun değeri küçükse parenttaki değerle yer değişikliği yapıyoruz.
            indis = parent(indis);
        }
        heap[indis] = tmp;

    }

    public void karsilastirma(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == heap[i]) {
                count++; // Önce girilen diziyi heap algoritmasına sokuyoruz. Sonra dizinin elemanları ile algoritmamızdan çıkan kodları karşılaştırıp bir sayaçla tutuyoruz.
            }
        }
        if (count == n) { // Eğer ki sayaç dizi uzunluğu ile aynı çıkarsa demek ki girilen dizi minHeap.
            System.out.println("Girdiğiniz dizi ternary min Heap'tir.");
        } else {
            System.out.println("Girdiğiniz dizi ternary min Heap değildir.");
            System.out.println("Min Heap hali:");
            yazdir();
        }
    }

    public void yazdir() {
        System.out.print("\nminHeap = ");
        for (int i = 0; i < boyut; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
