package com.juan.realmbd.model;

import androidx.annotation.NonNull;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Persona extends RealmObject {

    @PrimaryKey
    @Required
    private long id;
    @Required
    private  String nombre;
    @Required
    private String apellido;
    @Required
    private  String telefono;

}
