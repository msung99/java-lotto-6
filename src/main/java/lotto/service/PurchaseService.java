package lotto.service;

import lotto.util.InputValidator;
import lotto.view.InputView;

public class PurchaseService {

    public int handlePurchaseAmount() {
        String purchaseInput = InputView.inputPurchaseAmount();
        InputValidator.validatePurchaseInput(purchaseInput);

        int purchaseAmount = Integer.parseInt(purchaseInput);
        InputValidator.validatePurchaseAmount(purchaseAmount);

        return purchaseAmount;
    }
}
