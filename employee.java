import java.util.Scanner;

public class employee {
    String name;
    String id;
    double pay;

    employee() {
        this.name = "null";
        this.id = "null";
        this.pay = 0.0;

    }

    employee(String n) {
        this.name = n;
        this.id = "null";
        this.pay = 0.0;
    }

    employee(String m, String id) {
        this.name = m;
        this.id = id;
        this.pay = 0.0;

    }

    employee(String x, String y, double b) {
        this.name = x;
        this.id = y;
        this.pay = b;
    }

    int sumOfIntegers(int...num){
        int sum=0;
        int i;
        for(i=1;i<num.length;i++){
            sum=sum+num[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        employee e1 = new employee();
        employee e2 = new employee("Seya");
        employee e3 = new employee("Osama", "Ru3214/13");
        employee e4 = new employee("Seya", "Ru1644/13", 4000);
        employee e5=new employee();
        System.out.println("This is A Default constractor");
        System.out.println("employee name: " + e1.name);
        System.out.println("employee id: " + e1.id);
        System.out.println("employee payment: " + e1.pay);
        System.out.println("This is a one string constructor");
        System.out.println("employee name: " + e2.name);
        System.out.println("employee id: " + e2.id);
        System.out.println("employee payment: " + e2.pay);
        System.out.println("This is two string constructor");
        System.out.println("employee name: " + e3.name);
        System.out.println("employee id: " + e3.id);
        System.out.println("employee payment: " + e3.pay);
        System.out.println("This is two string one double constructor");
        System.out.println("employee name: " + e4.name);
        System.out.println("employee id: " + e4.id);
        System.out.println("employee payment: " + e4.pay);

        int R1=e5.sumOfIntegers(4,6,9);
        System.out.println("sum: " + R1);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your name :");
        String name1=scan.nextLine();
        System.out.println("Enter your salary: ");
        double d1= scan.nextDouble();
        System.out.println("Your name is : "+name1);
        System.out.println("Your salary  is :"+d1);




    }

}




