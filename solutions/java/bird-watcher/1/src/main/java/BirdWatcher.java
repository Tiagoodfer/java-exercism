class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        int sum = 0;

        for (int i = 0; i < daysToCount; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
