package lotto.domain;

public class LottoStatistics {
    private final int match3;
    private final int match4;
    private final int match5;
    private final int match5Bonus;
    private final int match6;

    public LottoStatistics(int match3, int match4, int match5, int match5Bonus, int match6) {
        this.match3 = match3;
        this.match4 = match4;
        this.match5 = match5;
        this.match5Bonus = match5Bonus;
        this.match6 = match6;
    }

    public int getMatch3() { return match3; }
    public int getMatch4() { return match4; }
    public int getMatch5() { return match5; }
    public int getMatch5Bonus() { return match5Bonus; }
    public int getMatch6() { return match6; }
}
