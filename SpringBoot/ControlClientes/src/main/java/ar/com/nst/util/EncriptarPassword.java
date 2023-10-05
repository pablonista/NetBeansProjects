package ar.com.nst.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
public class EncriptarPassword {
    public static void main(String[] args) {
        
        var password="123";
        System.out.println("Password: "+password);
        System.out.println("Password encriptado: "+encriptarPassword(password));
        
    }
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
