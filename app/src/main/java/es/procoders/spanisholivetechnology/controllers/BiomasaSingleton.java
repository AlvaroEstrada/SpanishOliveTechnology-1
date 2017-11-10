package es.procoders.spanisholivetechnology.controllers;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.questions.Option;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaSingleton extends SingletonController{

    private static BiomasaSingleton instance;
    private int position;
    private BiomasaBean bean;
    private ArrayList<Option> optionsList;


    private BiomasaSingleton() {
    }

    public static BiomasaSingleton  getInstance() {
        if(instance == null){
            instance = new BiomasaSingleton();
        }
        return instance;
    }

//    public static void setInstance(BiomasaSingleton instance) {
//        BiomasaSingleton.instance = instance;
//    }

    public BiomasaBean getBean() {
        if (bean ==null){
            bean = new BiomasaBean();
        }
        return bean;
    }

    public void setBean(BiomasaBean bean) {
        this.bean = bean;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public ArrayList<Option> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(ArrayList<Option> arrayList) {
        if (optionsList ==null) {
            this.optionsList = arrayList;
        }
    }




}
