package com.tnsif.encapsulation;

public class Encapsulationdemo {
	 int serialnumber;// properties or data member
     String name; // Declaration 
     int age;
     
     void show() {  // member function 
             System.out.println(serialnumber +" "+name+" "+age);
     }
     
     public static void main(String[] args) {
             Encapsulationdemo e=new Encapsulationdemo();
             e.serialnumber=9;
             e.name="Ranjeeta";
             e.age=56;
             
             e.show();
     }
}
