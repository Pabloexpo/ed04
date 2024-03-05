package org.example;

import java.util.List;
/**
 * Interfaz Agenda destinada a declarar varios métodos que después serán inicializados en la clase Agenda
 * @author Pablo Expósito Martínez
 * @see Agenda
 */
public interface IAgenda {
    void addContact(String name, String phone);

    void removeContact(String name);

    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    List<Persona> getContacts();
}
