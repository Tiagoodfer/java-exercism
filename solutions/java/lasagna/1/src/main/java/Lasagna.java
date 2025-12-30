public class Lasagna {

    public void todoLasagna() {
        Lasagna lasanha = new Lasagna();
        lasanha.expectedMinutesInOven();
        lasanha.remainingMinutesInOven(30);
        lasanha.preparationTimeInMinutes(2);
        lasanha.totalTimeInMinutes(3, 20);
    }
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x) {
        int time = expectedMinutesInOven();
        return time - x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x) {
        return x * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
     public int totalTimeInMinutes(int x , int secondy) {
         return (x * 2)+secondy;
    }
}
