import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        System.out.println("Will see some comparison");
        Scanner myObj = new Scanner(System.in);
        int age = myObj.nextInt();
        if (age>=18){
            String j =("You can vote");
            for (int i=0 ;i<j.length();i++){
                System.out.println(j.toUpperCase().charAt(i));
            }
        }else
            System.out.println("Go Home Baby");



    }
}
