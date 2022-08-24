package org.brainypeople.eazy.practise;

public class ClassB extends ClassA{

    private final Integer Max_Width;
    private final Integer MIN_Width;

    public ClassB()
    {
        super();
        Max_Width = 50;
        MIN_Width = 5;


    }
    public int myint = 20;

    public int getMyint() {
        return myint;
    }

    @Override
    public ClassB display()
    {
        super.display();
        System.out.println(" Overridden method in classB");
        return this;
    }

    public void display(String str)
    {
        System.out.println(str);
    }

    public void display(String str1,String str2)
    {
        System.out.println( str1);
        System.out.println( str2);
    }

    public void display(Integer str1)
    {
        System.out.println( str1);

    }

}
