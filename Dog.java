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
        Dog d = new Dog(); //creating an object dog
        d.setName("Molly"); //setting my variable that was in parent class in method set
        d.setNumLegs(4);    //setting my variable that was in parent class in method set
        d.setNumEyes(2);    //setting my variable that was in parent class in method set
        d.setNumNose(1);    //setting my variable that was in parent class in method set
        d.setBreed("Chihuahua"); //setting the breed method or variable
        System.out.println(d.getBreed()); //getting the set method
        d.bark(); //calling the bark method

        //printing the whole thing in a sentence
      System.out.print(" The dog that has "+d.numLegs
              +" legs and "+d.numEyes+" eyes " +"and "+d.numNose+" nose "+"its name is "+d.name
              +" it barks as "+d.breed);
    }

    }




