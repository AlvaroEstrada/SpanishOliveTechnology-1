package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */
public class BiomasaBean extends Formulario implements Serializable {

    //Propiedades
    private String answerQ1;
    private String answerQ2;
    private String answerQ3;
    private String answerQ4;
    private Float answerQ5 = -1F;
    private String answerQ6;
    private String answerQ7;
    private String answerQ8;

    /**
     * Se declaran las variables que representan a las diferentes preguntas del apartado biomasa
     * de la aplicacion. Se declaran sus getters y setters así como los hash code y equals para
     * poder trabajar con ellos
     */

    //Constructor por defecto
    public BiomasaBean() {
    }

    //Getters & Setters
    public String getAnswerQ1() {
        return answerQ1;
    }

    public void setAnswerQ1(String answerQ1) {
        this.answerQ1 = answerQ1;
    }

    public String getAnswerQ2() {
        return answerQ2;
    }

    public void setAnswerQ2(String answerQ2) {
        this.answerQ2 = answerQ2;
    }

    public String getAnswerQ3() {
        return answerQ3;
    }

    public void setAnswerQ3(String answerQ3) {
        this.answerQ3 = answerQ3;
    }

    public String getAnswerQ4() {
        return answerQ4;
    }

    public void setAnswerQ4(String answerQ4) {
        this.answerQ4 = answerQ4;
    }

    public Float getAnswerQ5() {return answerQ5;}

    public void setAnswerQ5(Float answerQ5) {this.answerQ5 = answerQ5;}

    public String getAnswerQ6() {
        return answerQ6;
    }

    public void setAnswerQ6(String answerQ6) {
        this.answerQ6 = answerQ6;
    }

    public String getAnswerQ7() {
        return answerQ7;
    }

    public void setAnswerQ7(String answerQ7) {
        this.answerQ7 = answerQ7;
    }

    public String getAnswerQ8() {
        return answerQ8;
    }

    public void setAnswerQ8(String answerQ8) {
        this.answerQ8 = answerQ8;
    }

    //Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BiomasaBean that = (BiomasaBean) o;

        if (answerQ1 != null ? !answerQ1.equals(that.answerQ1) : that.answerQ1 != null) return false;
        if (answerQ2 != null ? !answerQ2.equals(that.answerQ2) : that.answerQ2 != null) return false;
        if (answerQ3 != null ? !answerQ3.equals(that.answerQ3) : that.answerQ3 != null) return false;
        if (answerQ4 != null ? !answerQ4.equals(that.answerQ4) : that.answerQ4 != null) return false;
        if (answerQ5 != null ? !answerQ5.equals(that.answerQ5) : that.answerQ5 != null) return false;
        if (answerQ6 != null ? !answerQ6.equals(that.answerQ6) : that.answerQ6 != null) return false;
        if (answerQ7 != null ? !answerQ7.equals(that.answerQ7) : that.answerQ7 != null) return false;
        return answerQ8 != null ? answerQ8.equals(that.answerQ8) : that.answerQ8 == null;
    }

    @Override
    public int hashCode() {
        int result = answerQ1 != null ? answerQ1.hashCode() : 0;
        result = 31 * result + (answerQ2 != null ? answerQ2.hashCode() : 0);
        result = 31 * result + (answerQ3 != null ? answerQ3.hashCode() : 0);
        result = 31 * result + (answerQ4 != null ? answerQ4.hashCode() : 0);
        result = 31 * result + (answerQ5 != null ? answerQ5.hashCode() : 0);
        result = 31 * result + (answerQ6 != null ? answerQ6.hashCode() : 0);
        result = 31 * result + (answerQ7 != null ? answerQ7.hashCode() : 0);
        result = 31 * result + (answerQ8 != null ? answerQ8.hashCode() : 0);
        return result;
    }
}

