/**
 * Created by hj on 29.06.16.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;

    }

    @Override
    public int hashCode() {
        int result = resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {

        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public String toString() {
        return "Monitor: manufacturer=" + getManufacturer() + ", price=" + getPrice() + ", serialNumber=" + getSerialNumber()
                + ", X=" + resolutionX + ", Y=" + resolutionY;
    }



}
