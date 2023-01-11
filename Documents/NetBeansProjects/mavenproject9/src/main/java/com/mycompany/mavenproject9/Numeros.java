/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Numeros {

     public static void main(String[] args)
    {
        Pattern p= Pattern.compile("(-123)");
        Matcher m = p.matcher("-123");
        
        if(m.matches())
        {
            System.out.println("Coincide");
        }
        else
        {
            System.out.println("No Coincide");
        }
    }
}



