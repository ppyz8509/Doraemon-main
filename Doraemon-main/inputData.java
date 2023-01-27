import java.util.Scanner;
public class inputData {
    public static void main(String[] args) {
        System.out.println("Doraemon : Hello, who are you?");
        System.out.println("Me : Hello, my name is : Naphat ");
        Scanner in =new Scanner(System.in);
        System.out.println("Doraemon : Oh! hi,");
        String name = in.nextLine();
        System.out.println("Doraemon : Oh! hi, " + name + ".");
        System.out.println("Doraemon : Waht can I do for you?");
        System.out.println("Naphat : I want to go to the future.");
        System.out.println("Doraemon : Of course, what is the present year?");
        System.out.println("Naphat : It is : ");
        int year = in.nextInt();
        System.out.println("Naphat : It is : " +year);
        System.out.println("Doraemon : OK. How many years do you want to travel?");
        System.out.println("Naphat : I want to go for : ");
        int years = in.nextInt();
        System.out.println("Naphat : I want to go for : " +years);
        System.out.println("Doraemon : OK. Lets gooooooo!");
        System.out.println(".....");
        System.out.println(".....");
        System.out.println(".....");
        System.out.println("Doraemon : Hello, welcome to 2033");
    }
}
