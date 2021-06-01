
public class SingleBed implements Hotel {

    HotelAdapter h = new HotelAdapter();
    private String[] room = h.getRoomInfo();
    private int[] status = h.getRoomAvailable();
    private  String price = h.getPrice();
    private String number;

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
