package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase Contacto dedicada a generar un contacto con su nombre y número de teléfono
 * además, hace un llamado de los contactos guardados, mostrando así su nombre y número de teléfono
 * @author Pablo Expósito Martínez
 * @see Agenda
 * @since 2024
 * @version 2024
 */
public class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Método get del nombre del contacto
     * @return nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método get del teléfono del contacto
     * @return número del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}