package es.procoders.spanisholivetechnology.LoginRegistro;

import java.io.Serializable;

/**
 *
 */

public class Usuario implements Serializable {

    private String mail;
    private String name;
    private Float number;

    public Usuario(String mail, String name, Float number) {
        this.mail = mail;
        this.name = name;
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (mail != null ? !mail.equals(usuario.mail) : usuario.mail != null) return false;
        if (name != null ? !name.equals(usuario.name) : usuario.name != null) return false;
        return number != null ? number.equals(usuario.number) : usuario.number == null;
    }

    @Override
    public int hashCode() {
        int result = mail != null ? mail.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
