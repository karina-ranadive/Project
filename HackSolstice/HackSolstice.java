import java.util.Scanner;

public class HackSolstice {

    /* This Task Manager has users putting in various tasks to keep track of their responsibilities for the year.
       Users are keeping track of all the assignments in one list.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task Manager");
        System.out.println();
        String list = ""; //This stores all the tasks in a list
        String task = "";
        boolean option = true; //this variable is used for the while loop


        while (option) { //While option is true, the task manager is run

            System.out.println("Do you want to enter a task?"); //The user is asked if they want to enter a task
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Answer: ");
            int choice = scanner.nextInt();
            if (choice == 1) { //If the user selects Yes, then they are asked for the task title and that task is added to the list of tasks.
                System.out.print("\nTask title: ");
                task = scanner.next();
                list += task + "\n";
                System.out.println("Task list:\n" + list); //The task is added to the list and it is printed.


                System.out.print("Day: "); //The user is asked to put in the day, month, and user that their task is due.
                String day = scanner.next();
                System.out.print("Month: ");
                String month = scanner.next();
                System.out.print("Year: ");
                String year = scanner.next();
                int years = Integer.parseInt(year); //Integer.parseInt is used to convert the string type into an integer data type.
                if (years >= 2021) {
                    System.out.println("Date Due: " + day + "-" + month + "-" + year); //The date is printed with the different components.
                }
                System.out.println();
                System.out.print("Time Due: "); //For Time Due, the user inputs the time using scanner.
                String time = scanner.next();
                System.out.println("Is it PM?"); //The user decides whether it is PM or AM
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Answer: ");
                int answer = scanner.nextInt();
                if (answer == 1) { //Conditional statements are used to print the time with AM or PM
                    System.out.println("Time Due: " + time + " PM");
                } else {
                    System.out.println("Time Due: " + time + " AM");
                }
                System.out.println(); //The user inputs a description for the task.
                System.out.print("Description: ");
                String description = scanner.next(); //Scanner is used to input a description.

            }
            else if (choice == 2) { //if choice is equal to 2, the task manager is exited after printing out the list.
                System.out.println("Task list:\n" + list);
                break;
            }


        }

    }
}

