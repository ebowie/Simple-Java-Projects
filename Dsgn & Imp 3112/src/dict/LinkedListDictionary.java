/**
 * @author Eric Bowers.
 * Date: 2/27/2014.
 */
package dict;

/** Linked List Dictionary. */
public class LinkedListDictionary implements Dictionary {
    /** Set for the next's object. */
    private LinkedListDictionary next;
    /** Holds most of the Strings. */
    private final String key;
    /** Holds most of the Objects. */
    private final Object value;
    /** Set for size positions. */
    private static final int THREE = 3;
    /** Display all String. */
    private String display = "";
    /** main Object that holds most data. */
    private LinkedListDictionary mainObject;

    /** Default Constructor. */
    public LinkedListDictionary() {
        mainObject = null;
        next = null;
        key = null;
        value = null;
    }

    /**
     * Constructor.
     *
     * Set the keyWord. Set the objValue.
     *
     * @param keyWord
     *            the string is a keyWord.
     * @param objValue
     *            the object is value.
     */
    public LinkedListDictionary(final String keyWord, final Object objValue) {
        this.key = keyWord;
        this.value = objValue;
    }

    /***********************************
     * Put Method.
     *
     * Inserts a String and Object. Its goes through a Link List
     *
     * @param keyWord
     *            the string is a keyWord.
     * @param objValue
     *            the object is objValue.
     ***********************************/
    @Override
    public final void put(final String keyWord, final Object objValue) {
        LinkedListDictionary referenceMainObj = mainObject;
        LinkedListDictionary newObject;
        newObject = new LinkedListDictionary(keyWord, objValue);
        // /////////////////////
        // if null put in the first object in the linked list
        if (mainObject == null) {
            mainObject = newObject;
        } else { // check to see if next reference is null
            while (referenceMainObj.next != null) {
                referenceMainObj = referenceMainObj.next;
            } // check the next object in the list insert
            referenceMainObj.next = newObject;
        }
    }

    /***************************************
     * Remove Method.
     *
     * Search through the keyWord in the linked list. When found it remove the
     * Object. if Null it will return null.
     *
     * @param keyWord
     *            the string is a keyWord.
     * @return currentObj
     **************************************/
    @Override
    public final Object remove(final String keyWord) {

        LinkedListDictionary currentObj = mainObject;
        LinkedListDictionary previousObj = mainObject;
        // check for the keyword
        while (currentObj.key != keyWord) {
            if (currentObj.next == null) {
                return null;
            } else { // put current object in to previous
                previousObj = currentObj;
                // then next object into current
                currentObj = currentObj.next;
            }
        } // current equal main insert the next main into main
        if (currentObj == mainObject) {
            mainObject = mainObject.next;
        } else { // else current next is in previous next
            previousObj.next = currentObj.next;
        }
        return currentObj;
    }

    /*************************
     * Get Method.
     *
     * Search keyWord through the Linked List. When found it will return Object.
     * If Null it will return Null.
     *
     * @param keyWord
     *            the string is a keyWord.
     * @return getObject.value
     **************************/
    @Override
    public final Object get(final String keyWord) {
        LinkedListDictionary getObject = mainObject;
        if (mainObject == null) { // return null
            return null;
        } // check for keyword
        while (getObject.key != keyWord) {
            if (getObject.next == null) {
                return null; // then return null
            } else { // else puts the next object into get object
                getObject = getObject.next;
            }
        }
        return getObject.value;
    }

    /**************************
     * ToString Method.
     *
     * Display all Linked List in a String. If empty it will only display
     * braces.
     *
     * @return display
     *************************/
    @Override
    public final String toString() {
        String edit;
        LinkedListDictionary displayObj = mainObject;
        if (displayObj != null) { // display all objects
            while (displayObj != null) {
                display += displayObj.key + ":" + displayObj.value + ", ";
                displayObj = displayObj.next;
            } // get rid of the comma at the end of the string
            edit = "[" + display + "]";
            char[] editChar = edit.toCharArray();
            editChar[edit.length() - 1] = ' ';
            editChar[edit.length() - 2] = ' ';
            editChar[edit.length() - THREE] = ']';
            edit = String.valueOf(editChar);
            edit = edit.trim(); // trims white spaces

            return edit;
        } else { // if empty returns empty braces
            String empty = "[]";
            display = empty;
            return display;
        }
    }
}
