import java.util.Scanner;

public class Hello {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of task what you would like to do tomorrow.\n" +
                "NOTE: You can write only 1, 2 or 3");
        int numOfTask = scan.nextInt();
        scan.close();
        if (numOfTask==1){
            System.out.println("You have to install all programs you need");
        }else if (numOfTask==2){
            System.out.println("You have to create GIT repository and branch 'dev' on it");
        }else if (numOfTask==3){
            System.out.println("Third task");
        }else {
            System.out.println("You wrote a wrong number, Task with this number is empty.\nPlease, try again.");
        }


    }
}
