package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {

    public static void main(String[] args) {
        int[] iarr1 = new int[10];
        int sum = 0;
        for (int i = 0; i < iarr1.length; i++) {
          iarr1[i] += sum++;
            System.out.print(sum + " ");

        }
    }
}
