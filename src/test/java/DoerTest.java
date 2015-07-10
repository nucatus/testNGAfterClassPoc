import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by alexandru.ionita on 7/10/15.
 */
public class DoerTest
{
    
    private Doer context;
    
    @BeforeClass 
    public void initContext()
    {
        context = new Doer();
    }
    
    @Test
    public void testDoer()
    {
        assertTrue(context.doSum(4, 5) == 9);
    }

    @AfterClass
    public void DestroyContext()
    {
        if (context == null)
        {
            throw new IllegalStateException("Context shouldn't be  null");
        }
    }
    
}
