class Solution {
    public double angleClock(int hour, int minutes) {
        double calcu = Math.abs((30 * hour) - (5.5 * minutes));
        return Math.min(calcu, 360 - calcu);
    }
}