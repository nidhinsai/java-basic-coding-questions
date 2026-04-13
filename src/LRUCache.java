import java.util.LinkedHashMap;
import java.util.Map;

/******************************************************************************
 * Q45. Implement an LRU (Least Recently Used) Cache.
 *
 * Operations: get(key) and put(key, value) — both O(1).
 *
 * Example:
 *   LRUCache(2)
 *   put(1,1) put(2,2) get(1)→1 put(3,3) get(2)→-1 put(4,4) get(1)→-1 get(3)→3 get(4)→4
 *
 * Approach : LinkedHashMap with accessOrder=true evicts LRU automatically.
 *
 * Complexity: Time O(1) amortized  |  Space O(capacity)
 * Difficulty: Hard
 ******************************************************************************/
public class LRUCache {

    private final int capacity;
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) { return map.getOrDefault(key, -1); }

    public void put(int key, int value) { map.put(key, value); }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));  // 1
        cache.put(3, 3);
        System.out.println(cache.get(2));  // -1 (evicted)
        cache.put(4, 4);
        System.out.println(cache.get(1));  // -1 (evicted)
        System.out.println(cache.get(3));  // 3
        System.out.println(cache.get(4));  // 4
    }
}
