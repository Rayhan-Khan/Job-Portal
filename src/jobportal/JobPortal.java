/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jobportal;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import java.util.regex.Pattern;
import java.util.regex.*;
/**
 *
 * @author Rayhan
 */
public class JobPortal {

    /**
     * @param args the command line arguments
     */
     public static  boolean isValid(String e){ 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
        
          String phone;
            phone ="^(?:\\+88|88)?(01[3-9]\\d{8})$";
             
               Pattern pat= Pattern.compile(phone);           
       // Pattern pat = Pattern.compile(emailRegex); 
        if (e == null) 
            return false; 
        else if(pat.matcher(e).matches())
              return true;
        else{
            pat = Pattern.compile(emailRegex);
            return pat.matcher(e).matches();
        }
    } 
    public static void main(String[] args) {
        // TODO code application logic here
      
      HomePage n = new HomePage();
      n.home();
    }
}
