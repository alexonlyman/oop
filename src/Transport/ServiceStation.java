package Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);

    }
    public void addAuto(Auto auto) {
        add(auto);

    }
    public void addTruck(Freightcar freightcar) {
        add(freightcar);

    }

    public void service() {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
            boolean result = transport.service();
            if (!result) {
                transport.repair();
            }
        }
    }

}
