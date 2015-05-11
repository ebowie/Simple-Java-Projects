/**
 * @author Eric Bowers.
 * Date: 2/27/2014.
 */
package dict;

/**
 * HashDictionary data structure. tests only four methods.
 */
public class HashDictionary implements Dictionary {
    /** Integer to set up a size. */
    private static final int SIX = 6;
    /** Object array list of hash Linked list. */
    private final LinkedListDictionary[] hashList;
    /** Object to be use a to insert data in. */
    private final LinkedListDictionary insert = new LinkedListDictionary();
    /** A field that will hold most strings. */
    private final String key;
    /** A field that will display all strings. */
    private String display = "";
    /** Integer converter. */
    private int converter = 0;
    /** Set up integer position. */
    private int hashPosition;

    /**
     * Default Constructor.
     */
    public HashDictionary() {
        key = null; // key set to null
        hashList = new LinkedListDictionary[SIX]; // Object set 6
    }

    /**
     * Put Method.
     *
     * Inserting a String and Object. Goes through hash algorithm. Set a
     * position with in a array of Linked List. If Null then nothing is in the
     * put method.
     *
     * @param keyWord
     *            the string is keyWord.
     * @param objValue
     *            the object is objValue.
     */
    @Override
    public final void put(final String keyWord, final Object objValue) {
        if (keyWord != null) {
            for (int x = 0; x < keyWord.length(); x++) {
                converter += keyWord.charAt(x);
            } // hash conversion strings
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            hashList[hashPosition].put(keyWord, objValue);
        } else {
            String temp = "null";
            for (int x = 0; x < temp.length(); x++) {
                converter += temp.charAt(x);
            } // hash conversion for null
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            // put the new key and object in to the put method
            hashList[hashPosition].put(temp, objValue);
        }
    }

    /**
     * Remove Method
     *
     * Find the keyWord of the Object and Removes it. Goes through the hash
     * algorithm to find it. If Null then remove will be null
     *
     * @param keyWord
     *            the string is keyWord.
     * @return hashRemove
     */
    @Override
    public final Object remove(final String keyWord) {
        Object hashRemove;
        if (keyWord != null) {
            for (int x = 0; x < keyWord.length(); x++) {
                converter += keyWord.charAt(x);
            } // hash conversion
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            // this will delete the object
            hashRemove = hashList[hashPosition].remove(keyWord);
        } else {
            String temp = "null";
            for (int x = 0; x < temp.length(); x++) {
                converter += temp.charAt(x);
            } // hash conversion for null.
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            // this should have nothng in it.
            hashRemove = hashList[hashPosition].remove(temp);
        }
        return hashRemove;
    }

    /**
     * Get Method
     *
     * Search for a the KeyWord. When founded Object or hashValue is return Goes
     * Through hash algorithm. If Null then nothing was found.
     *
     * @param keyWord
     *            the string is keyWord.
     * @return hashValue
     */
    @Override
    public final Object get(final String keyWord) {
        Object hashValue;
        if (keyWord != null) {
            for (int x = 0; x < keyWord.length(); x++) {
                converter += keyWord.charAt(x);
            } // has conversion
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            // this should get back the object.
            hashValue = hashList[hashPosition].get(keyWord);
        } else {
            String temp = "null";
            for (int x = 0; x < temp.length(); x++) {
                converter += temp.charAt(x);
            } // hash conversion for null
            hashPosition = converter % hashList.length;
            hashList[hashPosition] = insert;
            // this should get back null.
            hashValue = hashList[hashPosition].get(temp);
        }
        return hashValue;
    }

    /**
     * ToString Method.
     *
     * Display what is in side the HashDicstionary Search through the whole hash
     * array displaying out everything.
     *
     *
     * @return display
     */
    @Override
    public final String toString() {
        int i = 0;
        while (i < hashList.length) {
            hashList[i] = insert;
            if (i == 1) {
                // display all objects.
                display += hashList[i].toString();
            }
            i++;
        }
        return display;
    }
}
