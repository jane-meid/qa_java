import com.example.LionAlex;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    private Predator predator;

    @Test
    public void setUp() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", predator);
        Assert.assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void testGetKittens() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", predator);
        int kittens = lionAlex.getKittens();
        Assert.assertEquals(0, kittens);
    }

    @Test
    public void testGetFriends() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", predator);
        List<String> friends = lionAlex.getFriends();
        Assert.assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец", predator);
        String placeOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("Нью-Йоркский зоопарк", placeOfLiving);
    }
}