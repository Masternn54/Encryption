/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomad;

import java.util.Scanner;


/**
 *
 * @author Suss
 */
public class Checker {

    
    public static void main(String[] args) throws Exception {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
         String password = sc.nextLine();
         
//        String password = "mypassword";
        String passwordEnc = AESencrp.encrypt(password);
        String passwordDec = AESencrp.decrypt(passwordEnc);
        
        System.out.println("encText " + passwordEnc);
        System.out.println("Enter Password again Cunt");
        
        String password2 = sc.nextLine();
        
        if(password.equals(password2)){
            System.out.println("decText " +password);
        }else{
            System.out.println("Wrong move Fuckboy");
        }
//
//        System.out.println("Plain Text : " + password);
//        System.out.println("Encrypted Text : " + passwordEnc);
//        System.out.println("Decrypted Text : " + passwordDec);
//    
    }
}


