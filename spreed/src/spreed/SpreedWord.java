package spreed;

/**
 * This will help the spreedApp get the pivot, pauselength, and alignment.
 *
 * @author Eric Bowers
 *
 */
public final class SpreedWord {
    /** This is just a have default constructor. */
    private SpreedWord() {

    }

    /**
     * this gets the pivot of a word.
     *
     * @param word
     *            a word come through the param.
     * @return returns the number of the pivot.
     */
    public static int getPivot(final String word) {
        int pivot = 0;
        // this check word length determines the pivot number.
        if (word.length() == 1) {
            pivot = 0;
        } else if (word.length() <= 5) {
            pivot = 1;
        } else if (word.length() <= 9) {
            pivot = 2;
        } else if (word.length() <= 13) {
            pivot = 3;
        } else if (word.length() >= 14) {
            pivot = 4;
        }
        return pivot;
    }

    /**
     * this will align the word in the center.
     *
     * @param word
     *            A word come in the param.
     * @param length
     *            The length number will set there.
     * @return This will return the align word.
     */
    public static String getAlignedWord(String word, int length) {
        SpreedWord pivot = new SpreedWord();// to get the pivot.
        String alignWord = "<html>"; // get the align word.
        double align; // get number of spaces
        double count = 0; // count the number of spaces
        double leftSpace; // geting left space
        double rightSpace = 0; // get right space
        int getPivot; // get pivot number
        // this check to see if the length is even add one
        if (length % 2 == 0) {
            length = length + 1;
        }
        // this checks for commas and semicolons and periods.
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                word = word.substring(0, word.length() - 1);
                break;
            } else if (word.charAt(i) == ';') {
                word = word.substring(0, word.length() - 1);
                break;
            } else if (word.charAt(i) == ',') {
                word = word.substring(0, word.length() - 1);
                break;
            }
        }
        // this gets the pivot
        getPivot = pivot.getPivot(word);
        // takes half the length
        align = length / 2;
        // gets the numbers space before the pivot.
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(letters[i])) {
                count++;
            } else {
                break;
            }
        }
        // get left spaces
        align = align - (getPivot + count);

        leftSpace = align;

        // adding the left spaces
        for (int i = 0; i < leftSpace; i++) {
            alignWord += "&nbsp;";
        }
        // add the word
        alignWord += word.substring(0, getPivot);
        alignWord += "<font color=\"yellow\">";
        alignWord += word.charAt(getPivot);
        alignWord += "</font>";
        for (int i = getPivot + 1; i < word.length(); i++)
            alignWord += word.charAt(i);
        //alignWord += word.substring(getPivot + 1, word.length() - getPivot + 1);
        // adding the right space or truncate
        if (alignWord.length() > length) {

        } else {
            rightSpace = length - alignWord.length();
            for (int j = 0; j < rightSpace; j++) {
                alignWord += " ";
            }
        }

        alignWord += "</html>";
        System.out.println(alignWord);

        return alignWord;
    }

    /**
     * this will display longer word on the screen.
     *
     * @param word
     *            A word comes in the param.
     * @return return the number of how many time the word should stay on the
     *         screen.
     */
    public static int getPauseLength(final String word) {
        int numWord = 0;
        int wordCount = word.length();
        // this check to see if there are any semicolons or commas.
        for (int x = 0; x < wordCount; x++) {
            if (word.substring(x).equals(",")) {
                numWord++;
                wordCount = wordCount - 1;
            } else if (word.substring(x).equals(".")
                    || word.substring(x).equals(";")) {
                numWord += 2;
                wordCount = wordCount - 1;

            }
        }
        // this to see how make character are in each word to get
        // the pause length
        if (wordCount <= 5) {
            numWord += 1;
        } else if (wordCount <= 10) {
            numWord += 2;
        } else if (wordCount <= 15) {
            numWord += 3;
        } else {
            numWord += 4;
        }

        return numWord;
    }

}
