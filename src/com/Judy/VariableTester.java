package com.Judy;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
      int age = 0;
      float weight = 69.5f;
      char c = 65;
      char c2 = 'Z';
     //
        int i = c2;
        System.out.println((int)c2);
//      System.out.println(i);
        boolean pass =false;
        System.out.println(!pass);		
        System.out.println(pass);
        
//      String s = new String("Hello");
//      System.out.println(s);     

        Random r = new Random();
        
        int n1 = r.nextInt(6)+1;
        int n2 = r.nextInt(6)+1;
        int n3 = r.nextInt(6)+1;
        int n4 = r.nextInt(6)+1;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        System.out.println(3==2);
        System.out.println(3>=2);
        System.out.println(3<=2);    
        
        String s = new String("Hello");
        int len = s.length();
        System.out.println("len:"+len);
        System.out.println(s.charAt(0));
// 算術運算子       
        float f = 9.0f;
        int x = 5;
        int y = 3;
        int z = x % y;
        float w = x / f ;
//      int u =(int)( x % f);
        System.out.println(z);
        System.out.println(w);
//位元運算子
        System.out.println(x >> 1);
// 字串轉整數        
    String k = "316"; 
    int d = Integer.parseInt(k);    
       
//整數轉字串        (課本 3-39)
    String q = String.valueOf(d);    
        
	}

} 
