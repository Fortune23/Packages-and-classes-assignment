package com.packages.parent;

public class Animal
{
     protected int numLegs; //creating a protected field for variable legs
    protected int numNose; //creating a protected field for variable legs
    protected int numEyes; //creating a protected field for variable legs
    protected String name; //creating a protected field for variable legs

    public void setNumLegs(int numLegs1) //setting protected variable
    {
        this.numLegs=numLegs1;
        System.out.println(numLegs);
    }
    public void setNumNose(int numNose) //setting protected variable and creating a set method
    {
        this.numNose=numNose; //setting protected variable num of nose to num of nose and printing it out
        System.out.println(numNose);
    }
    public void setNumEyes(int numEyes) //setting protected variable and creating a set method
    {
        this.numEyes=numEyes;
        System.out.println(numEyes);
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
