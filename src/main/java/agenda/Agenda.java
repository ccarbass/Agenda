package agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    public Set<Event> events = new HashSet<>();

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        for (Event event : events) {
            if (event.equals(e)) {
                events.remove(e);
            }
        }
        events.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return list and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {

        ArrayList<Event> today = new ArrayList();
        for (Event e : events) {

            if (e.isInDay(day)) {

                today.add(e);

            }

        }
        return today;
    }
    /**
     * Trouver les événements de l'agenda en fonction de leur titre
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        ArrayList titre = new ArrayList();
        for(Event e : events){
            if(e.getTitle().equals(title)){
                titre.add(e);
            }
        }
        return titre;
    }

    /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
    public boolean isFreeFor(Event e) {
        // TODO : implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }
}
