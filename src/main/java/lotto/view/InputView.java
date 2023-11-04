package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.Budget;

public class InputView {
    private static final String REQUIRE_BUDGET_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String REQUIRE_BONUS_MESSAGE = "보너스 번호를 입력해 주세요.";

    public static String getBudgetInput(){
        System.out.println(REQUIRE_BUDGET_MESSAGE);
        return Console.readLine();
    }

    public static String getBonusInput(){
        System.out.println(REQUIRE_BONUS_MESSAGE);
        return Console.readLine();
    }
}
