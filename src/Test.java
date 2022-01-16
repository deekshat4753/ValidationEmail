import java.util.regex.Matcher; 

import java.util.regex.Pattern; 

import java.util.*; 

  

public class Test 
{ 

    public static boolean isValid(String email) 

    { 

        String emailRegex = "^(.+)@(\\S+)$"; 

                              

        Pattern pat = Pattern.compile(emailRegex); 

        if (email == null) 

            return false; 

        return pat.matcher(email).matches(); 

    } 

  

    public static void main(String[] args) 

    { 

        ArrayList<String> address = new ArrayList<>(); 

            

          address.add("absc@gmail.com"); 

          address.add("dfgrdn@gmail.com");
          
          address.add("company@abcd.org");
          
          address.add("dfghhvv.gmail.com");
          
          address.add("companyAadds.org");

            

        for(String i : address){ 

            if (isValid(i)) 

                System.out.println(i + " - Yes"); 

            else

                System.out.println(i + " - No"); 

        } 

    }
}
