class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int meters = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if (!batteryDrained()) {
            meters += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}


class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        while (!car.batteryDrained() && car.distanceDriven() < distance) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}

