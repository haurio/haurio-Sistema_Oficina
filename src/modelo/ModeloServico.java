/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Haurio-PC
 */
public class ModeloServico {
    
    private String Codigo;
    private String Descricacao;
    private String TipoServico;
    private String TempoServico;
    private float ValorServico;
    private String Pesquisa;
    private int ID;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricacao() {
        return Descricacao;
    }

    public void setDescricacao(String Descricacao) {
        this.Descricacao = Descricacao;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String TipoServico) {
        this.TipoServico = TipoServico;
    }

    public String getTempoServico() {
        return TempoServico;
    }

    public void setTempoServico(String TempoServico) {
        this.TempoServico = TempoServico;
    }

    public float getValorServico() {
        return ValorServico;
    }

    public void setValorServico(float ValorServico) {
        this.ValorServico = ValorServico;
    }

    public String getPesquisa() {
        return Pesquisa;
    }

    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
}
