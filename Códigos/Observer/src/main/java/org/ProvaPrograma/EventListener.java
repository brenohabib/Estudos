package org.ProvaPrograma;

public interface EventListener {
    void update(float temperature, float humidity, float pressure);
    void detach();
}
