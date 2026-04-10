package vit.devops.macse639.ticketreservation;

import io.prometheus.client.Counter;
import io.prometheus.client.exporter.HTTPServer;
import java.io.IOException;

public class MetricsClass {

    static final Counter requestCount = Counter.build()
            .name("ticket_requests_total")
            .help("Total requests.")
            .register();

    public static void startServer() throws IOException {
        HTTPServer server = new HTTPServer(1234);
        requestCount.inc();
    }
}
