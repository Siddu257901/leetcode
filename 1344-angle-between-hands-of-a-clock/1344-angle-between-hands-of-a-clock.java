class Solution {
    public double angleClock(int hour, int minutes) {

        double m=6*minutes;
        double h=30*hour+0.5*minutes;
        System.out.println(h);
        double d11=Math.abs(m-h);
        double mi=Math.min(d11,360-d11);
        return mi;
    }
}