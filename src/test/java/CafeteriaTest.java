import net.teachers.learners.Cafeteria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CafeteriaTest {

    @Test public void buy(){

        Cafeteria cafe = new Cafeteria( );

        //take order
        cafe.takeOrder("chicken & chips","fruit-salad","" );

        //set the product price
        cafe.price( 5 );

        assertEquals(cafe.getMeal(),"chicken & chips");
        assertEquals( cafe.getSnack(),"fruit-salad" );
        cafe.menu(7);

    }
}
