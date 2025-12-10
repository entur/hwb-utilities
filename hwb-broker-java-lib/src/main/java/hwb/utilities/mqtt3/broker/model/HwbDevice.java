package hwb.utilities.mqtt3.broker.model;

public interface HwbDevice {

    String getId();

    boolean isDiagnostics();

    boolean isNfcReader();

    HwbNfcReader getNfcReader();

    boolean isBarcodeReader();

    HwbBarcodeReader getBarcodeReader();

    boolean isLocation();

    HwbLocationReader getLocationReader();

}
