import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Enter the year in this format 'yyyy' ");
            int year = scanner.nextInt();
            System.out.println("Enter the amount of days in this year");
            int days = scanner.nextInt();
//        if(year % 400 == 0  || (year % 4 == 0 && year % 100 != 0)){
//            System.out.println("The amount of days in this year - 366 ");
//        } else {
//            System.out.println("The amount of days in this year - 365 ");
//        }
            switch (days) {
                case 366:
                    if(calcDays(year) == 366){
                        counter++;
                        continue;
                    } else {
                        System.out.println("Error: in this year are 365 days!");
                        System.out.println("You have " + counter + " scores");
                        break;
                    }

                case 365:
                    if(calcDays(year) == 365){
                        counter++;
                        continue;
                    } else {
                        System.out.println("Error: in this year are 366 days!");
                        System.out.println("You have " + counter + " scores");
                        break;
                    }
                default:
                    System.out.println("Wrong : in year can be 365 or 366 days!!!");
                    continue;
            }
            break;
        }


    }
    public static int calcDays(int year){
        if(year % 400 == 0  || (year % 4 == 0 && year % 100 != 0)){
            return 366;
        } else {
            return 365;
        }
    }
}
