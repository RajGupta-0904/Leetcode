class Solution {
    public int convertTime(String current, String correct) {
        int curMinutes = toMinutes(current);
        int corMinutes = toMinutes(correct);
        int diff = corMinutes - curMinutes;

        int[] steps = {60, 15, 5, 1};
        int operations = 0;

        for (int step : steps) {
            operations += diff / step;
            diff %= step;
        }

        return operations;
    }

    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
