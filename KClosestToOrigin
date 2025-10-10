class KClosestToOrigin {
    public int[][] kClosest(int[][] points, int k) {
                PriorityQueue<Pair<Integer, int[][]>> maxHeap =
                new PriorityQueue<>(Comparator.comparing(Pair<Integer, int[][]>::getLeft).reversed()); // Max-heap

        for (int i=0; i<=points.length-1; i++) {
            Pair<Integer, int[][]> pair = new Pair(square(points[i][0], points[i][1]), new int[][]{{points[i][0], points[i][1]}});
            maxHeap.add(pair);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
       // System.out.println(maxHeap);
        int[][] result = new int[k][2];
        for (int i=0; i<k; i++) {
            Pair<Integer, int[][]> e = maxHeap.poll();
            result[i][0] = e.getValues()[0][0];
            result[i][1] = e.getValues()[0][1];
        }

        return result;
    }

        private static int square(int x, int y) {
        return (x * x) + (y * y);
    }

    public static class Pair<K, V> {
        K left;
        V right;

        Pair (K left, V right) {
            this.left = left;
            this.right = right;
        }

        public K getLeft(){
            return left;
        }

        public V getValues() {
            return right;
        }
    }
}
