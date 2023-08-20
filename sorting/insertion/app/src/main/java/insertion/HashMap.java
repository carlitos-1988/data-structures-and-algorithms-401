package insertion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class HashMap <K, V> {

    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
    int size;

    public HashMap(int size)
    {
        if (size < 1)
        {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

        // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
        for (int i = 0; i < this.size; i++)
        {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }

    // Make sure to replace if the key is a dupe!
    public void set(K key, V value)
    {
        // TODO: implement me
        int derrivedIndex = hash(key);
        //create local linked list with HashMapPair being the nodes
        LinkedList<HashMapPair<K,V>> bucket = bucketArrayList.get(derrivedIndex);

        //iterating through the bucket to see if the key passed in is already in the bucket
        for (HashMapPair<K,V> pair:bucket){
            //If it is the value gets updated and loop stops
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        //if nothing is found the new key value pair is created and added to the bucket
        bucket.add(new HashMapPair<>(key, value));
    }

    public V get(K key)
    {
        // TODO: implement me
        //hash passed in key to search the bucket array list
        int calcIndex = hash(key);
        //retrieves the bucket from the bucket ArrayList using calcIndex
        LinkedList<HashMapPair<K,V>> bucket = bucketArrayList.get(calcIndex);

        //iterate through the bucket that was retrieved
        for (HashMapPair<K,V> pair:bucket){
            //check if the passed in ket equals the key of the of each iterated item
            if (pair.getKey().equals(key)){
                return pair.getValue();
            }
        }

        return null;
    }

    public boolean contains(K key)
    {
        // TODO: implement me
        int searchIndex = hash(key);
        LinkedList<HashMapPair<K,V>> returnedBucket = bucketArrayList.get(searchIndex);

        for (HashMapPair<K,V> pair:returnedBucket){
            if (pair.getKey() == key){
                return true;
            }
        }

        return false;
    }

    public List<K> keys()
    {
        // TODO: implement me
        List<K> allKeys = new ArrayList<>();

        //Need to iterate through all buckets inside internal bucketArraylist
        for (LinkedList<HashMapPair<K,V>> bucket:bucketArrayList){
            //now that each bucket is retrieved iterate through each pair item inside the bucket
            for (HashMapPair<K,V>pair:bucket){
                allKeys.add(pair.getKey());
            }
        }
        return allKeys;
    }




    // Sometimes hashCode in Java can be negative! So we need to do absolute value
    // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
    // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
    // If you do this, things that should collide, won't, because Object.hashCode() is not good
    // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value
    public int hash(K key)
    {
        return Math.abs(key.hashCode()) % size;
    }

}
