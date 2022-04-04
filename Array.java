package com.structure_algorithms;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        items[count++] = item;
        if (count == items.length) {
            int[] copy = new int[count * 2];
            for (int i = 0; i < count; i++) {
                copy[i] = items[i];
            }
            items = copy;
        }
    }

    public void removeAt(int index) {
        if (index < 0 && index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]){
                return i;
            }
        }
        return -1;
    }

    public void burbuja() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count ; j++) {
                if (items[j] > items[j + 1]){
                    int aux = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = aux;
                }
            }
        }
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}