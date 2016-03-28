package it.yudharta.tutorial;

public class _03Operator {
    public static void main(String[] args) {
        int a = 9, b = 3;
        
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);
        System.out.println("e: "+ e);
        System.out.println("f: "+ f);
        
        
        int g = b +=  a; // b = b + a; 12
        System.out.println("nilai g:" + g);
        
        int h = b -=  a; // b = b - a; -6
        System.out.println("nilai h:" + h);
        
        int i = b *=  a; // b = b * a; 27
        System.out.println("nilai i:" + i);
        
        int j = b /=  a; // b = b / a; 0.3
        System.out.println("nilai j:" + j);
        
        int k = a % b;
        System.out.println("a % b :" + k);
        
        int l = a++;        
        System.out.println("a++ :" + l + ", nilai a: " + a);
        
        int m = ++a;
        System.out.println("++a :" + m);
        
        if (( 4 >= 4) ^ (4 == 6)) {
            System.out.println("cetak....");
        }
        
        int nilai = 6;
        
        int n  = (nilai > 0) ? -nilai :  nilai ;
        
         System.out.println("nilai n :" + n);
    }
    
}
