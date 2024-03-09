package com.locadora_veiculos.model;

import com.locadora_veiculos.model.interfaces.ClientIdentificator;
import com.locadora_veiculos.utils.DocumentUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    private String id;
    private ClientIdentificator identificator;
    private String name;
    private String cep;
    private String complement;

    public Client(ClientIdentificator identificator, String name, String cep, String complement) {
        this.identificator = identificator;
        this.id = DocumentUtils.convertDocumentToId(identificator.getIdentificator());
        this.name = name;
        this.cep = cep;
        this.complement = complement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientIdentificator getIdentificator() {
        return identificator;
    }

    public void setIdentificator(ClientIdentificator identificator) {
        this.identificator = identificator;
    }
    
}
