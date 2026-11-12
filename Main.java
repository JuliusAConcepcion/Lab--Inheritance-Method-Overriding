import java.util.Scanner;

class Employee {
    double salary;

    double calculateSalary(){
    return salary;
    }

    void printSalary(String employeeType){
        System.out.println(employeeType + " Employee Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        return basePay + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;
    @Override
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is employee type?" );
        System.out.println("Enter 1 for FUll-Time  :  Enter 2 for PART-Time");

        try {
            int choice = sc.nextInt();
            if(choice == 1){
                FullTimeEmployee fte = new FullTimeEmployee();
                System.out.println("New Full-Time Employee Created!");
                System.out.println("\nEnter Employee Information:");
                System.out.print("Base Pay: ");
                fte.basePay = sc.nextDouble();
                System.out.print("Bonus: ");
                fte.bonus = sc.nextDouble();

                //Print Salary
                fte.printSalary("Full-Time");
            }
            else if(choice == 2){
                PartTimeEmployee pte = new PartTimeEmployee();
                System.out.println("New Part-Time Employee Created!");
                System.out.println("\nEnter Employee Information:");
                System.out.print("Hourly Rate: ");
                pte.hourlyRate = sc.nextDouble();
                System.out.print("Hours Worked: ");
                pte.hoursWorked = sc.nextDouble();

                //Print Salary
                pte.printSalary("Part-Time");
            }
            else System.out.println("Invalid Input : Try again");


        } catch (Exception e){
            System.out.println("Invalid Input : Try again");
        }




    }
}
