import com.example.Cat;
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
    Feline mockFeline;

    @InjectMocks
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.eatMeat(), mockFeline.eatMeat());
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

        Mockito.when(mockFeline.getKittens()).thenReturn(1);

        int result = mockFeline.getKittens();
        Assert.assertEquals(1, result);

        Mockito.verify(mockFeline, times(1)).getKittens();
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
}