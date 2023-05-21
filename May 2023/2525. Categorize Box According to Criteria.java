class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long n = (long)length * (long)width * (long)height;
        String str ="";
        int flag = 0;
        if(length>=1e4 || height>=1e4 || width>=1e4 || n >=1e9)
            str = "Bulky";
        if(mass>=100)
            flag = 1;
        if(str=="Bulky" && flag ==1)
            str = "Both";
        else if(str=="Bulky" && flag !=1)
            str = "Bulky";
        else if(str!="Bulky" && flag ==1)
            str = "Heavy";
        else
            str = "Neither";

        return str;
    }
}
