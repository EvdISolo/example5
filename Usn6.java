public class Usn6 {

    public static int taxEarningsPlusSpending(int earnings, int spendings) {
        int tax = (earnings) * 6 / 100;
        return tax;
    }

    public static int taxEarningsMinusSpending(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}

