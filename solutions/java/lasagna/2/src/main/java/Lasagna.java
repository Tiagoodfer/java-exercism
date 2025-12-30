public class Lasagna {

    public void todoLasagna() {
        Lasagna lasanha = new Lasagna();
        lasanha.expectedMinutesInOven();
        lasanha.remainingMinutesInOven(30);
        lasanha.preparationTimeInMinutes(2);
        lasanha.totalTimeInMinutes(3, 20);
    }
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int x) {
        int time = expectedMinutesInOven();
        return time - x;
    }
    public int preparationTimeInMinutes(int x) {
        return x * 2;
    }
     public int totalTimeInMinutes(int x , int secondy) {
         int y = preparationTimeInMinutes(x);
         return y + secondy;
    }
}
