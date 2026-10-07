/* public class HashMapImplementation {
    static class ChainedHashMap<K, V> {
        private static final int INITIAL_CAPACITY = 4;
        private static final double LOAD_FACTOR = 0.75;

        private java.util.List<java.util.List<Entry<K, V>>> buckets;
        private int size;

        private static class Entry<K, V> {
            private final K key;
            private V value;

            private Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        ChainedHashMap() {
            buckets = createBuckets(INITIAL_CAPACITY);
        }

        private java.util.List<java.util.List<Entry<K, V>>> createBuckets(int capacity) {
            java.util.List<java.util.List<Entry<K, V>>> result =
                    new java.util.ArrayList<>(capacity);
            for (int index = 0; index < capacity; index++) {
                result.add(new java.util.ArrayList<>());
            }
            return result;
        }

        private int bucketIndex(Object key, int capacity) {
            int hash = java.util.Objects.hashCode(key);
            hash ^= hash >>> 16;
            return (hash & 0x7fffffff) % capacity;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean containsKey(K key) {
            return findEntry(key) != null;
        }

        public V get(K key) {
            Entry<K, V> entry = findEntry(key);
            return entry == null ? null : entry.value;
        }

        public V put(K key, V value) {
            Entry<K, V> existing = findEntry(key);
            if (existing != null) {
                V previousValue = existing.value;
                existing.value = value;
                return previousValue;
            }

            if (size + 1 > buckets.size() * LOAD_FACTOR) {
                resize();
            }
            buckets.get(bucketIndex(key, buckets.size())).add(new Entry<>(key, value));
            size++;
            return null;
        }

        public V remove(K key) {
            java.util.List<Entry<K, V>> bucket = buckets.get(bucketIndex(key, buckets.size()));
            for (int index = 0; index < bucket.size(); index++) {
                Entry<K, V> entry = bucket.get(index);
                if (java.util.Objects.equals(entry.key, key)) {
                    bucket.remove(index);
                    size--;
                    return entry.value;
                }
            }
            return null;
        }

        private Entry<K, V> findEntry(K key) {
            java.util.List<Entry<K, V>> bucket = buckets.get(bucketIndex(key, buckets.size()));
            for (Entry<K, V> entry : bucket) {
                if (java.util.Objects.equals(entry.key, key)) {
                    return entry;
                }
            }
            return null;
        }

        private void resize() {
            if (buckets.size() >= Integer.MAX_VALUE / 2) {
                throw new IllegalStateException("Hash map reached its maximum capacity");
            }
            java.util.List<java.util.List<Entry<K, V>>> oldBuckets = buckets;
            buckets = createBuckets(oldBuckets.size() * 2);
            for (java.util.List<Entry<K, V>> bucket : oldBuckets) {
                for (Entry<K, V> entry : bucket) {
                    buckets.get(bucketIndex(entry.key, buckets.size())).add(entry);
                }
            }
        }
    }

    public static void main(String[] args) {
        ChainedHashMap<String, Integer> map = new ChainedHashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);
        map.put("banana", 7);
        map.put(null, 1);
        map.put("Aa", 10);
        map.put("BB", 20);

        System.out.println("Bananas: " + map.get("banana"));
        System.out.println("Contains apple: " + map.containsKey("apple"));
        System.out.println("Colliding key values: " + map.get("Aa") + ", " + map.get("BB"));
        System.out.println("Null key value: " + map.get(null));
        System.out.println("Removed oranges: " + map.remove("orange"));
        System.out.println("Entry count: " + map.size());
    }
} */

    public class HashMapImplementation {

    static class MyHashMap<K, V> {

        static class Node<K, V> {

            K key;
            V value;
            Node<K, V> next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int bucketSize = 4;

        private Node<K, V>[] buckets;

        @SuppressWarnings("unchecked")
        MyHashMap() {
            buckets = (Node<K, V>[]) new Node[bucketSize];
        }

        private int hashFunction(K key) {

            return Math.abs(key.hashCode()) % bucketSize;
        }

        // PUT
        public void put(K key, V value) {

            int index = hashFunction(key);

            Node<K, V> current = buckets[index];

            // Check if key already exists
            while (current != null) {

                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }

                current = current.next;
            }

            // New node
            Node<K, V> newNode = new Node<>(key, value);

            newNode.next = buckets[index];

            buckets[index] = newNode;
        }

        // GET
        public V get(K key) {

            int index = hashFunction(key);

            Node<K, V> current = buckets[index];

            while (current != null) {

                if (current.key.equals(key)) {
                    return current.value;
                }

                current = current.next;
            }

            return null;
        }

        // REMOVE
        public V remove(K key) {

            int index = hashFunction(key);

            Node<K, V> current = buckets[index];
            Node<K, V> previous = null;

            while (current != null) {

                if (current.key.equals(key)) {

                    if (previous == null) {
                        buckets[index] = current.next;
                    } else {
                        previous.next = current.next;
                    }

                    return current.value;
                }

                previous = current;
                current = current.next;
            }

            return null;
        }
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        System.out.println("A = " + map.get("A"));
        System.out.println("B = " + map.get("B"));
        System.out.println("C = " + map.get("C"));

        map.put("A", 100);

        System.out.println("After updating A: " + map.get("A"));

        map.remove("B");

        System.out.println("After removing B: " + map.get("B"));
    }
}
