package net.teachers.learners;

public class Cafeteria {

    public  String drink;
    public String snack;
    public String meal;
    public Integer token = 0;
    private Integer price = 0;
    String purchase = "Thank you for purchasing, ENJOY YOUR ";

    public void menu ( Integer learnerToken ) {

        this.token = learnerToken;

        if ( getToken() > price( price )) {

            token -= 3;

            System.out.println(purchase + meal + " !" );

        } else if ( getToken() > price(price) && meal.equals( "panini" )) {

            token = - 4;

        } else if (getToken()>price(price) && meal.equals( "hotdog" )) {

            token = - 5;
        } else if (getToken()>price(price) && meal.equals( "sandwich" )) {

             token = - 6;

        } else if ( getToken()>price(price) && meal.equals( "chicken&chips" )) {

            token = - 6;

        } else if ( getToken()>1 && snack.equals( "fruit-salad" )) {
            token = - 1;

        } else if ( getToken()>3 && snack.equals( "popcorn" )) {
            token = - 3;

        } else if (getToken()>4 && snack.equals( "muffins" )) {
            token = - 4;

        } else if ( getToken()>2 && drink.equals( "soda" )) {
            token = - 2;

        } else if ( getToken()>1 && drink.equals( "milk" )) {
            token = - 1;

        } else if ( getToken()>1 && drink.equals( "coffee" )) {
            token = - 1;

        } else if ( getToken()>2 && drink.equals( "juice" )) {
            token = - 2;

        }else{

            StringBuilder sorry = new StringBuilder();
            sorry.append( "Sorry " );
            sorry.append( "you don't have " );
            sorry.append( "enough tokens " );
            sorry.append( "to  purchase " );
            sorry.append( " this product" );
            System.out.println(sorry );

        }
    }

    public Integer price(Integer totalPrice){

        this.price=totalPrice;
       return price;
    };
    public void takeOrder( String meals,String snacks,String drinks){

        this.meal  = meals;
        this.snack = snacks;
        this.drink = drinks;
    }

    public String getDrink ( ) {
        System.out.println(drink );
        return drink;
    }

    public String getSnack ( ) {
        System.out.println(snack );
        return snack;
    }

    public String getMeal ( ) {
        System.out.println(meal );
        return meal;
    }

    public Integer getToken ( ) {
        System.out.println(token );
        return token;
    }
}
