/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author ani
 */
public class tester {
    public static void main(String[] args) {
        student_handler sh=new student_handler();
        String x=sh.insert("ani", "ABC","hello","high","just","test");
        System.out.println(x);  
        System.exit(2);
    }
    
}
