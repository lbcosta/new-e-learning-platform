package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.io.Serializable;

public class PerguntaDoSimulado {
    IntegerProperty id;
    IntegerProperty simuladoId;
    IntegerProperty perguntaId;

    public PerguntaDoSimulado() {
    }

    public PerguntaDoSimulado(int simuladoId, int perguntaId) {
        this.simuladoId = new SimpleIntegerProperty(simuladoId);
        this.perguntaId = new SimpleIntegerProperty(perguntaId);
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

    public int getPerguntaId() {
        return perguntaId.get();
    }

    public IntegerProperty perguntaIdProperty() {
        return perguntaId;
    }

    public void setPerguntaId(int perguntaId) {
        this.perguntaId.set(perguntaId);
    }
}
