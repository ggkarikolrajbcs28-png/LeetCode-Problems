class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invs) {
        List<Integer>[] g = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] e : invs) {
            int u = e[0];
            int v = e[1];
            g[u].add(v);
        }
        boolean[] iF = new boolean[n];
        iF[k] = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(k);
        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : g[u]) {
                if (!iF[v]) {
                    iF[v] = true;
                    q.offer(v);
                }
            }
        }
        for (int[] e : invs) {
            int u = e[0];
            int v = e[1];

            if (!iF[u] && iF[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!iF[i]) {
                res.add(i);
            }
        }

        return res;
    }
}
