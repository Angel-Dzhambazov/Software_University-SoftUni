package hw02_OOP_Overview.p10_BeerCounter;

class BeerCounter {
    static int beerInStock;
    static int beersDrankCount;

    static void buyBeer(int i) {
        BeerCounter.beerInStock += i;
    }

    static void drinkBeer(int i) {
        BeerCounter.beersDrankCount += i;
        BeerCounter.beerInStock -= i;
    }
}
