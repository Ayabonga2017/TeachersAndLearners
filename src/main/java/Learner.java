import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Learner {

    String learner;
    String lastName;
    String email;
    int token = 0;

    public Learner (String learner , String lastName , String email) {

        this.learner = learner;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName ( ) {
        return learner;
    }

    public String getSurname ( ) {
        return lastName;
    }

    public String getEmail ( ) {
        return email;
    }

    Map < Learner,Integer > leanerList = new HashMap <>();

    public void setLeanerList ( ) {

        leanerList.put(new Learner("Aya" , "jacobs" , "ajacobs@gmail.com") , token);
        leanerList.put(new Learner("min" , "cross" , "mcross@gmail.com") , token);
        leanerList.put(new Learner("randy" , "lake" , "rlake@gmail.com") , token);
        leanerList.put(new Learner("ran" , "ake" , "rake@gmail.com") , token);
        leanerList.put(new Learner("an" , "ke" , "ake@gmail.com") , token);

    }

    public int howMany(){

        return leanerList.size();
    }

    public Map < Learner,Integer> show(){

        System.out.println(leanerList);

        return leanerList;
    }
}
