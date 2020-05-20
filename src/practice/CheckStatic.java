package practice;

public class CheckStatic implements Face1,Facc2{

    public static void display(){

            System.out.println("interface_main");
    }
    public static void main(String[] args) {
        Face1 sub1 = new CheckStatic();
        Face1.display();
    }

}
