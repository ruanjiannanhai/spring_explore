package test.com.justbon.different; 

import com.justbon.different.Dessert;
import com.justbon.different.DessertConfig;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/** 
* DessertConfig Tester. 
* 
* @author <Authors name> 
* @since <pre>Jan 31, 2018</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertConfigTest {

    @Autowired
    @Qualifier("soft")
    private Dessert dessert;

    @Test
    public void showName(){
        assertEquals("soft",dessert.getName());
    }


} 
