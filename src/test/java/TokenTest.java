import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenTest {

    Tokens token = new Tokens();

    @Test
    public void notesFromRegistered(){
    token.subjects ="CAT";

        assertEquals(token.notes(),-2);
    }
    @Test
    public void notesFromUnRegistered(){
        token.subjects = "UnRegistered" ;
        assertEquals(token.notes(),-5);
    }
}
