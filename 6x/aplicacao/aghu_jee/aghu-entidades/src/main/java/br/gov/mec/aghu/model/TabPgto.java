package br.gov.mec.aghu.model;

// Generated 05/05/2010 10:54:57 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * TabPgto generated by hbm2java
 */
@Entity
@Table(name = "TAB_PGTO", schema = "CONV")
public class TabPgto extends BaseEntityId<TabPgtoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3535029613520342182L;
	private TabPgtoId id;
	private String dscr;
	private BigDecimal qtdeCsh;
	private String aprs;
	private String unid;
	private String conc;
	private Byte flmeCod;
	private BigDecimal qtdeM2;
	private BigDecimal qtdeCshProf;
	private BigDecimal valrSugt;
	private BigDecimal qtdeChMat;
	private Byte prteCod;
	private String geraHonr;
	private String indSit;
	private Integer codCmerMat;
	private Short labrCod;
	private BigDecimal qtdeAprs;
	private Byte nroAux;
	private String codBrasindice;
	private BigDecimal prteFracao;
	private Byte prteCodHonr;
	private Short tpInsumo;
	private Long codUnimed;
	private Set<ValrTabPgtoXComp> valoresTabPgtoXComp = new HashSet<ValrTabPgtoXComp>(0);
	private Set<ProcHcpaXConv> procHcpaXConvs = new HashSet<ProcHcpaXConv>(0);
	private Set<ProcHcpaXCnv> procHcpaXCnvs = new HashSet<ProcHcpaXCnv>(0);

	public TabPgto() {
	}

	public TabPgto(TabPgtoId id, String dscr, BigDecimal qtdeCsh) {
		this.id = id;
		this.dscr = dscr;
		this.qtdeCsh = qtdeCsh;
	}

	public TabPgto(TabPgtoId id, String dscr, BigDecimal qtdeCsh, String aprs,
			String unid, String conc, Byte flmeCod, BigDecimal qtdeM2,
			BigDecimal qtdeCshProf, BigDecimal valrSugt, BigDecimal qtdeChMat,
			Byte prteCod, String geraHonr, String indSit, Integer codCmerMat,
			Short labrCod, BigDecimal qtdeAprs, Byte nroAux,
			String codBrasindice, BigDecimal prteFracao, Byte prteCodHonr,
			Short tpInsumo, Long codUnimed, Set<ValrTabPgtoXComp> valoresTabPgtoXComp) {
		this.id = id;
		this.dscr = dscr;
		this.qtdeCsh = qtdeCsh;
		this.aprs = aprs;
		this.unid = unid;
		this.conc = conc;
		this.flmeCod = flmeCod;
		this.qtdeM2 = qtdeM2;
		this.qtdeCshProf = qtdeCshProf;
		this.valrSugt = valrSugt;
		this.qtdeChMat = qtdeChMat;
		this.prteCod = prteCod;
		this.geraHonr = geraHonr;
		this.indSit = indSit;
		this.codCmerMat = codCmerMat;
		this.labrCod = labrCod;
		this.qtdeAprs = qtdeAprs;
		this.nroAux = nroAux;
		this.codBrasindice = codBrasindice;
		this.prteFracao = prteFracao;
		this.prteCodHonr = prteCodHonr;
		this.tpInsumo = tpInsumo;
		this.codUnimed = codUnimed;
		this.valoresTabPgtoXComp = valoresTabPgtoXComp;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "tptabCod", column = @Column(name = "TPTAB_COD", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "cod", column = @Column(name = "COD", nullable = false, precision = 10, scale = 0)) })
	public TabPgtoId getId() {
		return this.id;
	}

	public void setId(TabPgtoId id) {
		this.id = id;
	}

	@Column(name = "DSCR", nullable = false, length = 100)
	@Length(max = 100)
	public String getDscr() {
		return this.dscr;
	}

	public void setDscr(String dscr) {
		this.dscr = dscr;
	}

	@Column(name = "QTDE_CSH", nullable = false, precision = 14, scale = 5)
	public BigDecimal getQtdeCsh() {
		return this.qtdeCsh;
	}

	public void setQtdeCsh(BigDecimal qtdeCsh) {
		this.qtdeCsh = qtdeCsh;
	}

	@Column(name = "APRS", length = 5)
	@Length(max = 5)
	public String getAprs() {
		return this.aprs;
	}

	public void setAprs(String aprs) {
		this.aprs = aprs;
	}

	@Column(name = "UNID", length = 5)
	@Length(max = 5)
	public String getUnid() {
		return this.unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	@Column(name = "CONC", length = 5)
	@Length(max = 5)
	public String getConc() {
		return this.conc;
	}

	public void setConc(String conc) {
		this.conc = conc;
	}

	@Column(name = "FLME_COD", precision = 2, scale = 0)
	public Byte getFlmeCod() {
		return this.flmeCod;
	}

	public void setFlmeCod(Byte flmeCod) {
		this.flmeCod = flmeCod;
	}

	@Column(name = "QTDE_M2", precision = 10, scale = 4)
	public BigDecimal getQtdeM2() {
		return this.qtdeM2;
	}

	public void setQtdeM2(BigDecimal qtdeM2) {
		this.qtdeM2 = qtdeM2;
	}

	@Column(name = "QTDE_CSH_PROF", precision = 10)
	public BigDecimal getQtdeCshProf() {
		return this.qtdeCshProf;
	}

	public void setQtdeCshProf(BigDecimal qtdeCshProf) {
		this.qtdeCshProf = qtdeCshProf;
	}

	@Column(name = "VALR_SUGT", precision = 10)
	public BigDecimal getValrSugt() {
		return this.valrSugt;
	}

	public void setValrSugt(BigDecimal valrSugt) {
		this.valrSugt = valrSugt;
	}

	@Column(name = "QTDE_CH_MAT", precision = 10)
	public BigDecimal getQtdeChMat() {
		return this.qtdeChMat;
	}

	public void setQtdeChMat(BigDecimal qtdeChMat) {
		this.qtdeChMat = qtdeChMat;
	}

	@Column(name = "PRTE_COD", precision = 2, scale = 0)
	public Byte getPrteCod() {
		return this.prteCod;
	}

	public void setPrteCod(Byte prteCod) {
		this.prteCod = prteCod;
	}

	@Column(name = "GERA_HONR", length = 1)
	@Length(max = 1)
	public String getGeraHonr() {
		return this.geraHonr;
	}

	public void setGeraHonr(String geraHonr) {
		this.geraHonr = geraHonr;
	}

	@Column(name = "IND_SIT", length = 1)
	@Length(max = 1)
	public String getIndSit() {
		return this.indSit;
	}

	public void setIndSit(String indSit) {
		this.indSit = indSit;
	}

	@Column(name = "COD_CMER_MAT", precision = 6, scale = 0)
	public Integer getCodCmerMat() {
		return this.codCmerMat;
	}

	public void setCodCmerMat(Integer codCmerMat) {
		this.codCmerMat = codCmerMat;
	}

	@Column(name = "LABR_COD", precision = 3, scale = 0)
	public Short getLabrCod() {
		return this.labrCod;
	}

	public void setLabrCod(Short labrCod) {
		this.labrCod = labrCod;
	}

	@Column(name = "QTDE_APRS", precision = 7)
	public BigDecimal getQtdeAprs() {
		return this.qtdeAprs;
	}

	public void setQtdeAprs(BigDecimal qtdeAprs) {
		this.qtdeAprs = qtdeAprs;
	}

	@Column(name = "NRO_AUX", precision = 2, scale = 0)
	public Byte getNroAux() {
		return this.nroAux;
	}

	public void setNroAux(Byte nroAux) {
		this.nroAux = nroAux;
	}

	@Column(name = "COD_BRASINDICE", length = 15)
	@Length(max = 15)
	public String getCodBrasindice() {
		return this.codBrasindice;
	}

	public void setCodBrasindice(String codBrasindice) {
		this.codBrasindice = codBrasindice;
	}

	@Column(name = "PRTE_FRACAO", precision = 5)
	public BigDecimal getPrteFracao() {
		return this.prteFracao;
	}

	public void setPrteFracao(BigDecimal prteFracao) {
		this.prteFracao = prteFracao;
	}

	@Column(name = "PRTE_COD_HONR", precision = 2, scale = 0)
	public Byte getPrteCodHonr() {
		return this.prteCodHonr;
	}

	public void setPrteCodHonr(Byte prteCodHonr) {
		this.prteCodHonr = prteCodHonr;
	}

	@Column(name = "TP_INSUMO", precision = 3, scale = 0)
	public Short getTpInsumo() {
		return this.tpInsumo;
	}

	public void setTpInsumo(Short tpInsumo) {
		this.tpInsumo = tpInsumo;
	}

	@Column(name = "COD_UNIMED", precision = 10, scale = 0)
	public Long getCodUnimed() {
		return this.codUnimed;
	}

	public void setCodUnimed(Long codUnimed) {
		this.codUnimed = codUnimed;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tabPgto")
	public Set<ValrTabPgtoXComp> getValoresTabPgtoXComp() {
		return valoresTabPgtoXComp;
	}

	public void setValoresTabPgtoXComp(Set<ValrTabPgtoXComp> valoresTabPgtoXComp) {
		this.valoresTabPgtoXComp = valoresTabPgtoXComp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tabPgto")
	public Set<ProcHcpaXConv> getProcHcpaXConvs() {
		return procHcpaXConvs;
	}

	public void setProcHcpaXConvs(Set<ProcHcpaXConv> procHcpaXConvs) {
		this.procHcpaXConvs = procHcpaXConvs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tabPgto")
	public Set<ProcHcpaXCnv> getProcHcpaXCnvs() {
		return procHcpaXCnvs;
	}

	public void setProcHcpaXCnvs(Set<ProcHcpaXCnv> procHcpaXCnvs) {
		this.procHcpaXCnvs = procHcpaXCnvs;
	}

	
	
	public enum Fields {

		ID("id"),
		COD("id.cod"),
		TPTAB_COD("id.tptabCod"),
		DSCR("dscr"),
		QTDE_CSH("qtdeCsh"),
		APRS("aprs"),
		UNID("unid"),
		CONC("conc"),
		FLME_COD("flmeCod"),
		QTDE_M2("qtdeM2"),
		QTDE_CSH_PROF("qtdeCshProf"),
		VALR_SUGT("valrSugt"),
		QTDE_CH_MAT("qtdeChMat"),
		PRTE_COD("prteCod"),
		GERA_HONR("geraHonr"),
		IND_SIT("indSit"),
		COD_CMER_MAT("codCmerMat"),
		LABR_COD("labrCod"),
		QTDE_APRS("qtdeAprs"),
		NRO_AUX("nroAux"),
		COD_BRASINDICE("codBrasindice"),
		PRTE_FRACAO("prteFracao"),
		PRTE_COD_HONR("prteCodHonr"),
		TP_INSUMO("tpInsumo"),
		COD_UNIMED("codUnimed"),
		VALORES_TAB_PGTO_X_COMP("valoresTabPgtoXComp"),
		PROC_HCPA_X_CONVS("procHcpaXConvs"),
		PROC_HCPA_X_CNVS("procHcpaXCnvs");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TabPgto)) {
			return false;
		}
		TabPgto other = (TabPgto) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
