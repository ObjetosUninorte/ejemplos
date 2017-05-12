/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author augustosalazar
 */
public class MyEx extends Exception{
     public MyEx() {
        super();
    }
      public MyEx(String message) {
        super(message);
    }
     public MyEx(String message, Throwable cause) {
        super(message, cause);
    }
     public MyEx(Throwable cause) {
        super(cause);
    }
}
