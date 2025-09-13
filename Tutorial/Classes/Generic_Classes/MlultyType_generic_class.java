package Classes.Generic_Classes;

class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue(){
        return this.value;
    }
}

public class MlultyType_generic_class {
    public static void main(String[] args) {
        Pair<String,Integer>pair = new Pair<>("Aritra",12);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

    }
}
