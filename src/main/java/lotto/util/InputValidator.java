package lotto.util;

public class InputValidator {

    public static void validatePurchaseInput(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("[ERROR] 구매 금액은 숫자로만 이루어져야 합니다.");
            }
        }
    }

    public static void validatePurchaseAmount(int purchaseAmount) {
        if (purchaseAmount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 1000원 단위여야 합니다.");
        }
    }

}
