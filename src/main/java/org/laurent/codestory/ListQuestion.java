/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.laurent.codestory;

/**
 *
 * @author Maelle_Iris
 */
public enum ListQuestion {

    eMail("Quelleesttonadresseemail"),
    participation("Estuheureuxdeparticiper(OUI/NON)"),
    mailing("Estuabonnealamailinglist(OUI/NON)"),
    enonce1("Estupretarecevoiruneenonceauformatmarkdownparhttppost(OUI/NON)"),
    repondTjrsOui("Estcequeturepondstoujoursoui(OUI/NON)"),
    recuEnonce("Astubienreculepremierenonce(OUI/NON)");
     
    private String value;

    private ListQuestion(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
    
};
