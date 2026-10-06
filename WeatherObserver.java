import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WeatherObserver implements PropertyChangeListener {
    private String heroName;

    public WeatherObserver(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        // TODO:
        // print how this hero reacts to the new weather
        System.out.println(String.format("%s observes the weather changing to %s.",
                heroName, event.getNewValue()));
    }
}
