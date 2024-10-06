import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Predator predator;

    @Test
    public void checkGetKittens() throws Exception {
        Mockito.when(predator.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", predator);
        int getKittensRes = lion.getKittens();
        Assert.assertEquals(getKittensRes, 3);
    }

    @Test
    public void testGetFood() throws Exception {

        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(eat);
        Lion lion = new Lion("Самец", predator);
        Assert.assertEquals(eat, lion.getFood());

    }

    @Test
    public void testInvalidSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Некорректный пол", predator));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}