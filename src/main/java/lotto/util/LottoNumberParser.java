package lotto.util;

import java.util.ArrayList;
import java.util.List;

public class LottoNumberParser {

    public static List<Integer> parseWinningNumbers(String input) {
        String[] split = input.split(",");
        List<Integer> winningNumbers = new ArrayList<>();

        for (String num : split) {
            try {
                winningNumbers.add(Integer.parseInt(num.trim()));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("[ERROR] 당첨 번호는 숫자여야 합니다.");
            }
        }

        return winningNumbers;
    }
}
