package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangle {
    public void  IllegalTriangleException(int a, int b, int c) throws Exception {
        try {
            if ((a + b < c)||(a + c < b)||(c + b < a)) {
                throw new ArithmeticException();
            }
            System.out.println("Tam giac co 3 canh la: " + a+", "+ b+", "+ c);
        } catch (Exception e) {
            System.out.println("Phat sinh loi do giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại!");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao canh a: ");
        int a = scn.nextInt();
        System.out.println("Nhap vao canh b: ");
        int b = scn.nextInt();
        System.out.println("Nhap vao canh c: ");
        int c = scn.nextInt();
       IllegalTriangle triangle = new IllegalTriangle();
       triangle.IllegalTriangleException(a, b,c);
    }
}
