package es.procoders.spanisholivetechnology.controllers;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.questions.Option;

/**
 * Created by joser on 10/11/2017.
 */

public abstract class SingletonController {

    private int position;
    private Formulario bean;
    private ArrayList<Option> optionsList;


    public abstract Formulario getBean();

    public abstract int getPosition();

    public abstract void setPosition(int i);

    public abstract ArrayList<Option> getOptionsList();

    public abstract void setOptionsList(ArrayList<Option> arrayList);
}
