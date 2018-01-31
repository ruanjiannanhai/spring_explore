package test.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.media.MediaPlayer;
import static org.junit.Assert.*;
/**
 * CDPlayerConfig Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 30, 2018</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {


    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void printMessage(){
        mediaPlayer.play();
        assertEquals("123","123");
    }


} 
