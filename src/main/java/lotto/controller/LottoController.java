package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.WinningNumbers;
import lotto.domain.LottoStatistics;
import lotto.service.LottoStatisticsService;
import lotto.service.LottoTicketService;
import lotto.service.PurchaseService;
import lotto.service.WinningNumbersService;
import lotto.view.OutputView;

import java.util.List;

public class LottoController {

    private final PurchaseService purchaseService;
    private final LottoTicketService lottoTicketService;
    private final WinningNumbersService winningNumbersService;
    private final LottoStatisticsService lottoStatisticsService;

    public LottoController() {
        this.purchaseService = new PurchaseService();
        this.lottoTicketService = new LottoTicketService();
        this.winningNumbersService = new WinningNumbersService();
        this.lottoStatisticsService = new LottoStatisticsService();
    }

    public void run() {
        int purchaseAmount = handlePurchaseAmount();
        List<Lotto> tickets = generateTickets(purchaseAmount);

        OutputView.printPurchaseMessage(tickets.size());
        tickets.forEach(ticket -> OutputView.printTickets(ticket.getNumbers().toString()));

        WinningNumbers winningNumbers = handleWinningNumbers();

        LottoStatistics stats = calculateStatistics(tickets, winningNumbers);

        double profitRate = lottoStatisticsService.getProfitRate(stats, purchaseAmount);
        OutputView.printWinningStatistics(stats, profitRate);
    }

    private int handlePurchaseAmount() {
        try {
            return purchaseService.handlePurchaseAmount();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return handlePurchaseAmount();
        }
    }

    private List<Lotto> generateTickets(int purchaseAmount) {
        try {
            return lottoTicketService.generateTickets(purchaseAmount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateTickets(purchaseAmount);
        }
    }

    private WinningNumbers handleWinningNumbers() {
        try {
            return winningNumbersService.handleWinningNumbers();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return handleWinningNumbers();
        }
    }

    private LottoStatistics calculateStatistics(List<Lotto> tickets, WinningNumbers winningNumbers) {
        try {
            return lottoStatisticsService.calculateStatistics(tickets, winningNumbers);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return calculateStatistics(tickets, winningNumbers);
        }
    }
}
