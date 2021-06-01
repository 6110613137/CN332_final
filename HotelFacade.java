
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class HotelFacade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        State state = new State();
        String number = null;
        String price = null;

        System.out.println("Select your login\n   1.Google 2.Facebook\n   [1/2]");
        System.out.print("> ");
        String num = sc.nextLine();

        state.StateLogin(num);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        System.out.println("------Welcome to the Hotel------");
        System.out.println("Please select\n   1.Single Bed 2.Double Bed\n   [1/2]");
        System.out.print("> ");

        num = sc.nextLine();

        if ("1".equals(num)) {
            SingleBed s = new SingleBed();
            s.addClient();
            number = s.getNumber();
            price = s.getPrice();
        }
        if ("2".equals(num)) {
            DoubleBed d = new DoubleBed();
            d.addClient();
            number = d.getNumber();
            price = d.getPrice();
        }

        System.out.println(day + "/" + month + "/" + year);
        System.out.println("Your room number is " + number);
        System.out.println("Price : " + price);

        System.out.println("Did you have promotion code? [Y/N]");
        String code = null;
        num = sc.nextLine();
        if ("Y".equals(num)) {
            System.out.print("Enter your code > ");
            code = sc.nextLine();
        }

        System.out.println("Which type you want to pay\n   1.Promtpay 2.Credit\n   [1/2]");
        System.out.print("> ");
        num = sc.nextLine();

        state.StatePay(num, code);

    }

}
