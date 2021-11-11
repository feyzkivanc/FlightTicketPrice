package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, tip;
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen mesafeyi(km) giriniz: ");
        km = scan.nextInt();
        if (0 < km) {
            System.out.println("km:" + km);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        System.out.print("lütfen yaşınızı giriniz: ");
        age = scan.nextInt();
        if (age > 0) {
            System.out.println("yaş:" + age);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        System.out.println("lütfen yolculuk tipinizi seçiniz, tek yön için 1'i, gidiş dönüş için 2 sayısını giriniz: ");
        tip = scan.nextInt();
        if (tip == 1 || tip == 2) {
            System.out.println("yolculuk tipi: " + tip);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        double toplam =km*0.10;
        if(age<12){
            System.out.println("toplam: " + toplam/2);
        }
        else if(age>=12 && age<=24 ){
            System.out.println("%10 indirimli " +(toplam-(toplam*10)/100));
        }
        else if(age>65) {
            System.out.println("%30 indirimli: " +(toplam-(toplam*30)/100));
        }
        else{
            System.out.println("toplam:" +toplam);
        }
        if(tip==2){
            System.out.println("%20 indirimli: " +(toplam-(toplam*20)/100));
        }
        else{
            System.out.println("toplam" + toplam);
        }
    }
}
