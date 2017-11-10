package es.procoders.spanisholivetechnology.services;

import es.procoders.spanisholivetechnology.beans.AlmazaraBean;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.beans.ComercioAceiteBean;
import es.procoders.spanisholivetechnology.beans.ComercioAceitunaBean;
import es.procoders.spanisholivetechnology.beans.FabricaAceitunaBean;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.PlantacionBean;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class ServiceTools {

//    public BusinessRule [] rules = new BusinessRule[1];


    public static Boolean isReady(Formulario datosForm) {

        Boolean retVal = false;

        if (datosForm instanceof AlmazaraBean) {
            retVal = isReadyAlmazara((AlmazaraBean) datosForm);
        } else if (datosForm instanceof BiomasaBean) {
            retVal = isReadyBiomasa((BiomasaBean) datosForm);
        } else if (datosForm instanceof ComercioAceiteBean) {
            retVal = isReadyComercioAceite((ComercioAceiteBean) datosForm);
        } else if (datosForm instanceof ComercioAceitunaBean) {
            retVal = isReadyComercioAceituna((ComercioAceitunaBean) datosForm);
        } else if (datosForm instanceof FabricaAceitunaBean) {
            retVal = isReadyFabricaAceituna((FabricaAceitunaBean) datosForm);
        } else if (datosForm instanceof PlantacionBean) {
            retVal = isReadyPlantacionBean((PlantacionBean) datosForm);
        }

        return retVal;


    }

    private static Boolean isReadyFabricaAceituna(FabricaAceitunaBean datosForm) {
        return true;
    }

    private static Boolean isReadyPlantacionBean(PlantacionBean datosForm) {
        return true;
    }

    private static Boolean isReadyComercioAceituna(ComercioAceitunaBean datosForm) {
        return true;
    }

    private static Boolean isReadyComercioAceite(ComercioAceiteBean datosForm) {
        return true;
    }

    private static Boolean isReadyBiomasa(BiomasaBean datosForm) {
        if (datosForm.getAnswerQ2() == null) {
            return false;
        } else if (datosForm.getAnswerQ3() == null) {
            return false;
        } else if (datosForm.getAnswerQ5() == null) {
            return false;
        } else if (datosForm.getAnswerQ6() == null) {
            return false;
        } else {
            return true;
        }
    }

    private static Boolean isReadyAlmazara(AlmazaraBean datosForm) {
        return true;
    }

//    public BusinessRule getRule ()
}
