package com.stackroute.lambdaexpressions;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CartCheckout {
    double sum;
    double perc;
    double total;


    //write here logic to add a Map values include tax using lambda expression
    public String billGenerator(Map<String, BigDecimal> cart, Double taxPercent) {
        
        




       if( cart.isEmpty())
        {
            return "The cart Map is empty";
        }
        if(taxPercent<0)
        
            return "The taxPercent cannot be negative";
        if(cart.containsKey(null))
        {
            return "The cart Map has null or empty or blank space as a value";
        }    
        if(cart.containsKey(" "))
        {
            return "The cart Map has null or empty or blank space as a value";
        }
        if(cart.containsKey(""))
        {
            return "The cart Map has null or empty or blank space as a value";
        }
        if(taxPercent==null)
        {
          return  "The taxPercent cannot be null";
        }
       // return null;
        cart.forEach((k,v)->{
            //BigDecimal sum = new BigDecimal(0);
           // System.out.println(cart.get(k));
          sum += v.doubleValue();
        
          

          
        });
            System.out.println(sum);
            perc = (sum*taxPercent)/100;
            total = perc+sum;
            return String.valueOf(total);
       
     
}
}
