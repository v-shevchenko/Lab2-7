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

    public String toString() {
        return "Device: manufacturer=" + manufacturer + ", price=" + price + ", serialNumber=" + serialNumber;
    }




}
