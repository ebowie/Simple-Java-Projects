package dict;
/**
 *Testing
 */
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author Eric
 */
public class LinkedListDictionaryTest {
/**
 * variables.
 */
 private String testString = "Test";
 /**
  * variables.
  */
 private int testInt = 8;
 /**variable.*/
 private double testDouble = 1000;
 /**variables.*/
 private boolean testBool = true;
//**************************************
 /**test put method. */
    @Test
    public void testPut() {
     LinkedListDictionary tPut = new LinkedListDictionary();
     tPut.put("a", "Object 1");
     String expected = "[ a:Object 1,]";
     String result = tPut.toString();
     assertEquals(expected, result);
     }
    /**Test put method.*/
    @Test
    public void testPut2() {
     LinkedListDictionary tPut2 = new LinkedListDictionary();
     tPut2.put("b", "Object 2");
     tPut2.put("b", "Object 3");
     tPut2.put("b", "Object 4");
     String expected = "[ b:Object 2,b:Object 3,b:Object 4,]";
     String result = tPut2.toString();
     assertEquals(expected,result);
    }
    /**test put method.*/
    @Test
    public void testPut3() {
     LinkedListDictionary tPut3 = new LinkedListDictionary();
     tPut3.put(null,"Object 6");
     String expected = "[ null:Object 6,]";
     String result = tPut3.toString();
     assertEquals(expected,result);
     }
    /**Test put method.*/
    @Test
    public void testPut4() {
     LinkedListDictionary tPut4 = new LinkedListDictionary();
     tPut4.put("c", testInt);
     String expected = "[ c:8,]";
     String result = tPut4.toString();
     assertEquals(expected,result);
     }
     /**Test put method.*/
     @Test
     public void testPut5() {
      LinkedListDictionary tPut5 = new LinkedListDictionary();
      }
//************************************
/*
    @Test
	public void testLinkedListDictionary() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedListDictionaryStringObject() {
		fail("Not yet implemented");
	}
	@Test
	public void testSetKey() {
	}

	@Test
	public void testSetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNext() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNext() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

    @Test
	public void testToString() {
		fail("Not yet implemented");
	}
	*/

}
