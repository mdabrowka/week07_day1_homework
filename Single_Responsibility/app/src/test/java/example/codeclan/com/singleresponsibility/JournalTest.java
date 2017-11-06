package example.codeclan.com.singleresponsibility;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


/**
 * Created by marta on 06/11/2017.
 */

public class JournalTest {
    Journal journal;
    Bear bear;
    Salmon food;

    @Before
    public void setup() {
        journal = new Journal();
        bear = new Bear();
        food = new Salmon();
    }

    @Test
    public void canWriteJournalEntry(){
        bear.eat(food);
        journal.writeJournal("Dear Diary, I ate " + bear.foodCount() + " salon today.");
        assertEquals("Dear Diary, I ate 1 salon today.", journal.getLastJournalEntry());
    }



}
