package FileTextNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String path) throws Exception {
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong: " + sum);

        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung file co loi!");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Nhap duong dan file: ");
        Scanner scn = new Scanner(System.in);

        String path = scn.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
