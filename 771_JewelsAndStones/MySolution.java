import java.util.Map;
import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> cmap = new HashMap<Character, Integer> ();
        for (Character c: S.toCharArray()) {
            if (!cmap.containsKey(c)) {
                cmap.put(c, 1);
            } else {
                cmap.replace(c, cmap.get(c) + 1);
            }
        }
        
        System.out.println(cmap);
        
        int sum = 0;
        for (Character c: J.toCharArray()) {
            if (cmap.containsKey(c)) {
                sum += cmap.get(c);
            }
        }
        return sum;
    }
}
