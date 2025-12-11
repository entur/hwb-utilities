package hwb.utilities.mqtt3.broker.model;

public interface MqttDevice {

    String getId();

    boolean isNfcReader();

    MqttNfcReader getNfcReader();

    boolean isBarcodeReader();

    MqttBarcodeReader getBarcodeReader();

    boolean isLocation();

    MqttLocationReader getLocationReader();

}
