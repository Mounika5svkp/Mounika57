package org.tnsif.capgemini.c2tc.lambdaexpressionsdemo;

import java.util.*;  
public class LambdaExpressionExample6{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("sowmya");  
        list.add("naga");  
        list.add("mouni");  
        list.add("radha");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  