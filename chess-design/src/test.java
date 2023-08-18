import java.util.Scanner;

public class test {

    public static void main(String []args){
        System.out.println("-------------Designing chess-----------");

//        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
//        System.out.print("Enter a string: ");
//        String str= sc.nextLine();              //reads string
//        System.out.print("You have entered: "+str);

        Board b=new Board();
        b.printBoard();
    }
}
