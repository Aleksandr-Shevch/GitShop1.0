package utils;

import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("�����! ������� ��� �������: ");
            str = scanner.nextLine().trim();
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

        price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print("�������� ��������! ������� ����: ");

            price = scanner.nextDouble();
        }
        return price;
    }
}


