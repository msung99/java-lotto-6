package lotto.view;

import lotto.domain.LottoStatistics;

public class OutputView {
    public static void printPurchaseMessage(int count) {
        System.out.println(count + "개를 구매했습니다.");
    }

    public static void printTickets(String ticket) {
        System.out.println(ticket);
    }

    public static void printWinningStatistics(LottoStatistics statistics, double profitRate) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + statistics.getMatch3() + "개");
        System.out.println("4개 일치 (50,000원) - " + statistics.getMatch4() + "개");
        System.out.println("5개 일치 (1,500,000원) - " + statistics.getMatch5() + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + statistics.getMatch5Bonus() + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + statistics.getMatch6() + "개");
        System.out.println("총 수익률은 " + String.format("%.1f", profitRate) + "%입니다.");
    }
}
