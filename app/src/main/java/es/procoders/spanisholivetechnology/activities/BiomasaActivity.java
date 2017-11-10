package es.procoders.spanisholivetechnology.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BiomasaViewController;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaActivity extends AppCompatActivity {

    private BiomasaViewController biomasaViewController;

    /**
     * @param savedInstanceState guarda el resultado obtenido en la actividad activity_biomasa
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
        biomasaViewController = new BiomasaViewController(this, fragmentManager);

    }

}
