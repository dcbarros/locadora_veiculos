package com.locadora_veiculos.model;

import com.locadora_veiculos.model.interfaces.ClientIdentificator;
import com.locadora_veiculos.utils.DocumentUtils;

public class NaturalPerson implements ClientIdentificator{

    private String identificator;

    public NaturalPerson(String identificator) {
        setIdentificator(identificator);
    }

    @Override
    public String getIdentificator() {
        return this.identificator;
    }

    @Override
    public void setIdentificator(String inputDocument) {
        if(DocumentUtils.isValidDocument(inputDocument)){
            this.identificator = inputDocument;
        }else throw new IllegalArgumentException("O CPF é inválido");
    }
    
}
