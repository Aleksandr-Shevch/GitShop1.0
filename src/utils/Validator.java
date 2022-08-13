package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        boolean result = str.matches("[a-zA-Z]+");
        while (str.isEmpty()) {
            System.out.print("�����! ������� ��� �������: ");
            str = scanner.nextLine().trim();
        }
        while (!result) {
            try {
                throw new MyException("");
            } catch (MyException myException) {
                System.out.println(myException.getMessege());
                str = scanner.nextLine().trim();

                System.out.println(str + "- ������������ �������!");
                str = scanner.nextLine().trim();
            }
            return str;
        }

        return str;
    }


    public static int validateQuantityInput(Scanner scanner) {

        int quantity;
        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - �� �����!%n������� ����������!: ", str);
        }

        quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println("�������� ��������! ������� ����������: ");
            while (!scanner.hasNextInt()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - �� �����!%n������� ����������!: ", str1);
                }
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }


    public static double validatePriceInput(Scanner scanner) {

        double price;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - �� �����!%n������� ����!: ", str);
        }
        while (!scanner.hasNextDouble()) {
            try {
                str1 = scanner.next().trim();
            } catch (InputMismatchException ime) {
                System.out.printf("\"%s\" - �� �����!%n������� ����!: ", str1);
            }
        }
        price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print("�������� ��������! ������� ����: ");

            price = scanner.nextDouble();
        }
        return price;
    }
}


