package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDeliveryModel implements AppModel {
    double percent = 5;

    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuota() * purchase.getPrice();
        return cost + (cost/100)*percent;
    }
}