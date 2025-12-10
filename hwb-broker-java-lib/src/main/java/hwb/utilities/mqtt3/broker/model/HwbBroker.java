package hwb.utilities.mqtt3.broker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import hwb.utilities.message.device.deviceId.diagnostics.DiagnosticsSchema;

public class HwbBroker {

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

        private HwbNfcReader hfcReader;

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
