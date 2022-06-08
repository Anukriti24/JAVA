import java.util.Scanner;

class menu {
    String Name;
    Float price;

    menu(){}

    menu(String Name, Float price){
        this.Name = Name;
        this.price = price;
    }

    void display(){
        System.out.println("The name of the item is"+this.Name+ " \t " + "The price of the item is"+ this.price.toString());
    }
}

class customer{
    String Name;
    String Email;
    String Phone;
    int Totalitems;
    menu[] ordered = new menu[3];

    customer(){}

    customer(String Name, String Email, String Phone, menu[]ordered){
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Totalitems = ordered.length;
        for(int i = 0; i<ordered.length; i++){
            this.ordered[i] = new menu(ordered[i].Name, ordered[i].price);

        }



    }

    void display(){
        System.out.println("CUSTOMER DETAILS");
        System.out.println(this.Name+"\t"+this.Email+"\t"+this.Phone);
        System.out.println("ITEMS ORDERED");
        float total = 0;
        for(int i =0; i<Totalitems; i++){
            System.out.println(this.ordered[i].Name +"\t"+this.ordered[i].price.toString());
            total+=this.ordered[i].price;
        }

        System.out.println("The total price of the item is"+ total);


    }




}

public class restaurantt{
    public static void main(String[] args){
        int ch=0;
        int number=0;
        Scanner obj = new Scanner(System.in);
        menu[] menuItem = new menu[5];
        int menuCounter=0;
        menu[] menuCustomer = new menu[5];
        int customerCounter=0;

        do{
            System.out.println("RESTAURANT DETAILS");
            System.out.println("...................");
            System.out.println("1. menu");
            System.out.println("2. display menu");
            System.out.println("3. customer");
            System.out.println("4.customer details");
            System.out.println("5. EXIT");

            int choice = obj.nextInt();
            switch(choice){
                case 1:
                    

            }


        }



    

    }
}




