package com.hardwork;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
class A{
  String str;
  public A(){

  }
  public A(String str){
    this.str=str;
  }
}
class B extends A{
  public B(String str){
    super(str);
  }
  void fun(){
    System.out.println(str);
  }
}
class C extends A{

  void fun(){
    System.out.println(str);
  }
}

public class App 
{
    
    public <T> void  func(T t){
            
    }
    public static void main( String[] args ) throws ClassNotFoundException
    {
        //new App().fun(int.class);
      //  App app=new App();
        // System.out.println(c);
      //  System.out.println( cc );
      // new B().fun();
      new B("iloveme").fun();
      new C().fun();
    }
}
