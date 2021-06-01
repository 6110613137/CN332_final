
import java.util.Scanner;

public class HotelFacade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        State state = new State();
        String number = null;

        System.out.println("Select your login -> 1.Google 2.Facebiook [1/2]");
        System.out.print("> ");
        String num = sc.nextLine();

        state.StateLogin(num);

        System.out.println("Welcome to thr Hotel!!!");
        System.out.println("Please select 1.Single Bed 2.Double Bed [1/2]");
        System.out.print("> ");
        num = sc.nextLine();

        if ("1".equals(num)) {
            SingleBed s = new SingleBed();
            s.addClient();
            number = s.getNumber();
        }
        if ("2".equals(num)) {
            DoubleBed d = new DoubleBed();
            d.addClient();
            number = d.getNumber();
        }

        System.out.println("Your room number is " + number);
    }

}
