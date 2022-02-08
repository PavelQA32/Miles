public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 1234;
        int bonusMiles = service.calculate(ticketPrice);
        System.out.println(bonusMiles + " - количество бонусных миль");
    }
}