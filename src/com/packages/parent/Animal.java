package com.packages.parent;

public class Animal
{
     protected int numberOfLegs; //creating a protected field for variable legs
    protected int numberOfNose; //creating a protected field for variable legs
    protected int numberOfEyes; //creating a protected field for variable legs
    protected String name; //creating a protected field for variable legs

    public void setNumLegs(int numLegs1) //setting protected variable
    {
        this.numberOfLegs=numberOfLegs;
        System.out.println(numberOfLegs);
    }
    public void setNumNose(int  numberOfNose) //setting protected variable and creating a set method
    {
        this. numberOfNose= numberOfNose; //setting protected variable num of nose to num of nose and printing it out
        System.out.println( numberOfNose);
    }
    public void setNumEyes(int numberOfEyes ) //setting protected variable and creating a set method
    {
        this.numberOfEyes=numberOfEyes;
        System.out.println(numberOfEyes);
    }
    public void setName(String name) //setting protected variable and creating a set method
    {
        this.name=name;
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        Animal animalObject=new Animal(); //creating an animal object for animal class in order to use it to set my created method


    }

}
