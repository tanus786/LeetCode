class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        st.add(0);
        HashSet<Integer> visited = new HashSet<Integer>();
        visited.add(0);
        while (!st.isEmpty()) {
            int i = st.pop();
            for (int j : rooms.get(i))
                if (!visited.contains(j)) {
                    st.add(j);
                    visited.add(j);
                }
        }
        return rooms.size() == visited.size();
    }
}
