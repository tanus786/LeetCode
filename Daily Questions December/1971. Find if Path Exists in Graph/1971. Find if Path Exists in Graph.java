class Solution {
    int[] par;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        for (int[] node : edges) {
            int p1 = find(node[0]);
            int p2 = find(node[1]);
            par[p2] = p1;
        }
        return find(source) == find(destination);
    }

    public int find(int n) {
        if (n != par[n]) {
            n = find(par[n]);
        }
        return n;
    }
}
