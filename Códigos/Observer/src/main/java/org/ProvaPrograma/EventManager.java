package org.ProvaPrograma;

interface EventManager {
    void registerObserver(EventListener o);
    void removeObserver(EventListener o);
    void notifyObservers();
}