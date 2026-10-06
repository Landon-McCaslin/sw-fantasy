import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherSystem {

    private String weather;
    private PropertyChangeSupport support;

    public WeatherSystem() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removeObserver(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setWeather(String newWeather) {
        // Store the old weather
        String oldWeather = weather;

        // Change the weather
        weather = newWeather;

        // Notify observers
        support.firePropertyChange("weather", oldWeather, newWeather);
    }
}