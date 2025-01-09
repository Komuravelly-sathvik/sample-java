 interface TestInterface  {
    int a=0;
   default void print(){
       System.out.println("Hello");
   }
}

interface  abc{
    void ab();
}

class xyz implements TestInterface,abc{

    public void print(){
        System.out.println("Hello1");
    }
    public void print(String message){
        System.out.println(message);
    }
    public void print(String message,String one){
        System.out.println(message+one);
    }
    public void ab(){
        System.out.println("jhcd");
    }
}

public class test {
    public static void main(String[] args){
        xyz x1=new xyz();
        x1.print("dfg","kdaskd");
        x1.print();
    }
}