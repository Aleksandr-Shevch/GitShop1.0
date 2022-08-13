package controllers;

import models.Client;
import utils.Rounder;
import views.ClientView;

public class ClientController {

    Client model;
    ClientView view;

    // �����������
    public ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double paymentInitial = model.calculatePayment(model.getQuantity(), model.getPrice());
        String paymentInitialRounded = Rounder.roundValue(paymentInitial);

        double discount = model.calculateDiscount(paymentInitial);
        String discountRounded = Rounder.roundValue(discount);

        String paymentRounded = Rounder.roundValue(model
                .calculatePayment(paymentInitial, discount));

        String output = "------------------------------\n" +
                "��� �������: " + name + "\n" +
                "���� ������� (���.): " + paymentInitialRounded + "\n" +
                "����� ������ (���.): " + discountRounded + "\n" +
                "� ������ (���.): " + paymentRounded;

        view.getOutput(output);
    }
}

