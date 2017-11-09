package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;

/**
 * Created by joser on 09/11/2017.
 */

public class PlantacionBean extends Formulario implements Serializable {

    //Propiedades
    private String answerQ1;
    private String answerQ2;
    private String answerQ3;
    private String answerQ4;
    private String answerQ5;
    private Integer answerQ6 = -1;
    private Integer answerQ7 = -1;
    private Boolean answerQ8;
    private Boolean answerQ9;
    private Integer answerQ10 = -1;
    private Integer answerQ11 = -1;
    private Integer answerQ12 = -1;
    private String answerQ13;
    private Boolean answerQ14;
    private String answerQ15;

    //Constructor por defecto
    public PlantacionBean() {
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

    public String getAnswerQ5() {
        return answerQ5;
    }

    public void setAnswerQ5(String answerQ5) {
        this.answerQ5 = answerQ5;
    }

    public Integer getAnswerQ6() {
        return answerQ6;
    }

    public void setAnswerQ6(Integer answerQ6) {
        this.answerQ6 = answerQ6;
    }

    public Integer getAnswerQ7() {
        return answerQ7;
    }

    public void setAnswerQ7(Integer answerQ7) {
        this.answerQ7 = answerQ7;
    }

    public Boolean getAnswerQ8() {
        return answerQ8;
    }

    public void setAnswerQ8(Boolean answerQ8) {
        this.answerQ8 = answerQ8;
    }

    public Boolean getAnswerQ9() {
        return answerQ9;
    }

    public void setAnswerQ9(Boolean answerQ9) {
        this.answerQ9 = answerQ9;
    }

    public Integer getAnswerQ10() {
        return answerQ10;
    }

    public void setAnswerQ10(Integer answerQ10) {
        this.answerQ10 = answerQ10;
    }

    public Integer getAnswerQ11() {
        return answerQ11;
    }

    public void setAnswerQ11(Integer answerQ11) {
        this.answerQ11 = answerQ11;
    }

    public Integer getAnswerQ12() {
        return answerQ12;
    }

    public void setAnswerQ12(Integer answerQ12) {
        this.answerQ12 = answerQ12;
    }

    public String getAnswerQ13() {
        return answerQ13;
    }

    public void setAnswerQ13(String answerQ13) {
        this.answerQ13 = answerQ13;
    }

    public Boolean getAnswerQ14() {
        return answerQ14;
    }

    public void setAnswerQ14(Boolean answerQ14) {
        this.answerQ14 = answerQ14;
    }

    public String getAnswerQ15() {
        return answerQ15;
    }

    public void setAnswerQ15(String answerQ15) {
        this.answerQ15 = answerQ15;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlantacionBean that = (PlantacionBean) o;

        if (answerQ1 != null ? !answerQ1.equals(that.answerQ1) : that.answerQ1 != null)
            return false;
        if (answerQ2 != null ? !answerQ2.equals(that.answerQ2) : that.answerQ2 != null)
            return false;
        if (answerQ3 != null ? !answerQ3.equals(that.answerQ3) : that.answerQ3 != null)
            return false;
        if (answerQ4 != null ? !answerQ4.equals(that.answerQ4) : that.answerQ4 != null)
            return false;
        if (answerQ5 != null ? !answerQ5.equals(that.answerQ5) : that.answerQ5 != null)
            return false;
        if (answerQ6 != null ? !answerQ6.equals(that.answerQ6) : that.answerQ6 != null)
            return false;
        if (answerQ7 != null ? !answerQ7.equals(that.answerQ7) : that.answerQ7 != null)
            return false;
        if (answerQ8 != null ? !answerQ8.equals(that.answerQ8) : that.answerQ8 != null)
            return false;
        if (answerQ9 != null ? !answerQ9.equals(that.answerQ9) : that.answerQ9 != null)
            return false;
        if (answerQ10 != null ? !answerQ10.equals(that.answerQ10) : that.answerQ10 != null)
            return false;
        if (answerQ11 != null ? !answerQ11.equals(that.answerQ11) : that.answerQ11 != null)
            return false;
        if (answerQ12 != null ? !answerQ12.equals(that.answerQ12) : that.answerQ12 != null)
            return false;
        if (answerQ13 != null ? !answerQ13.equals(that.answerQ13) : that.answerQ13 != null)
            return false;
        if (answerQ14 != null ? !answerQ14.equals(that.answerQ14) : that.answerQ14 != null)
            return false;
        return answerQ15 != null ? answerQ15.equals(that.answerQ15) : that.answerQ15 == null;
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
        result = 31 * result + (answerQ9 != null ? answerQ9.hashCode() : 0);
        result = 31 * result + (answerQ10 != null ? answerQ10.hashCode() : 0);
        result = 31 * result + (answerQ11 != null ? answerQ11.hashCode() : 0);
        result = 31 * result + (answerQ12 != null ? answerQ12.hashCode() : 0);
        result = 31 * result + (answerQ13 != null ? answerQ13.hashCode() : 0);
        result = 31 * result + (answerQ14 != null ? answerQ14.hashCode() : 0);
        result = 31 * result + (answerQ15 != null ? answerQ15.hashCode() : 0);
        return result;
    }
}
