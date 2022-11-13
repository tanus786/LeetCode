class Solution {
    public double[] convertTemperature(double c) {
        double[] Arr = new double[2];
        Arr[0] = c + 273.15;
        Arr[1] = (c * 1.80) +32.00;
        return Arr;
        
    }
}
