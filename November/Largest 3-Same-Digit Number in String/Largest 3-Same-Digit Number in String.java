class Solution {
    public String largestGoodInteger(String str) {
        if (str.contains("999")) {
			return "999";
		} else if (str.contains("888")) {
			return "888";
		} else if (str.contains("777")) {
			return "777";
		} else if (str.contains("666")) {
			return "666";
		} else if (str.contains("555")) {
			return "555";
		} else if (str.contains("444")) {
			return "444";
		} else if (str.contains("333")) {
			return "333";
		} else if (str.contains("222")) {
			return "222";
		} else if (str.contains("111")) {
			return "111";
		} else if (str.contains("000")) {
			return "000";
		} else
			return "";
    }
}
