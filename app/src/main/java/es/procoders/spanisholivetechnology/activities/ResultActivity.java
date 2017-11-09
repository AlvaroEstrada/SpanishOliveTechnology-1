package es.procoders.spanisholivetechnology.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class ResultActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;

    TextView res1;
    TextView res2;
    TextView res3;
    TextView res4;
    TextView res5;
    TextView res6;
    TextView res7;
    TextView res8;

    /**
     *
     * @param savedInstanceState hace un guardado de la información recabada en la actividad
     *                           activity_result
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        viewsOrder();

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("datos")) {
                BiomasaBean dat = (BiomasaBean) intent.getSerializableExtra("datos");
                showData(dat);
            }
        }

    }

    private void viewsOrder() {
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
         tv5 = (TextView) findViewById(R.id.textView5);
         tv6 = (TextView) findViewById(R.id.textView6);
         tv7 = (TextView) findViewById(R.id.textView7);
         tv8 = (TextView) findViewById(R.id.textView8);

         res1 = (TextView) findViewById(R.id.res1);
         res2 = (TextView) findViewById(R.id.res2);
         res3 = (TextView) findViewById(R.id.res3);
         res4 = (TextView) findViewById(R.id.res4);
         res5 = (TextView) findViewById(R.id.res5);
         res6 = (TextView) findViewById(R.id.res6);
         res7 = (TextView) findViewById(R.id.res7);
         res8 = (TextView) findViewById(R.id.res8);
    }


    public void showData(BiomasaBean bio) {

        /**
         * Este método comprueba que los campos de respuesta están llenos, recoge la información
         * contenida y la vuelca en el documento de respuesta
         */
        if (!TextUtils.isEmpty(bio.getAnswerQ1())) {
            res1.setText(bio.getAnswerQ1());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ2())) {
            res2.setText(bio.getAnswerQ2());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ3())) {
            res3.setText(bio.getAnswerQ3());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ4())) {
            res4.setText(bio.getAnswerQ4());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ5().toString())) {
            res5.setText(bio.getAnswerQ5().toString());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ6())) {
            res6.setText(bio.getAnswerQ6());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ7())) {
            res7.setText(bio.getAnswerQ7());
        }

        if (!TextUtils.isEmpty(bio.getAnswerQ8())) {
            res8.setText(bio.getAnswerQ8());
        }

    }
}
