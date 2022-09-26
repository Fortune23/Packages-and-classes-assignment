package com.packages.child; //created a package name child

import com.packages.parent.Animal; //importing the parent package to the child package

public class Dog extends Animal {  //class dog extends parent class animal
    private String breed; //initializing a new variable type of dog private

    public void bark() {  //created method bark
        System.out.println("hoof hoof"); //printing the action out

    }

    public void setBreed(String breed) //setting the private variable creating a set method
    {
        this.breed = breed;
    }

    public String getBreed() //getting the field or variable set

    {
        return this.breed;
    }
    public static void main(String[] args)  //codes executes at the main
    {
        Dog dog1 = new Dog(); //creating an object for dog class
        dog1.setName("Molly"); //setting my variable that was in parent class in method set
        dog1.setNumLegs(4);    //setting my variable that was in parent class in method set
        dog1.setNumEyes(2);    //setting my variable that was in parent class in method set
        dog1.setNumNose(1);    //setting my variable that was in parent class in method set
        dog1.setBreed("Chihuahua"); //setting the breed method or variable
        System.out.println(dog1.getBreed()); //getting the set method
        dog1.bark(); //calling the bark method

        //printing the whole thing in a sentence
      System.out.print(" The dog that has "+dog1.numberOfLegs
              +" legs and "+dog1.numberOfEyes+" eyes " +"and "+dog1.numberOfNose+" nose "+"its name is "+dog1.name
              +" it barks as "+dog1.breed);
    }

    }




