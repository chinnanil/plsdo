package com.hardwork;

import com.google.common.base.Ascii;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */

abstract class Abclass{
    int i;
    static int j;
public void fun(){
System.out.println("abclass instance method");
}
public static void statFun(){
    System.out.println("abclass static method");
}
abstract public void  abFunOfAbclass();
}

class BabClass extends Abclass{
public void abFunOfAbclass(){
    
}
}

class A{
public static void statFun(){
System.out.println("static fun of A");
}
}

class B extends A{
    public static void statFun(){
        System.out.println("static fun of B");
        }
}

class C extends B{

}

public class App 
{
     
    public static void main( String[] args ) throws ClassNotFoundException
    {
        
 BabClass bab= new BabClass();
 bab.fun();
 BabClass.statFun();

    }
}
