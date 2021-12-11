public class Television {
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    public Television(String MANUFACTURER, int SCREEN_SIZE) {
        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getChannel() {
        return channel;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    public void power() {
        powerOn = !powerOn;
    }

    public void increaseVolume() {
        volume += 1;
    }

    public void decreaseVolume() {
        volume -= 1;
    }
}
