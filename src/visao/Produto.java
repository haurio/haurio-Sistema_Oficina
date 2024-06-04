/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Haurio-PC
 */
@Entity
@Table(name = "produto", catalog = "sistemavendas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByIdProduto", query = "SELECT p FROM Produto p WHERE p.idProduto = :idProduto")
    , @NamedQuery(name = "Produto.findByCodigobarras", query = "SELECT p FROM Produto p WHERE p.codigobarras = :codigobarras")
    , @NamedQuery(name = "Produto.findByNomeProduto", query = "SELECT p FROM Produto p WHERE p.nomeProduto = :nomeProduto")
    , @NamedQuery(name = "Produto.findByPrecoCompra", query = "SELECT p FROM Produto p WHERE p.precoCompra = :precoCompra")
    , @NamedQuery(name = "Produto.findByLucrovenda", query = "SELECT p FROM Produto p WHERE p.lucrovenda = :lucrovenda")
    , @NamedQuery(name = "Produto.findByLucroEsperado", query = "SELECT p FROM Produto p WHERE p.lucroEsperado = :lucroEsperado")
    , @NamedQuery(name = "Produto.findByPrecoVenda", query = "SELECT p FROM Produto p WHERE p.precoVenda = :precoVenda")
    , @NamedQuery(name = "Produto.findByQuantidade", query = "SELECT p FROM Produto p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Produto.findByQuantidadeMinima", query = "SELECT p FROM Produto p WHERE p.quantidadeMinima = :quantidadeMinima")
    , @NamedQuery(name = "Produto.findByIdFornecedor", query = "SELECT p FROM Produto p WHERE p.idFornecedor = :idFornecedor")
    , @NamedQuery(name = "Produto.findByIdCategoria", query = "SELECT p FROM Produto p WHERE p.idCategoria = :idCategoria")
    , @NamedQuery(name = "Produto.findByUnidade", query = "SELECT p FROM Produto p WHERE p.unidade = :unidade")
    , @NamedQuery(name = "Produto.findByNcm", query = "SELECT p FROM Produto p WHERE p.ncm = :ncm")
    , @NamedQuery(name = "Produto.findByCest", query = "SELECT p FROM Produto p WHERE p.cest = :cest")
    , @NamedQuery(name = "Produto.findByCfop", query = "SELECT p FROM Produto p WHERE p.cfop = :cfop")
    , @NamedQuery(name = "Produto.findByPis", query = "SELECT p FROM Produto p WHERE p.pis = :pis")
    , @NamedQuery(name = "Produto.findByCofins", query = "SELECT p FROM Produto p WHERE p.cofins = :cofins")
    , @NamedQuery(name = "Produto.findByAliqFederal", query = "SELECT p FROM Produto p WHERE p.aliqFederal = :aliqFederal")
    , @NamedQuery(name = "Produto.findByAliqEstadual", query = "SELECT p FROM Produto p WHERE p.aliqEstadual = :aliqEstadual")
    , @NamedQuery(name = "Produto.findByAliqMunicipal", query = "SELECT p FROM Produto p WHERE p.aliqMunicipal = :aliqMunicipal")
    , @NamedQuery(name = "Produto.findByCst", query = "SELECT p FROM Produto p WHERE p.cst = :cst")
    , @NamedQuery(name = "Produto.findByCsosn", query = "SELECT p FROM Produto p WHERE p.csosn = :csosn")})
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Column(name = "codigobarras")
    private String codigobarras;
    @Basic(optional = false)
    @Column(name = "nome_produto")
    private String nomeProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_compra")
    private Float precoCompra;
    @Column(name = "lucrovenda")
    private Float lucrovenda;
    @Column(name = "lucro_esperado")
    private Float lucroEsperado;
    @Basic(optional = false)
    @Column(name = "preco_venda")
    private float precoVenda;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private float quantidade;
    @Basic(optional = false)
    @Column(name = "quantidade_minima")
    private int quantidadeMinima;
    @Basic(optional = false)
    @Column(name = "id_fornecedor")
    private int idFornecedor;
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private int idCategoria;
    @Basic(optional = false)
    @Column(name = "unidade")
    private String unidade;
    @Basic(optional = false)
    @Column(name = "ncm")
    private String ncm;
    @Basic(optional = false)
    @Column(name = "cest")
    private int cest;
    @Basic(optional = false)
    @Column(name = "cfop")
    private int cfop;
    @Basic(optional = false)
    @Column(name = "pis")
    private int pis;
    @Basic(optional = false)
    @Column(name = "cofins")
    private int cofins;
    @Basic(optional = false)
    @Column(name = "aliq_federal")
    private float aliqFederal;
    @Basic(optional = false)
    @Column(name = "aliq_estadual")
    private float aliqEstadual;
    @Basic(optional = false)
    @Column(name = "aliq_municipal")
    private float aliqMunicipal;
    @Basic(optional = false)
    @Column(name = "cst")
    private int cst;
    @Basic(optional = false)
    @Column(name = "csosn")
    private int csosn;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(Integer idProduto, String nomeProduto, float precoVenda, float quantidade, int quantidadeMinima, int idFornecedor, int idCategoria, String unidade, String ncm, int cest, int cfop, int pis, int cofins, float aliqFederal, float aliqEstadual, float aliqMunicipal, int cst, int csosn) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.idFornecedor = idFornecedor;
        this.idCategoria = idCategoria;
        this.unidade = unidade;
        this.ncm = ncm;
        this.cest = cest;
        this.cfop = cfop;
        this.pis = pis;
        this.cofins = cofins;
        this.aliqFederal = aliqFederal;
        this.aliqEstadual = aliqEstadual;
        this.aliqMunicipal = aliqMunicipal;
        this.cst = cst;
        this.csosn = csosn;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        Integer oldIdProduto = this.idProduto;
        this.idProduto = idProduto;
        changeSupport.firePropertyChange("idProduto", oldIdProduto, idProduto);
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(String codigobarras) {
        String oldCodigobarras = this.codigobarras;
        this.codigobarras = codigobarras;
        changeSupport.firePropertyChange("codigobarras", oldCodigobarras, codigobarras);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        String oldNomeProduto = this.nomeProduto;
        this.nomeProduto = nomeProduto;
        changeSupport.firePropertyChange("nomeProduto", oldNomeProduto, nomeProduto);
    }

    public Float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Float precoCompra) {
        Float oldPrecoCompra = this.precoCompra;
        this.precoCompra = precoCompra;
        changeSupport.firePropertyChange("precoCompra", oldPrecoCompra, precoCompra);
    }

    public Float getLucrovenda() {
        return lucrovenda;
    }

    public void setLucrovenda(Float lucrovenda) {
        Float oldLucrovenda = this.lucrovenda;
        this.lucrovenda = lucrovenda;
        changeSupport.firePropertyChange("lucrovenda", oldLucrovenda, lucrovenda);
    }

    public Float getLucroEsperado() {
        return lucroEsperado;
    }

    public void setLucroEsperado(Float lucroEsperado) {
        Float oldLucroEsperado = this.lucroEsperado;
        this.lucroEsperado = lucroEsperado;
        changeSupport.firePropertyChange("lucroEsperado", oldLucroEsperado, lucroEsperado);
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        float oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        changeSupport.firePropertyChange("precoVenda", oldPrecoVenda, precoVenda);
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        float oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        int oldQuantidadeMinima = this.quantidadeMinima;
        this.quantidadeMinima = quantidadeMinima;
        changeSupport.firePropertyChange("quantidadeMinima", oldQuantidadeMinima, quantidadeMinima);
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        int oldIdFornecedor = this.idFornecedor;
        this.idFornecedor = idFornecedor;
        changeSupport.firePropertyChange("idFornecedor", oldIdFornecedor, idFornecedor);
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        int oldIdCategoria = this.idCategoria;
        this.idCategoria = idCategoria;
        changeSupport.firePropertyChange("idCategoria", oldIdCategoria, idCategoria);
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        String oldUnidade = this.unidade;
        this.unidade = unidade;
        changeSupport.firePropertyChange("unidade", oldUnidade, unidade);
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        String oldNcm = this.ncm;
        this.ncm = ncm;
        changeSupport.firePropertyChange("ncm", oldNcm, ncm);
    }

    public int getCest() {
        return cest;
    }

    public void setCest(int cest) {
        int oldCest = this.cest;
        this.cest = cest;
        changeSupport.firePropertyChange("cest", oldCest, cest);
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        int oldCfop = this.cfop;
        this.cfop = cfop;
        changeSupport.firePropertyChange("cfop", oldCfop, cfop);
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        int oldPis = this.pis;
        this.pis = pis;
        changeSupport.firePropertyChange("pis", oldPis, pis);
    }

    public int getCofins() {
        return cofins;
    }

    public void setCofins(int cofins) {
        int oldCofins = this.cofins;
        this.cofins = cofins;
        changeSupport.firePropertyChange("cofins", oldCofins, cofins);
    }

    public float getAliqFederal() {
        return aliqFederal;
    }

    public void setAliqFederal(float aliqFederal) {
        float oldAliqFederal = this.aliqFederal;
        this.aliqFederal = aliqFederal;
        changeSupport.firePropertyChange("aliqFederal", oldAliqFederal, aliqFederal);
    }

    public float getAliqEstadual() {
        return aliqEstadual;
    }

    public void setAliqEstadual(float aliqEstadual) {
        float oldAliqEstadual = this.aliqEstadual;
        this.aliqEstadual = aliqEstadual;
        changeSupport.firePropertyChange("aliqEstadual", oldAliqEstadual, aliqEstadual);
    }

    public float getAliqMunicipal() {
        return aliqMunicipal;
    }

    public void setAliqMunicipal(float aliqMunicipal) {
        float oldAliqMunicipal = this.aliqMunicipal;
        this.aliqMunicipal = aliqMunicipal;
        changeSupport.firePropertyChange("aliqMunicipal", oldAliqMunicipal, aliqMunicipal);
    }

    public int getCst() {
        return cst;
    }

    public void setCst(int cst) {
        int oldCst = this.cst;
        this.cst = cst;
        changeSupport.firePropertyChange("cst", oldCst, cst);
    }

    public int getCsosn() {
        return csosn;
    }

    public void setCsosn(int csosn) {
        int oldCsosn = this.csosn;
        this.csosn = csosn;
        changeSupport.firePropertyChange("csosn", oldCsosn, csosn);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Produto[ idProduto=" + idProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
