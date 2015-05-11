package spreed;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is WordSource Class.
 */
public class WordSource {
    /**
     * counter for the size of the text file.
     */
    private static int counter = 0;
    /**
     * To take in a word.
     */
    private static String word;
    /**
     * To Store the WordList.
     */
   private final ArrayList<String> wordList = new ArrayList<String>();

    /**
     * To take in filename and store all the
     * words in the arraylist.
     *
     * @param filename
     *  A file goes in the filename.
     *
     * @throws java.io.FileNotFoundException
     * A Exception will be thrown if the file doesnt exit.
     */
    public WordSource(final String filename)
            throws java.io.FileNotFoundException {
        File file = new File(filename);
        Scanner infile = new Scanner(file);
        //this will loop each word from file
        //and be stored in the array list.
        while (infile.hasNext()) {
            word = infile.next();
            wordList.add(word);
            counter++;

        }

        infile.close();

    }
    /**
     * This returns a word.
     * @param index
     * index number from the array list.
     * @return wordList.get(Index)
     * return a word.
     * @throws java.lang.IndexOutOfBoundsException
     * index out of bounds exception may occur.
     */
    public final String getWord(final int index)
            throws java.lang.IndexOutOfBoundsException {

        return wordList.get(index);
    }
    /**
     * This returns the size of the file.
     * @return counter
     */
    public final int getSize() {
        return counter;
    }

}
