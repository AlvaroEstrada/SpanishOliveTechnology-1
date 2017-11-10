package es.procoders.spanisholivetechnology.questions;

/**
 * Created by Apps on 07/11/2017.
 */

public class Option {

    private String tituloOpcion;
    private boolean required;
    //TODO: private boolean enabled -> true si está habilitado
    private int layout;
    private String description;

    public Option(){
    }

    public Option(String tituloOpcion, boolean required, int layout) {
        this.tituloOpcion = tituloOpcion;
        this.required = required;
        this.layout = layout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public String getTituloOpcion() {
        return tituloOpcion;
    }

    public void setTituloOpcion(String tituloOpcion) {
        this.tituloOpcion = tituloOpcion;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "Option{" +
                "tituloOpcion='" + tituloOpcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;

        Option option = (Option) o;

        if (required != option.required) return false;
        if (layout != option.layout) return false;
        return tituloOpcion != null ? tituloOpcion.equals(option.tituloOpcion) : option.tituloOpcion == null;
    }

    @Override
    public int hashCode() {
        int result = tituloOpcion != null ? tituloOpcion.hashCode() : 0;
        result = 31 * result + (required ? 1 : 0);
        result = 31 * result + layout;
        return result;
    }
}
