import org.base.BasicBurger;
import org.decorators.Bacon;
import org.decorators.Lettuce;
import org.decorators.Tomato;
import org.interfaces.Burger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {
    @Test
    public void testBasicBurger() {
        Burger burger = new BasicBurger();
        assertEquals("Pão e carne", burger.getDescription());
        assertEquals(5.00, burger.getCost(), 0.01);
    }

    @Test
    public void testBurgerWithBacon() {
        Burger burger = new Bacon(new BasicBurger());
        assertEquals("Pão e carne, Bacon", burger.getDescription());
        assertEquals(7.50, burger.getCost(), 0.01);
    }

    @Test
    public void testBurgerWithBaconAndLettuce() {
        Burger burger = new Lettuce(new Bacon(new BasicBurger()));
        assertEquals("Pão e carne, Bacon, Alface", burger.getDescription());
        assertEquals(8.50, burger.getCost(), 0.01);
    }

    @Test
    public void testBurgerWithAllIngredients() {
        Burger burger = new Tomato(new Lettuce(new Bacon(new BasicBurger())));
        assertEquals("Pão e carne, Bacon, Alface, Tomate", burger.getDescription());
        assertEquals(10.00, burger.getCost(), 0.01);
    }
}
