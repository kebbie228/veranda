package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { int a,b,c;
    Scanner x=new Scanner(System.in);
    a=x.nextInt();
    b=x.nextInt();
    c=x.nextInt();
        boolean aa=(b>a)||(c>a);
        System.out.println(aa);
/* boolean aa=(a==b)&&(a!=c);
  System.out.println(aa);
  if((a==b)&(a!=c)) System.out.println("true");
  else System.out.println("false");
*/


    }
}
