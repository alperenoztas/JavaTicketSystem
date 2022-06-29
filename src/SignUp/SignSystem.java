/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SignUp;


/**
 *
 * @author Duygu-Alperen
 */
public class SignSystem {

    //Checks for a valid name
    public static boolean checkNameSurname(String name){
        if (name == null) {
            return false;
        }
 
        for (int i = 0; i < name.length(); i++)
        {
            char c = name.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }
    
    
    
    //Checks for a valid phone number
    public static boolean checkPhone(String phone){
        if (phone == null) {
        return false;
        }
        try{
            Integer.parseInt(phone);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    //dd.mm.yyyy
    public static boolean checkBirth(String birthdate){
        if (birthdate.matches("([0-9]{2})/([0-9])/([0-9]{4})")){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Checks for a valid password
    public static boolean checkPassword(String password)
    {
        boolean isValidPassword = true;
        
        String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                isValidPassword = false;
            }
         String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars ))
            {
                isValidPassword = false;
            }
        return isValidPassword;
    }
}
