import static org.junit.Assert.*;

import java.beans.Transient;
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemosTest {
    @Test 
    public void subtraction(){
        assertEquals(2, SkillDemos.sub(4,2));
    }
}
