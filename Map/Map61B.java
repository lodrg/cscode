package Map;

import java.util.List;

/**
 * @author lodrg
 * @date 2024/1/23 15:40:39
 */
public interface Map61B<K,V> {
    public void put(K key, V value);
    public boolean containsKey(K key);
    public V get(K key);
    public List<K> keys();
    public int size();
}
