import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(eat, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String result = feline.getFamily();
        Assert.assertEquals("Кошачьи", result);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int result = feline.getKittens();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetKittensWithParameter() {
        Feline feline = new Feline();
        int result = feline.getKittens(5);
        Assert.assertEquals(5, result);
    }

}
