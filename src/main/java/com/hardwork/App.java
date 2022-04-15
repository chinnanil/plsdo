package com.hardwork;

import com.google.common.base.Ascii;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    
 
    public static void main( String[] args ) throws ClassNotFoundException
    {
        int capCount=0,smallCount=0;
        String str="WelcoMe to AutoMation";
// System.out.println(((int)'a')+"" + ((int)'z'));
        for(int i=0;i<str.length();i++){
//           if(((int)str.charAt(i))>=65&&((int)str.charAt(i))<=90){
//                     capCount++;
//           }
//           else if(((int)str.charAt(i))>=97&&((int)str.charAt(i))<=122){
//             smallCount++;
//   }



        }
        System.out.println("capital letters are :" +capCount + "small letters are :" + smallCount);   
    }
}
