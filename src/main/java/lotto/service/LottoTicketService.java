package lotto.service;

import lotto.domain.Lotto;
import lotto.util.LottoGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoTicketService {

    public List<Lotto> generateTickets(int purchaseAmount) {
        int ticketCount = purchaseAmount / 1000;
        List<Lotto> tickets = new ArrayList<>();
        for (int i = 0; i < ticketCount; i++) {
            tickets.add(new Lotto(LottoGenerator.generate()));
        }
        return tickets;
    }
}
