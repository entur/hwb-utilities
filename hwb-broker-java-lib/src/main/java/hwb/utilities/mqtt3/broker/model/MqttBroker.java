package hwb.utilities.mqtt3.broker.model;

import java.util.function.Consumer;

import hwb.utilities.device.diagnostics.DiagnosticsSchema;

public class MqttBroker {

    public class HwbDeviceBuilder {

        private String deviceId;
        private String manufacturer;
        private String model;
        private String serial;
        private String firmwareVersion;
        private String standardVersion;
        private String ipAddress;
        private String label;
        private DiagnosticsSchema.Status status;

        private String statusText;

        private MqttNfcReader hfcReader;

        public void nfcReader(Consumer<HwbNfcReaderBuilder> consumer) {

        }

        public void barcodeReader(Consumer<HwbBarcodeReaderBuilder> consumer) {

        }

        public void locationReader(Consumer<HwbLocationReaderBuilder> consumer) {

        }

    }

    public class HwbNfcReaderBuilder {


    }

    public class HwbBarcodeReaderBuilder {

    }

    public class HwbLocationReaderBuilder {

    }


    public class HwbDevicesConsumer {

    }


    public void add(Consumer<HwbDeviceBuilder> consumer) {

    }

}
