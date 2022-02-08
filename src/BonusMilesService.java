public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusMilePrice = 20;


        int bonusMiles = ticketPrice / bonusMilePrice;
        return bonusMiles;

    }
}
