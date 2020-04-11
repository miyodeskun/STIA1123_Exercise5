
package exercise5;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class PayrollDemo{
        public static void main(String[]args){
        Employee x = new Employee();
        x.input();
        Payroll y = new Payroll(x.grossPay, x.stateTax, x.federalTax);
        y.printOutput();
    }
}

class Employee {
    String numbID;
    double grossPay,stateTax, federalTax;
     
    public void input(){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input ID number  : ");
        numbID = sc.next();
        System.out.print("Input Gross Pay  : RM ");
        grossPay = sc.nextDouble();
        System.out.print("Input State Tax  : RM ");
        stateTax = sc.nextDouble();
        System.out.print("Input Federal Tax: RM ");
        federalTax = sc.nextDouble();  
        System.out.println("");
    }
}
class Payroll {
    private double grossPay,stateTax, federalTax, netPay;
    
    public Payroll(double grossPay,double stateTax, double federalTax){
        this.grossPay = grossPay;
        this.stateTax = stateTax;
        this.federalTax = federalTax; 
}
    
    public double calculateNetPay(){
        netPay = grossPay - stateTax - federalTax;
        return netPay;
    }
    public void printOutput(){
        System.out.printf("Net pay is: RM%,.2f\n", calculateNetPay());
    }
}
