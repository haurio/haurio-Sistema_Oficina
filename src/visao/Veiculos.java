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
@Table(name = "veiculos", catalog = "sistemaautopecas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Veiculos.findAll", query = "SELECT v FROM Veiculos v")
    , @NamedQuery(name = "Veiculos.findByIdVeiculos", query = "SELECT v FROM Veiculos v WHERE v.idVeiculos = :idVeiculos")
    , @NamedQuery(name = "Veiculos.findByPlaca", query = "SELECT v FROM Veiculos v WHERE v.placa = :placa")
    , @NamedQuery(name = "Veiculos.findByAnoModelo", query = "SELECT v FROM Veiculos v WHERE v.anoModelo = :anoModelo")
    , @NamedQuery(name = "Veiculos.findByAnoFabric", query = "SELECT v FROM Veiculos v WHERE v.anoFabric = :anoFabric")
    , @NamedQuery(name = "Veiculos.findByChassi", query = "SELECT v FROM Veiculos v WHERE v.chassi = :chassi")
    , @NamedQuery(name = "Veiculos.findByRenavam", query = "SELECT v FROM Veiculos v WHERE v.renavam = :renavam")
    , @NamedQuery(name = "Veiculos.findByNumeroMotor", query = "SELECT v FROM Veiculos v WHERE v.numeroMotor = :numeroMotor")
    , @NamedQuery(name = "Veiculos.findByMarca", query = "SELECT v FROM Veiculos v WHERE v.marca = :marca")
    , @NamedQuery(name = "Veiculos.findByModelo", query = "SELECT v FROM Veiculos v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Veiculos.findByCorExterna", query = "SELECT v FROM Veiculos v WHERE v.corExterna = :corExterna")
    , @NamedQuery(name = "Veiculos.findByCorInterna", query = "SELECT v FROM Veiculos v WHERE v.corInterna = :corInterna")
    , @NamedQuery(name = "Veiculos.findByCombustivel", query = "SELECT v FROM Veiculos v WHERE v.combustivel = :combustivel")
    , @NamedQuery(name = "Veiculos.findByMotor", query = "SELECT v FROM Veiculos v WHERE v.motor = :motor")
    , @NamedQuery(name = "Veiculos.findByEspecie", query = "SELECT v FROM Veiculos v WHERE v.especie = :especie")
    , @NamedQuery(name = "Veiculos.findByKm", query = "SELECT v FROM Veiculos v WHERE v.km = :km")
    , @NamedQuery(name = "Veiculos.findByProprietario", query = "SELECT v FROM Veiculos v WHERE v.proprietario = :proprietario")
    , @NamedQuery(name = "Veiculos.findByDataCadastro", query = "SELECT v FROM Veiculos v WHERE v.dataCadastro = :dataCadastro")})
public class Veiculos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_veiculos")
    private Integer idVeiculos;
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "ano_modelo")
    private String anoModelo;
    @Basic(optional = false)
    @Column(name = "ano_fabric")
    private String anoFabric;
    @Basic(optional = false)
    @Column(name = "chassi")
    private String chassi;
    @Basic(optional = false)
    @Column(name = "renavam")
    private String renavam;
    @Basic(optional = false)
    @Column(name = "numero_motor")
    private String numeroMotor;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "cor_externa")
    private String corExterna;
    @Basic(optional = false)
    @Column(name = "cor_interna")
    private String corInterna;
    @Basic(optional = false)
    @Column(name = "combustivel")
    private String combustivel;
    @Basic(optional = false)
    @Column(name = "motor")
    private String motor;
    @Basic(optional = false)
    @Column(name = "especie")
    private String especie;
    @Basic(optional = false)
    @Column(name = "km")
    private String km;
    @Basic(optional = false)
    @Column(name = "proprietario")
    private String proprietario;
    @Basic(optional = false)
    @Column(name = "data_cadastro")
    private String dataCadastro;

    public Veiculos() {
    }

    public Veiculos(Integer idVeiculos) {
        this.idVeiculos = idVeiculos;
    }

    public Veiculos(Integer idVeiculos, String anoModelo, String anoFabric, String chassi, String renavam, String numeroMotor, String marca, String modelo, String corExterna, String corInterna, String combustivel, String motor, String especie, String km, String proprietario, String dataCadastro) {
        this.idVeiculos = idVeiculos;
        this.anoModelo = anoModelo;
        this.anoFabric = anoFabric;
        this.chassi = chassi;
        this.renavam = renavam;
        this.numeroMotor = numeroMotor;
        this.marca = marca;
        this.modelo = modelo;
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.combustivel = combustivel;
        this.motor = motor;
        this.especie = especie;
        this.km = km;
        this.proprietario = proprietario;
        this.dataCadastro = dataCadastro;
    }

    public Integer getIdVeiculos() {
        return idVeiculos;
    }

    public void setIdVeiculos(Integer idVeiculos) {
        Integer oldIdVeiculos = this.idVeiculos;
        this.idVeiculos = idVeiculos;
        changeSupport.firePropertyChange("idVeiculos", oldIdVeiculos, idVeiculos);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String oldPlaca = this.placa;
        this.placa = placa;
        changeSupport.firePropertyChange("placa", oldPlaca, placa);
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        String oldAnoModelo = this.anoModelo;
        this.anoModelo = anoModelo;
        changeSupport.firePropertyChange("anoModelo", oldAnoModelo, anoModelo);
    }

    public String getAnoFabric() {
        return anoFabric;
    }

    public void setAnoFabric(String anoFabric) {
        String oldAnoFabric = this.anoFabric;
        this.anoFabric = anoFabric;
        changeSupport.firePropertyChange("anoFabric", oldAnoFabric, anoFabric);
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        String oldChassi = this.chassi;
        this.chassi = chassi;
        changeSupport.firePropertyChange("chassi", oldChassi, chassi);
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        String oldRenavam = this.renavam;
        this.renavam = renavam;
        changeSupport.firePropertyChange("renavam", oldRenavam, renavam);
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        String oldNumeroMotor = this.numeroMotor;
        this.numeroMotor = numeroMotor;
        changeSupport.firePropertyChange("numeroMotor", oldNumeroMotor, numeroMotor);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getCorExterna() {
        return corExterna;
    }

    public void setCorExterna(String corExterna) {
        String oldCorExterna = this.corExterna;
        this.corExterna = corExterna;
        changeSupport.firePropertyChange("corExterna", oldCorExterna, corExterna);
    }

    public String getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(String corInterna) {
        String oldCorInterna = this.corInterna;
        this.corInterna = corInterna;
        changeSupport.firePropertyChange("corInterna", oldCorInterna, corInterna);
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        String oldCombustivel = this.combustivel;
        this.combustivel = combustivel;
        changeSupport.firePropertyChange("combustivel", oldCombustivel, combustivel);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        String oldMotor = this.motor;
        this.motor = motor;
        changeSupport.firePropertyChange("motor", oldMotor, motor);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        String oldEspecie = this.especie;
        this.especie = especie;
        changeSupport.firePropertyChange("especie", oldEspecie, especie);
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        String oldKm = this.km;
        this.km = km;
        changeSupport.firePropertyChange("km", oldKm, km);
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        String oldProprietario = this.proprietario;
        this.proprietario = proprietario;
        changeSupport.firePropertyChange("proprietario", oldProprietario, proprietario);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        String oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeiculos != null ? idVeiculos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculos)) {
            return false;
        }
        Veiculos other = (Veiculos) object;
        if ((this.idVeiculos == null && other.idVeiculos != null) || (this.idVeiculos != null && !this.idVeiculos.equals(other.idVeiculos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Veiculos[ idVeiculos=" + idVeiculos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
