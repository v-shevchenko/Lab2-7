/**
 * Created by hj on 29.06.16.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;


    Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        return serialNumber.equals(device.serialNumber);

    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {

}

    public String toString1() {
        return "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }




}
