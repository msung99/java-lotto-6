package lotto.service;

import lotto.domain.Lotto;
import lotto.domain.WinningNumbers;
import lotto.domain.LottoStatistics;
import java.util.List;

public class LottoStatisticsService {

    // 통계 계산 메서드
    public LottoStatistics calculateStatistics(List<Lotto> tickets, WinningNumbers winningNumbers) {
        int match3 = 0, match4 = 0, match5 = 0, match5Bonus = 0, match6 = 0;

        for (Lotto ticket : tickets) {
            int matchCount = ticket.countMatchingNumbers(winningNumbers.getWinningNumbers());
            boolean containsBonus = winningNumbers.containsBonusNumber(ticket);

            if (matchCount == 3) match3++;
            else if (matchCount == 4) match4++;
            else if (matchCount == 5 && containsBonus) match5Bonus++;
            else if (matchCount == 5) match5++;
            else if (matchCount == 6) match6++;
        }

        // LottoStatistics 객체 반환
        return new LottoStatistics(match3, match4, match5, match5Bonus, match6);
    }

    // 수익률 계산
    public double getProfitRate(LottoStatistics statistics, int purchaseAmount) {
        int totalProfit = (statistics.getMatch3() * 5000) +
                (statistics.getMatch4() * 50000) +
                (statistics.getMatch5() * 1500000) +
                (statistics.getMatch5Bonus() * 30000000) +
                (statistics.getMatch6() * 2000000000);
        return ((double) totalProfit / purchaseAmount) * 100;
    }
}
