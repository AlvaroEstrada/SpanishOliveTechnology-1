package es.procoders.spanisholivetechnology.questions;


import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */


public class BiomasaArrayAdapter {

    private ArrayList<Option> optionsList = new ArrayList<>();
    private Context ctx;
    Resources res;

    public BiomasaArrayAdapter(Context ctx) {
        this.ctx = ctx;
        res = ctx.getResources();
    }

    public ArrayList<Option> getOptionsList() {
        return rellenarOptions();
    }
    public void setOptionsList(ArrayList<Option> array){
        this.optionsList = array;
    }

        /**
         * @see "ArrayList" El array se rellena con los diferentes tipos de preguntas
         * que posee el programa.
         */

    public ArrayList<Option> rellenarOptions() {
        optionsList.add(new Option(res.getString(R.string.bioQTittle1), false, R.layout.bio_details_1));
        optionsList.add(new Option(res.getString(R.string.bioQTittle2), true, R.layout.bio_details_2));
        optionsList.add(new Option(res.getString(R.string.bioQTittle3), true, R.layout.bio_details_3));
        optionsList.add(new Option(res.getString(R.string.bioQTittle4), false, R.layout.bio_details_4));
        optionsList.add(new Option(res.getString(R.string.bioQTittle5), true, R.layout.bio_details_5));
        optionsList.add(new Option(res.getString(R.string.bioQTittle6), true, R.layout.bio_details_6));
        optionsList.add(new Option(res.getString(R.string.bioQTittle7), false, R.layout.bio_details_7));
        optionsList.add(new Option(res.getString(R.string.bioQTittle8), false, R.layout.bio_details_8));
        return optionsList;

    }
}
