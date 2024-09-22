import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline MockFeline;

    @InjectMocks
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        Mockito.when(MockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.eatMeat(), MockFeline.eatMeat());
    }


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();

        String result = feline.getFamily();

        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, result);
    }

    @Test
    public void getKittensTest() {

        Mockito.when(MockFeline.getKittens()).thenReturn(3);

        int result = MockFeline.getKittens();
        Assert.assertEquals(3, result);

        Mockito.verify(MockFeline, times(1)).getKittens();
    }

    @Test
    public void testGetKittens() {

        Mockito.when(MockFeline.getKittens()).thenReturn(1);

        Assert.assertEquals(feline.getKittens(), MockFeline.getKittens());
    }
}