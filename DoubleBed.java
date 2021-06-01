
public class DoubleBed implements Hotel {

    private static String[] room = {"1", "2", "3", "4", "5"};
    private static int[] status = {0, 0, 0, 0, 0};
    private String number;
    private final String price = "1800";

    @Override
    public void addClient() {
        for (int i = 0; i < status.length; i++) {
            if (status[i] == 0) {
                status[i] = 1;
                number = room[i];
                break;
            }
        }
    }

    @Override
    public void removeClient() {

    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getPrice() {
        return price;
    }

}
