// 9. Write a Java program that displays the number of characters, lines and words in a text file.

import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

public class Program09 {
    public static void main(String args[]) throws IOException {
        int n1 = 1, nw = 0, i = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter File Name:");
        String str = sc.nextLine();
        FileInputStream f = new FileInputStream(str);
        int n = f.available();
        for (; i < n; i++) {
            ch = (char) f.read();
            if (ch == '\n')
                n1++;
            else if (ch == ' ')
                nw++;
        }
        System.out.println("\nNumber of lines: " + n1);
        System.out.println("\nNumber of words: " + (n1 + nw));
        System.out.println("\nNumber of characters: " + n);
    }
}
