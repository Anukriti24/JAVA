import java.util.Scanner;

public class cia {
    String Name;
    String Email;
    long rollno;

    cia() {
        Name = "Name";
        Email = "fistname.lastname@christuniversity.in";
        rollno = 0;
    }

    cia(String a) {
        Name = a;
        Email = "NA";
        rollno = 2011000;
    }

    cia(String a, String b) {
        Name = a;
        Email = b;
        rollno = 2011000;
    }

    public void read() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter values for Name, Email and Roll Number");
        Name = obj.nextLine();
        Email = obj.nextLine();
        rollno = obj.nextLong();
    }

    public void display() {
        System.out.println("The details of Student is");
        System.out.println("Name : " + Name.toUpperCase());
        System.out.println("Email : " + Email.toUpperCase());
        System.out.println("Roll Number : " + rollno);
    }

    public void toStirng(String a, String b, long c) {
        System.out.println("The stundet is " + a.toUpperCase() + " ;His email id is " + b.toUpperCase()
                + " and having register number as : " + c);
    }

    public static void main(String[] args) {

        int option, cont;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Option [1,2,3,4]: ");
            option = obj.nextInt();
            switch (option) {
                case 1:
                    cia cobj = new cia();
                    cobj.display();
                    break;

                case 2:
                    cia obj2 = new cia("ABC");
                    obj2.display();
                    break;

                case 3:
                    cia obj3 = new cia("ABC", "ABC@christ.in");
                    obj3.display();
                    break;

                case 4:
                    cia obj4 = new cia();
                    obj4.read();
                    obj4.display();
                    obj4.toStirng(obj4.Name, obj4.Email, obj4.rollno);
                    break;
            }

            System.out.println("Do you want to continue (1) or (any)?");
            cont = obj.nextInt();
        } while (cont == 1);

    }

}