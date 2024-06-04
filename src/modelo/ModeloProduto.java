/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cyro
 */
public class ModeloProduto {
    
    private int idProduto;
    private String codigobarras;
    private String nomeProduto;
    private String categoria;
    private String unidade;
    private int cest;
    private String classiFiscal;
    private int cfop;
    private int pis;
    private int cofins;
    private float aliqFederal;
    private float aliqEstadual;
    private float aliqMunicipal;
    private int cst;
    private int csosn;
    private float precoCompra;
    private float lucroVenda;
    private float lucroesperado;
    private float precoVenda;
    private int qtdProduto;
    private int quantidadeM;
    private String fornecedorProduto;
    private String pesquisa;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the precoCompra
     */
    public float getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the precoVenda
     */
    public float getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the qtdProduto
     */
    public int getQtdProduto() {
        return qtdProduto;
    }

    /**
     * @param qtdProduto the qtdProduto to set
     */
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    /**
     * @return the fornecedorProduto
     */
    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    /**
     * @param fornecedorProduto the fornecedorProduto to set
     */
    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }
    
    public String getPesquisa(){
        
        return pesquisa;
    }
    
    public void setPesquisa(String pesquisa){
        
        this.pesquisa = pesquisa;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the codigobarras
     */
    public String getCodigobarras() {
        return codigobarras;
    }

    /**
     * @param codigobarras the codigobarras to set
     */
    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    /**
     * @return the lucroesperado
     */
    public float getLucroesperado() {
        return lucroesperado;
    }

    /**
     * @param lucroesperado the lucroesperado to set
     */
    public void setLucroesperado(float lucroesperado) {
        this.lucroesperado = lucroesperado;
    }

    /**
     * @return the quantidadeM
     */
    public int getQuantidadeM() {
        return quantidadeM;
    }

    /**
     * @param quantidadeM the quantidadeM to set
     */
    public void setQuantidadeM(int quantidadeM) {
        this.quantidadeM = quantidadeM;
    }
    public String getUnidade(){
        
        return unidade;
        
    }
    public void setUnidade(String unidade){
        
        this.unidade = unidade;
        
    }

    /**
     * @return the lucroVenda
     */
    public float getLucroVenda() {
        return lucroVenda;
    }

    /**
     * @param lucroVenda the lucroVenda to set
     */
    public void setLucroVenda(float lucroVenda) {
        this.lucroVenda = lucroVenda;
    }

    public int getCest() {
        return cest;
    }

    public void setCest(int cest) {
        this.cest = cest;
    }

    public String getClassiFiscal() {
        return classiFiscal;
    }

    public void setClassiFiscal(String classiFiscal) {
        this.classiFiscal = classiFiscal;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cofp) {
        this.cfop = cofp;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public int getCofins() {
        return cofins;
    }

    public void setCofins(int cofins) {
        this.cofins = cofins;
    }

    public float getAliqFederal() {
        return aliqFederal;
    }

    public void setAliqFederal(float aliqFederal) {
        this.aliqFederal = aliqFederal;
    }

    public float getAliqEstadual() {
        return aliqEstadual;
    }

    public void setAliqEstadual(float aliqEstadual) {
        this.aliqEstadual = aliqEstadual;
    }

    public float getAliqMunicipal() {
        return aliqMunicipal;
    }

    public void setAliqMunicipal(float aliqMunicipal) {
        this.aliqMunicipal = aliqMunicipal;
    }

    public int getCst() {
        return cst;
    }

    public void setCst(int cst) {
        this.cst = cst;
    }

    public int getCsosn() {
        return csosn;
    }

    public void setCsosn(int csonsn) {
        this.csosn = csonsn;
    }

   
   
    
    
    
    
}
