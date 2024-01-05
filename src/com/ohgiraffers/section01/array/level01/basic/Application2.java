package com.ohgiraffers.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] fru = {"딸기","바나나","복숭아","키위","사과"};
        String[] num = {"0","1","2","3","4"};
        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요 : ");
        int su = sc.nextInt();

        switch (su) {
            case 0 :
                System.out.println("딸기");
                break;
            case 1 :
                System.out.println("바나나");
                break;
            case 2 :
                System.out.println("복숭아");
                break;
            case 3 :
                System.out.println("키위");
                break;
            case 4 :
                System.out.println("사과");
                break;
            default:
                System.out.println("준비된 과일이 없습니다.");
        }


    }
}
