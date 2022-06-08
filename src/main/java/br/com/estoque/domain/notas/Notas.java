package br.com.estoque.domain.notas;

import br.com.estoque.domain.notas.dtos.NotasDTO;

public class Notas {

    private Number ID;
    private Number NUM_NOTA;
    private Number ID_FORNEC;
    private Number STA_ENTRADA_SAIDA;


    public Notas(){
    };


    public Notas(Number ID, Number NUM_NOTA, Number ID_FORNEC, Number STA_ENTRADA_SAIDA) {
        this.ID = ID;
        this.NUM_NOTA = NUM_NOTA;
        this.ID_FORNEC = ID_FORNEC;
        this.STA_ENTRADA_SAIDA = STA_ENTRADA_SAIDA;
     }


     public Notas(NotasDTO notasDTO) {
        this.ID = notasDTO.getID();
        this.NUM_NOTA = notasDTO.getNUM_NOTA();
        this.ID_FORNEC = notasDTO.getID_FORNEC();
        this.STA_ENTRADA_SAIDA = notasDTO.getSTA_ENTRADA_SAIDA();
    }

    public Number getNUM_NOTA() {
        return NUM_NOTA;
    }

    public void setNUM_NOTA(Number nUM_NOTA) {
        NUM_NOTA = nUM_NOTA;
    }

    public Number getID_FORNEC() {
        return ID_FORNEC;
    }

    public void setID_FORNEC(Number iD_FORNEC) {
        ID_FORNEC = iD_FORNEC;
    }

    public Number getSTA_ENTRADA_SAIDA() {
        return STA_ENTRADA_SAIDA;
    }

    public void setSTA_ENTRADA_SAIDA(Number sTA_ENTRADA_SAIDA) {
        STA_ENTRADA_SAIDA = sTA_ENTRADA_SAIDA;
    }

   
    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

}
