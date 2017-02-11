package com.company;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void disp(LinkedList<String> a){
        System.out.print("[");
        for(String str:a){
            if(str!=a.peekLast()){
                System.out.print(str+", ");
            }
            else System.out.println(str+"]");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> a = new LinkedList<>();

        String s=sc.nextLine();
        int x=0;
        while(!s.equals("#")){
            switch (s){
                case "add":
                    x=sc.nextInt();
                    s=sc.nextLine();
                    a.add(x, s);
                    break;
                case "remove":
                    x=sc.nextInt();
                    a.remove(x);
                    break;
                case "clear":
                    a.clear();
                    break;
                case "get":
                    x=sc.nextInt();
                    if(x!=0) System.out.println("[");
            }
        }

    }
}
