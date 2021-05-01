package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str =str.nextLine();
        String sw = "", lw = "";
        int s = str.length(), l = 0;
        String words[] = str.split(" Введите слово");
        for(String word:words){
            if(word.length()<s)
                sw = word;
            else if(word.length()>l)
                lw = word;
        }

        System.out.println("LONG WORD : "+lw);
        System.out.println("SHORT WORD : "+sw);
    }
}



