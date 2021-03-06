package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.io.Serializable;

public class RespostaDoSimulado {
    IntegerProperty id;
    IntegerProperty simuladoId;
    IntegerProperty respostaId;
    BooleanProperty selecionada;

    public RespostaDoSimulado() {
    }

    public RespostaDoSimulado(int simuladoId, int respostaId, boolean selecionada) {
        this.simuladoId = new SimpleIntegerProperty(simuladoId);
        this.respostaId = new SimpleIntegerProperty(respostaId);
        this.selecionada = new SimpleBooleanProperty(selecionada);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getSimuladoId() {
        return simuladoId.get();
    }

    public IntegerProperty simuladoIdProperty() {
        return simuladoId;
    }

    public void setSimuladoId(int simuladoId) {
        this.simuladoId.set(simuladoId);
    }

    public int getRespostaId() {
        return respostaId.get();
    }

    public IntegerProperty respostaIdProperty() {
        return respostaId;
    }

    public void setRespostaId(int respostaId) {
        this.respostaId.set(respostaId);
    }

    public boolean isSelecionada() {
        return selecionada.get();
    }

    public BooleanProperty selecionadaProperty() {
        return selecionada;
    }

    public void setSelecionada(boolean selecionada) {
        this.selecionada.set(selecionada);
    }
}
