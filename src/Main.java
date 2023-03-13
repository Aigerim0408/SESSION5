import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* Random r = new Random();
        double number = r.nextDouble(1,100);
        System.out.println(number + "\t" + Math.sqrt(number));*/


        /* Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Random r = new Random();

        int age = r.nextInt(1,25);
        System.out.println("Person name: "+ name + "\t Age:" +age);*/

         /*Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println("Number: "+ number + "\t" + Math.sqrt(number));

        /* Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String result = name.toLowerCase();
        System.out.println(result);*/

       /* Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1 = sc.nextInt();
        System.out.println("Maximum number: " + Math.max(number,number1));*/

        /* Random r = new Random();
        int num = r.nextInt(350,400);
        double num1 = r.nextDouble(0,1);
        System.out.println(num + "\t" + num1);*/

       /* Random random = new Random();
        int nun = random.nextInt(1,50);
        System.out.println(nun);
        int num1 = random.nextInt(1,50);
        System.out.println(num1);
        int num2 = random.nextInt(1, 56);
        System.out.println(num2);
        int sum1 = nun + num1 + num2;
        double sum2 = (double) sum1 / 3;
        System.out.println("Summa:" + sum1 + " \n Average number:" + sum2);*/

      /* Scanner scan = new Scanner(System.in);
        System.out.print("Side A: ");
        double a = scan.nextDouble();
        System.out.print("Side B: ");
        double b = scan.nextDouble();
        System.out.print("Side C: ");
        double c = scan.nextDouble();
        double p = (a + b + c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S = " + s +"\tsm");*/


        String org = "Ladies and Gentlemen, take attention, please!";
         char[] arr = org.toCharArray();
        System.out.println(Arrays.toString(arr));

       /* int r = 4;
        int r1 = 5;
        double result = Math.pow(r,r1);
        System.out.println(result);*/ //vozvedenie chisla v stepen

       /* Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        if (num < num1){
            System.out.println(num);
        } else if (num<=num1) {
            System.out.println("True");
        } else
            System.out.println(num1);                     naimenshee chislo*/

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Input three numbers");
        int num = scan.nextInt();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num<num1 && num1 > num2){
            System.out.println(num1);
        } else if (num > num1 && num > num2) {
            System.out.println(num);

        } else
            System.out.println(num);     // naiti Naimenshee chislo */

       /* Scanner scan = new Scanner(System.in);
        System.out.println(" How old are you?");
        int age = scan.nextInt();
        if (age>=18) {
            System.out.println("You can buy alcohol");

        } else
            System.out.println("Sorry! You can not buy alcohol");*/

      /*  Scanner sc = new Scanner(System.in);
        System.out.print ("Enter currency name: ");
        String currencyName = sc.nextLine();
        switch (currencyName) {
            case "USD":
                System.out.println("Exchange rate of the " + currencyName + " = " + "87.20");
                break;
            case "EUR":
                System.out.println("Exchange rate of the " + currencyName + " = " + "92.63");
                break;
            case "RUB":
                System.out.println("Exchange rate of the " + currencyName +" = " + "1.25");
                break;
            case "KZT":
                System.out.println("Exchange rate of the " + currencyName + " = " + "0.20");
                break;
            default:
                System.out.println("Rezultat ne naiden. Try again");*/

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Enter currency name: ");
        String currencyName = scan.nextLine();
        System.out.print("Enter amount: ");
        int amount = scan.nextInt();
        switch (currencyName) {
            case "USD":
                System.out.println(currencyName + " to Som exchange rate " + " = " + " " +
                        " Purchase: 87.20" + "\tSale: 88.38");
                double buyRate = 87.20;
                double sellRate = 88.38;
                double sum = amount * buyRate;
                double sum1 = sum / sellRate;
                System.out.println(sum + " SOM");
                System.out.println(sum1 + " $");
                break;
            case "EUR":
                System.out.println(currencyName + " to Som exchange rate " + " = " + " " +
                        " Purchase: 93.20" + "\tSale: 95.40");
                buyRate = 93.20;
                sellRate = 95.40;
                sum = amount * buyRate;
                sum1 = sum/ sellRate;
                System.out.println( sum+ " SOM");
                System.out.println(sum1 + " EUR");
                break;
            case "RUB":
                System.out.println(currencyName + " to Som exchange rate " + " = " + " " +
                        "Purchase: 1.17" +"\tSale: 1.22");
                buyRate = 1.17;
                sellRate = 1.22;
                sum = amount * buyRate;
                sum1 = sum/ sellRate;
                System.out.println( sum+ " SOM");
                System.out.println(sum1 + " RUB");
                break;
            default:
                System.out.println("Error! Enter correct currency name.");

        }*/

    }
}
