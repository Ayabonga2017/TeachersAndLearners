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

        //take another order with the same learner Token
        cafe.takeOrder("fruit-salad" ,"","");
        //set price for my new product
        cafe.price( 7 );

        //takes in the learner token and compare it the price of the product that the wants to buy:
        cafe.menu(7);
    }
}
