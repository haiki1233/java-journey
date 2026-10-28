
package edu.javajourney;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaJourneyApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Bài 1: Tính chu vi và diện tích hình chữ nhật
        double a,b, S, P;
        Scanner sc=new Scanner(System.in);
//        a=sc.nextDouble();
//        b=sc.nextDouble();
//        S= a * b;
//        P= (a+b)/2;
//        System.out.println("diện tích HCN S="+S);
//        System.out.println("chu vi HCN P="+P);
//
////        Bài 2: chu vi và diện tích hình tròn
//        double r, pi, C;
//        r=sc.nextDouble();
//        pi = 3.14;
//        S= pi * Math.pow(r,2);
//        C= 2*pi*Math.pow(r,2);
//        System.out.println("diện tích hiình tròn"+ S);
//        System.out.println("chu vi hình tròn"+ C);
//
////        bài 3: chuyển đổi nhiệt độ sang F (F = C * 1.8 + 32)
//        double T, F;
//        T=sc.nextDouble();
//        F= C * 1.8 + 32;
//        System.out.println("độ C sang F ="+ F);
//
////        bài 4: tính v (v=s/t)
//        double v, s, t;
//        s=sc.nextDouble();
//        t=sc.nextDouble();
//        v=s/t;
//        System.out.println("vận tốc đi đc"+ v);

////        bài 5: tính tổng và trung bình cộng 3 số nguyên
//        int h, j, k, TC;
//        double TB;
//        h=sc.nextInt();
//        j=sc.nextInt();
//        k=sc.nextInt();
//        TC=h+j+k;
//        TB=TC/3;
//        System.out.println("tổng 3 sô"+ TC);
//        System.out.println("Trung bình cộng 3 sô:"+ TB);

////        bài 6: tách chữ số 2 số nguyên
//        int z, ten, unit;
//        z=sc.nextInt();
//        ten=z/10;
//        unit=z%10;
//        System.out.println("hàng chục "+ ten);
//        System.out.println("hàng đơn vị "+ unit);

////        bài 7: đổi giây sang giờ - phút
//        int s, hour, minute;
//        s = sc.nextInt();
//        minute = s / 60;
//        hour = minute / 60;
//        minute = minute % 60;
//        System.out.println("giây sang phút: "+ minute);
//        System.out.println("giây sang giờ "+ hour +" h : " + minute +" phút");

////        bài 8: Tính tiền lương làm thêm: Nhập số giờ làm và lương theo giờ. Nếu giờ làm > 40, số giờ vượt tính lương gấp 1.5 lần.
//        double h, l, T;
//        h=sc.nextDouble();
//        l=sc.nextDouble();
//        if (h > 40){
//            T = h*l*1.5;
//        } else {
//            T = h*l*1.0;
//        }
//        System.out.println("Tiền lương của bạn là: "+ T);

////        bài 9: Tính chỉ số BMI: Nhập cân nặng (kg) và chiều cao (m), tính $BMI = kg/m*m
//        double hight, high, BMI;
//        hight=sc.nextDouble();
//        high=sc.nextDouble();
//        BMI=hight/Math.pow(hight,2);
//        System.out.println("Chỉ só BMI: "+ BMI);

//        bài 10: Hoán đổi giá trị 2 biến:
        double j, k, temp;
        j=sc.nextDouble();
        k=sc.nextDouble();
        temp = j;
        j = k;
        k = temp;
        System.out.println("giá trị j: " + j);
        System.out.println("giá trị k: " + k);

    }
}
