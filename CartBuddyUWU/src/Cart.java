import java.util.*;

public class Cart {

String User;
Scanner sc = new Scanner(System.in);


    public static void main(String args[]) {

        UserEasyClass Customer = new UserEasyClass();
        Cart c = new Cart();


        c.AskForUserName();
        c.MenuOptions();


    }

    public void AskForUserName(){
        UserEasyClass u = new UserEasyClass();

        System.out.println("Please Enter a User Name");

        Scanner  sc = new Scanner(System.in);
        User = sc.nextLine();

        u.setCustomer(User);


        while(User.isEmpty()){

            System.out.println(" Please Enter A User Name :( ");
            User = sc.nextLine();

        }
        System.out.println( User + " Welcome To Shopping Buddy V.2");



    }


    public void MenuOptions(){


        ActualCart uwu = new ActualCart();



        boolean quit = false;


        while(true){

            System.out.println(" Please Select an Action \n A- To Add An Item \n D- To Remove From Cart \n S- To Show All Items \n Q- To Quit");
            String choice = sc.nextLine();

            if(choice.toLowerCase().contains("q")){

                System.out.println(" Thank you for using CartBuddy v.2");
                System.exit(0);
            }


            if(choice.toLowerCase().contains("a")){


                System.out.println("What Item Would You Like To Add?");
                uwu.addItems();
            }

            if(choice.toLowerCase().equals("s")){

                uwu.showItems();
            }


            if(choice.toLowerCase().contains("d")){

                System.out.println("Please type what item you would like to Delete?");
                uwu.deleteItem();
                System.out.println("New List");
                uwu.showItems();
            }


        }

    }


}




class UserEasyClass{



    private String Customer;



    public void setCustomer(String Customer){
        this.Customer = Customer;

    }


    public String getCustomer(){

        return Customer;
    }

}

class ActualCart {
    Scanner sc = new Scanner(System.in);


    Stack<String> stack = new Stack<String>();


    public String addItems() {


        String Items = sc.nextLine();

        System.out.println(Items + " Has Been added");

        stack.add(Items);


        return Items;

    }

    public void printItemsAdded() {


        System.out.println(addItems() + "Has been added to your list");


    }

    public void showItems(){
        System.out.println(stack);

    }

    public void deleteItem(){
        String Items = sc.nextLine();
        stack.search(Items);

        if(stack.search(Items) == 0 ){
            System.out.println("Item is Not Found");
        }
        else {
            stack.remove(Items);
        }


    }


}
