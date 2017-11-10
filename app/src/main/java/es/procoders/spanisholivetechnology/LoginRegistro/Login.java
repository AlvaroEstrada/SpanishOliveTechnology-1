package es.procoders.spanisholivetechnology.LoginRegistro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.MainActivity;


public class Login extends AppCompatActivity implements View.OnClickListener {

    private AutoCompleteTextView Email;
    private EditText nombre;
    private EditText numero;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email=(AutoCompleteTextView)findViewById(R.id.edtMail);
        nombre=(EditText)findViewById(R.id.edtNombre);
        numero=(EditText)findViewById(R.id.edtTelefono);
        login=(Button)findViewById(R.id.btnLogin);
        login.setOnClickListener(this);

        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
        String nombrePila = preferences.getString("nombrePila", "Sin nombre");
        String correo =preferences.getString("correo", null);
        Float telefono = preferences.getFloat("telefono", 0);

        nombre.setText(nombrePila);
        Email.setText(correo);
        numero.setText(telefono.compareTo(telefono));

    }

    public void GuardarMail(String view){

        String correo = Email.getText().toString();

        SharedPreferences preferencesGuardaCorreo = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencesGuardaCorreo.edit();
        editor.putString("correo", correo);
        editor.apply();

    }

    public void GuardarTelefono(String view){

        Float telefono = Float.valueOf(numero.getText().toString());

        SharedPreferences preferencesGuardaNumero = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencesGuardaNumero.edit();
        editor.putString("telefono", String.valueOf(telefono));
        editor.apply();



    }

    public void GuardarNombre(String view){
        String nombrePila = nombre.getText().toString();

        SharedPreferences preferencesGuardaNombre = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencesGuardaNombre.edit();
        editor.putString("nombrePila", nombrePila);
        editor.apply();


    }


    private boolean esCorreoValido(String correo) {
        if (!Patterns.EMAIL_ADDRESS.matcher(correo).matches()) {
            Email.setError("Correo electrónico inválido");
            return false;
        } else {
            Email.setError(null);
        }

        return true;
    }

    @Override
    public void onClick(View view) {


        switch(view.getId()){

            case R.id.btnLogin:

                Usuario usuario = new Usuario(Email.getText().toString(), nombre.getText().toString(),
                        Float.valueOf(numero.getText().toString()));


                if (EmptyData()) {

                    if(!Email.getText().toString().equals(usuario.getMail()) && !nombre.getText().toString().equals(usuario.getName())
                    && !numero.getText().toString().equals(usuario.getNumber())){

                        Intent intent = new Intent(this, MainActivity.class);
                        validarDatos();

                        GuardarMail("correo");
                        GuardarNombre("nombrePila");
                        GuardarTelefono("telefono");

                        startActivity(intent);

                    }else{

                        Intent intent = new Intent (this, MainActivity.class);
                        validarDatos();
                        startActivity(intent);
                    }

                    break;

        }

            }
    }

    private void validarDatos() {

        String direccion = Email.getEditableText().toString();
        boolean c = esCorreoValido(direccion);

        if (c) {

            Toast.makeText(this, "Accediendo", Toast.LENGTH_LONG).show();
        }

    }


    private boolean EmptyData(){

        return !Email.getText().toString().equals("") && !nombre.getText().toString().equals("")
                && !numero.getText().toString().equals("");
    }

}

