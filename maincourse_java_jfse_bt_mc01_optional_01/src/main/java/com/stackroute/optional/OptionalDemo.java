package com.stackroute.optional;


import java.util.Optional;

public class OptionalDemo {

    public String concatenateString(String inputOne, String inputTwo) {
        /* When inputTwo is null, then concatenate with defaultString */
        final String defaultString = "Bangalore";
        String stringOne=inputOne;
        String stringTwo=inputTwo;
        
       

        /* Optional.ofNullable - allows passed parameter to be null.*/
        Optional<String> optionalValueOne = Optional.ofNullable(stringOne); 
        Optional<String> optionalValueTwo =Optional.ofNullable(stringTwo); 
        if(!optionalValueTwo.isPresent())
        {
            return stringOne+=defaultString;
        }
       
       
       
        /* check if optionalValueOne is present, then implement logic to concat strings and return the output string */
        if(optionalValueOne.isPresent())
        {
            return stringOne+=stringTwo;
        }

        

        /* gets the value of optionalValueOne */
       
        stringOne =  optionalValueOne.get();;

        /* returns the value optionalValueTwo if present otherwise returns the "defaultString" */
        if(optionalValueTwo.isPresent())
        {
            //stringOne+=stringTwo;
            // return optionalValueTwo.get();
            return stringTwo=optionalValueTwo.get();
        }
       

        else
        {
            //return stringOne+=defaultString;
             return "defaultString";
        }

        //stringTwo = null;

        /* else return string message, if optionalValueOne is not present */
    //     if(!optionalValueOne.isPresent())
    //     {
    //         return "Check the logic of your method concatenateString";
    //     }
	// 	return stringTwo;

    // //    // return null;
    
    }
}
