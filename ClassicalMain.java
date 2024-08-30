package Services;

import java.util.Scanner;

class Main {
        public static void main(String[] args) {
            double bubblegum = 202;
            double toffee = 118;
            double iceCream = 2250;
            double milkChocolate = 1680;
            double doughnut = 1075;
            double pancake = 80;
            double sum =  bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

            System.out.println("Earned amount:");
            System.out.println("Bubblegum: $" +  bubblegum);
            System.out.println("Toffee: $" +  toffee);
            System.out.println("Ice cream: $" +   iceCream);
            System.out.println("Milk chocolate: $" +   milkChocolate);
            System.out.println("Doughnut: $" +    doughnut);
            System.out.println("Pancake: $" +   pancake);

            System.out.println("Income: $" + sum);

            System.out.println("Staff expenses:");
            Scanner scanner = new Scanner(System.in);
            int staffExpenses = scanner.nextInt();
            System.out.println(staffExpenses);

            System.out.println("Other expenses:");
            int otherExpenses = scanner.nextInt();
            System.out.println(otherExpenses);

            System.out.println(STR."Net income:\{sum - staffExpenses - otherExpenses}");
        }

}