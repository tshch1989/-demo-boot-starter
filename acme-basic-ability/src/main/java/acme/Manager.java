package acme;

import java.io.Closeable;

public interface Manager extends Closeable {
    void start() throws Exception;
}
