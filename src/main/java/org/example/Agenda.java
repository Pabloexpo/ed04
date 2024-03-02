package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase Agenda dedicada a guardar los contactos generados en un array, para añadir el contacto a la agenda.
 * Utiliza la clase Contacto con sus getname y getphone para conseguir el nombre de los contactos para modoficarlos en
 * la agenda con los métodos de añadir, modificar o borrar
 * @author Pablo Expósito Martínez
 * @see Persona
 * @version 2024
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Contacto


    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir un contacto a la Agenda
     * @param name: nombre del contacto que se quiere realizar una acción sobre él
     * @param phone: número de teléfono del contacto sobre el que se va a realizar la acción
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Con este método borras el contacto en la Agenda, si el nombre pasado por parámetro coincide con un nombre ya
     * inscrito en la Agenda este se borrará
     * @param name: nombre del contacto que se quiere eliminar
     */

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método que pretende modificar un contacto de la Agenda
     * @param name: nombre ingresado para seleccionar el contacto de la agenda
     * @param oldPhone: teléfono antiguo para seleccionarlo dentro de la agenda
     * @param newPhone: nuevo número de teléfono a guardar dentro del contacto seleccionado
     */

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}