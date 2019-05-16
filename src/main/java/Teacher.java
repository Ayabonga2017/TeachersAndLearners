
public class Teacher implements Methods {

    String leaners;
    int token;

    public String accept ( ) {

        if ( leaners.length() < 5 ) {

            return "class is canceled";
        } else {

            this.token =+5;
            return "LESSON IN PROGRESS";
        }
    }

    public int attended ( ) {
        return 0;
    }

    public int notes ( ){
        return 0;
    }
}
