package org.example;

public class Demo {

   private final int a=10;

   public void mi(){
       System.out.println("Demo mi method is called");
   }
@Override
   protected void finalize() throws Throwable{

    System.out.println("Finalize method is called");

    }

    public static void main(String[] args) {
      Demo demo= new Demo();
      demo.mi();
      demo= null;
      System.gc();;


    }


}
