package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.controllers.BiomasaSingleton;
import es.procoders.spanisholivetechnology.questions.BiomasaArrayAdapter;
import es.procoders.spanisholivetechnology.questions.Option;

/**
 * A simple {@link Fragment} subclass.
 * @author Procoders
 * @version 1.0
 * @since API 21
 */
public class BiomasaFragmentDetails extends android.support.v4.app.Fragment implements View.OnClickListener {
    /**
     *
     */

    BiomasaSingleton controller;
    Button save, back;
    RadioGroup bioQ1RadioGroup, bioQ2RadioGroup, bioQ3RadioGroup, bioQ4RadioGroup, bioQ7RadioGroup;
    RadioButton bioQ1Option1, bioQ1Option2, bioQ2Option1, bioQ2Option2, bioQ2Option3, bioQ3Option1, bioQ3Option2, bioQ3Option3, bioQ4Option1, bioQ4Option2, bioQ7Option1, bioQ7Option2;
    EditText bioQ5Edt, bioQ6Edt, bioQ8Edt;


    public BiomasaFragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = BiomasaSingleton.getInstance();
        ArrayList<Option> options = new BiomasaArrayAdapter(getContext()).getOptionsList();
        View rootView = inflater.inflate(options.get(controller.getPosition()).getLayout(), container, false);

        initViews(rootView);
        recuperaRespuestas();

        save.setOnClickListener(this);
        back.setOnClickListener(this);

        return rootView;
    }

    private void initViews(View v) {
        bioQ1RadioGroup = v.findViewById(R.id.bioQ1RadioGroup);
        bioQ1Option1 = v.findViewById(R.id.bioQ1Option1);
        bioQ1Option2 = v.findViewById(R.id.bioQ1Option2);
        bioQ2Option1 = v.findViewById(R.id.bioQ2Option1);
        bioQ2RadioGroup = v.findViewById(R.id.bioQ2RadioGroup);
        bioQ2Option2 = v.findViewById(R.id.bioQ2Option2);
        bioQ2Option3 = v.findViewById(R.id.bioQ2Option3);
        bioQ3RadioGroup = v.findViewById(R.id.bioQ3RadioGroup);
        bioQ3Option1 = v.findViewById(R.id.bioQ3Option1);
        bioQ3Option2 = v.findViewById(R.id.bioQ3Option2);
        bioQ3Option3 = v.findViewById(R.id.bioQ3Option3);
        bioQ4RadioGroup = v.findViewById(R.id.bioQ4RadioGroup);
        bioQ4Option1 = v.findViewById(R.id.bioQ4Option1);
        bioQ4Option2 = v.findViewById(R.id.bioQ4Option2);
        bioQ5Edt = v.findViewById(R.id.bioQ5Edt);
        bioQ6Edt = v.findViewById(R.id.bioQ6Edt);
        bioQ7RadioGroup = v.findViewById(R.id.bioQ7RadioGroup);
        bioQ7Option1 = v.findViewById(R.id.bioQ7Option1);
        bioQ7Option2 = v.findViewById(R.id.bioQ7Option2);
        bioQ8Edt = v.findViewById(R.id.bioQ8Edt);
        save = v.findViewById(R.id.btnOptionSave);
        back = v.findViewById(R.id.btnBack);

    }

    private void recuperaRespuestas() {
        BiomasaBean bio = controller.getBean();

        switch (controller.getPosition()) {
            case 0:
                if(!TextUtils.isEmpty(bio.getAnswerQ1())) {
                    checkRadioButtons(bio.getAnswerQ1(), bioQ1RadioGroup);

//                    if (bio.getAnswerQ1().equals(bioQ1Option1.getText().toString())) {
//                        bioQ1Option1.setChecked(true);
//                    } else if (bio.getAnswerQ1().equals(bioQ1Option2.getText().toString())) {
//                        bioQ1Option2.setChecked(true);
//                    }
                }
                break;

            case 1:
                if(!TextUtils.isEmpty(bio.getAnswerQ2())) {
                    checkRadioButtons(bio.getAnswerQ2(), bioQ2RadioGroup);

//                    if (bio.getAnswerQ2().equals(bioQ2Option1.getText().toString())) {
//                        bioQ2Option1.setChecked(true);
//                    } else if (bio.getAnswerQ2().equals(bioQ2Option2.getText().toString())) {
//                        bioQ2Option2.setChecked(true);
//                    } else if (bio.getAnswerQ2().equals(bioQ2Option3.getText().toString())) {
//                        bioQ2Option3.setChecked(true);
//                    }
                }
                break;
            case 2:
                if(!TextUtils.isEmpty(bio.getAnswerQ3())) {
                    checkRadioButtons(bio.getAnswerQ3(), bioQ3RadioGroup);
                }
//                    if (bio.getAnswerQ3().equals(bioQ3Option1.getText().toString())) {
//                        bioQ3Option1.setChecked(true);
//                    } else if (bio.getAnswerQ3().equals(bioQ3Option2.getText().toString())) {
//                        bioQ3Option2.setChecked(true);
//                    } else if (bio.getAnswerQ3().equals(bioQ3Option3.getText().toString())) {
//                        bioQ3Option3.setChecked(true);
//                    }

                break;

            case 3:
                if(!TextUtils.isEmpty(bio.getAnswerQ4())) {
                    if (bio.getAnswerQ4().equals(bioQ4Option1.getText().toString())) {
                        bioQ4Option1.setChecked(true);
                    } else if (bio.getAnswerQ4().equals(bioQ4Option2.getText().toString())) {
                        bioQ4Option2.setChecked(true);
                    }
                }
                break;
            case 4:
                if(bio.getAnswerQ5()>=0) bioQ5Edt.setText(bio.getAnswerQ5().toString());

                break;
            case 5:
                if(!TextUtils.isEmpty(bio.getAnswerQ6())) bioQ6Edt.setText(bio.getAnswerQ6());
                break;
            case 6:
                if(!TextUtils.isEmpty(bio.getAnswerQ7())) {
                    checkRadioButtons(bio.getAnswerQ7(), bioQ7RadioGroup);
//                    int count = bioQ7RadioGroup.getChildCount();
//                    for (int i = 0; i < count ; i++) {
//                        View b = bioQ7RadioGroup.getChildAt(i);
//
//                        if (b instanceof RadioButton){
//                            if (bio.getAnswerQ7().equals(((RadioButton) b).getText().toString())){
//                                ((RadioButton) b).setChecked(true);
//                            }
//                        }
//
//                    }

//                    if (bio.getAnswerQ7().equals(bioQ7Option1.getText().toString())) {
//                        bioQ7Option1.setChecked(true);
//                    } else if (bio.getAnswerQ7().equals(bioQ7Option2.getText().toString())) {
//                        bioQ7Option2.setChecked(true);
//                    }
                }
                break;
            case 7:
                if(!TextUtils.isEmpty(bio.getAnswerQ8())) {
                    bioQ8Edt.setText(bio.getAnswerQ8());
                }
                break;
        }
    }


    @Override
    public void onClick(View v) {
        BiomasaBean bio= controller.getBean();

        switch (v.getId()){
            case R.id.btnOptionSave:
                switch (controller.getPosition()) {
                    case 0:
                        if(bioQ1Option1.isChecked()){
                            bio.setAnswerQ1(bioQ1Option1.getText().toString());
                        } else if(bioQ1Option2.isChecked()){
                            bio.setAnswerQ1(bioQ1Option2.getText().toString());
                        }
                        setArray(bio.getAnswerQ1());
                        break;

                    case 1:
                        if(bioQ2Option1.isChecked()){
                            bio.setAnswerQ2(bioQ2Option1.getText().toString());
                        } else if(bioQ2Option2.isChecked()){
                            bio.setAnswerQ2(bioQ2Option2.getText().toString());
                        } else if(bioQ2Option3.isChecked()){
                            bio.setAnswerQ2(bioQ2Option3.getText().toString());
                        }
                        setArray(bio.getAnswerQ2());
                        break;

                    case 2:
                        if(bioQ3Option1.isChecked()){
                            bio.setAnswerQ3(bioQ3Option1.getText().toString());
                        } else if(bioQ3Option2.isChecked()){
                            bio.setAnswerQ3(bioQ3Option2.getText().toString());
                        } else if(bioQ3Option3.isChecked()){
                            bio.setAnswerQ3(bioQ3Option3.getText().toString());
                        }
                        setArray(bio.getAnswerQ3());
                        break;

                    case 3:
                        if(bioQ4Option1.isChecked()){
                            bio.setAnswerQ4(bioQ4Option1.getText().toString());
                        } else if(bioQ4Option2.isChecked()){
                            bio.setAnswerQ4(bioQ4Option2.getText().toString());
                        }
                        setArray(bio.getAnswerQ4());
                        break;

                    case 4:
                        if(!TextUtils.isEmpty(bioQ5Edt.getText())){
                            bio.setAnswerQ5(Float.parseFloat(bioQ5Edt.getText().toString()));
                        }
                        setArray(bio.getAnswerQ5().toString());
                        break;

                    case 5:
                        if(!TextUtils.isEmpty(bioQ6Edt.getText())){
                            bio.setAnswerQ6(bioQ6Edt.getText().toString());
                        }
                        setArray(bio.getAnswerQ6());
                        break;

                    case 6:
                        if(bioQ7Option1.isChecked()){
                            bio.setAnswerQ7(bioQ7Option1.getText().toString());
                        } else if(bioQ7Option2.isChecked()){
                            bio.setAnswerQ7(bioQ7Option2.getText().toString());
                        }
                        setArray(bio.getAnswerQ7());
                        break;

                    case 7:
                        if(!TextUtils.isEmpty(bioQ8Edt.getText())){
                            bio.setAnswerQ8(bioQ8Edt.getText().toString());
                        }
                        setArray(bio.getAnswerQ8());
                        break;

                }
                controller.setBean(bio);
                Toast.makeText(v.getContext(), "Guardado", Toast.LENGTH_SHORT).show();

            case R.id.btnBack:
                getActivity().onBackPressed();
                break;
        }


    }

    private void checkRadioButtons (String s, RadioGroup r) {
        int count = r.getChildCount();
        for (int i = 0; i < count; i++) {
            View b = r.getChildAt(i);

            if (b instanceof RadioButton) {
                if (s.equals(((RadioButton) b).getText().toString())) {
                    ((RadioButton) b).setChecked(true);
                }
            }

        }
    }

    private void setArray(String str) {
        ArrayList<Option> array = controller.getOptionsList();
        array.get(controller.getPosition()).setDescription(str);
        controller.setOptionsList(array);
    }


}
