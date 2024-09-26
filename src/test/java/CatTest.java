import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;


    @Test
    public void getSoundTest() {

        Feline feline = mock(Feline.class);

        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {

        Cat cat = new Cat(feline);

        List<String> expectedFood = List.of("Хищник");

        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

        Assert.assertEquals(expectedFood, cat.getFood());

        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}
