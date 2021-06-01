
public class State {

    public void StateLogin(String num) {

        switch (num) {
            case "1":

                GoogleAPI g = new GoogleAPI();
                break;

            case "2":

                FacebookAPI f = new FacebookAPI();
                break;

        }

    }

    public void StatePay(String num, String code) {
        switch (num) {
            case "1":

                Promtpay p = new Promtpay();
                p.pay(code);
                break;

            case "2":

                Credit c = new Credit();
                c.pay(code);
                break;

        }
    }
}
