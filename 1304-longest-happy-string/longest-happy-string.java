import java.util.PriorityQueue;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Create a max heap (priority queue) to store character frequencies
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.freq - p1.freq);

        // Push non-zero frequencies to the priority queue
        if (a > 0) pq.offer(new Pair(a, 'a'));
        if (b > 0) pq.offer(new Pair(b, 'b'));
        if (c > 0) pq.offer(new Pair(c, 'c'));

        // Initialize the result string
        StringBuilder result = new StringBuilder();

        
        while (pq.size() > 1) {
           
            Pair pair1 = pq.poll();
            int freq1 = pair1.freq;
            char c1 = pair1.ch;

           
            if (result.length() <= 1) {
                result.append(c1);
                freq1--;
                if (freq1 > 0) pq.offer(new Pair(freq1, c1));
            } else {
             
                if (result.charAt(result.length() - 1) == c1 && result.charAt(result.length() - 2) == c1) {
                   
                    Pair pair2 = pq.poll();
                    int freq2 = pair2.freq;
                    char c2 = pair2.ch;

                    result.append(c2);
                    freq2--;

                    
                    if (freq2 > 0) pq.offer(new Pair(freq2, c2));
                    if (freq1 > 0) pq.offer(new Pair(freq1, c1));
                } else {
                   
                    result.append(c1);
                    freq1--;
                    if (freq1 > 0) pq.offer(new Pair(freq1, c1));
                }
            }
        }

        if (!pq.isEmpty()) {
            Pair pair1 = pq.poll();
            int freq1 = pair1.freq;
            char c1 = pair1.ch;
            
   
            if (freq1 <= 1) {
                result.append(c1);
            } else {
                result.append(c1).append(c1);
            }
        }

  
        return result.toString();
    }


    private static class Pair {
        int freq;
        char ch;

        Pair(int freq, char ch) {
            this.freq = freq;
            this.ch = ch;
        }
    }
}