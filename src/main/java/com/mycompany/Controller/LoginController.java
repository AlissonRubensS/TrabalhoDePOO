package com.mycompany.Controller;
   
public class LoginController {
    public static void load(){
        String x = File.read("com.mycompany.Controller.database/Users.txt");
        System.out.println(x);
    }

}
