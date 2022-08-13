package views;

import models.Client;
import utils.Validator;

import java.util.Scanner;

public class ClientView {

    Client model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // �����������
    public ClientView(Client model) {
        this.model = model;
    }

    public void getInputs() {

        // ������� ��������� Scanner
        scanner = new Scanner(System.in);

        // ���� � ��������� ������

        title = "������� ��� �������: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "������� ����������: ";
        System.out.print(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "������� ����: ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        // ��������� Scanner
        scanner.close();
    }

    // ����� ������
    public void getOutput(String output) {
        System.out.println(output);
    }
}
