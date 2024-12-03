package lotto.service;

import lotto.domain.WinningNumbers;
import lotto.util.LottoNumberParser;
import lotto.view.InputView;

import java.util.List;

public class WinningNumbersService {

    public WinningNumbers handleWinningNumbers() {
        String winningNumbersInput = InputView.inputWinningNumbers();
        List<Integer> winningNumbers = LottoNumberParser.parseWinningNumbers(winningNumbersInput);
        int bonusNumber = InputView.inputBonusNumber();
        return new WinningNumbers(winningNumbers, bonusNumber);
    }
}
