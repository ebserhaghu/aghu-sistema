package br.gov.mec.aghu.model;

// Generated 15/04/2010 14:52:47 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioTipoPlano;
import br.gov.mec.aghu.core.persistence.BaseEntity;

/**
 * CntaConv generated by hbm2java
 */
@Entity
@Table(name = "CNTA_CONV", schema = "CONV")

public class CntaConv implements BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3422036734992273393L;
	private Integer nro;
	private FatConvenioSaudePlano fatConvSaudePlanos;
	private AghAtendimentos aghAtendimentos;
	private Integer intdCodPrnt;
	private Date intdDataInt;
	private Short convCod;
	private Date data;
	private Character indEcrt;
	private BigDecimal qtdeCsh;
	private Character indPdca;
	private Date dataEmis;
	private Character indReap;
	private Date dataComp;
	private Integer codCid;
	private Byte codTipoAlta;
	private Long nroGuia;
	private BigDecimal nroMatr;
	private Long cpfResp;
	private Date dataAprs;
	private String codCid10;
	private Date dataGfin;
	private Long codSsm;
	private Date dataAprsSus;
	private Long nroPrtcConv;
	private Date dataRctoPrtc;
	private String usuario;
	private Long nroAutzInt;
	private DominioTipoPlano tipoAtd;
	private String nomeResp;
	private Integer nroNf;
	private Date dthrImpressao;
	private Short siaMspSeq;
	private Short siaSeq;
	private Integer mexSeq;
	private Integer pjqSeq;
	private Short tblTptabCod;
	private Integer tblCod;
	private String senhaAutorizacao;
	private PacIntdConv pacIntdConv;
	private Conv conv;
	private Set<AinResponsaveisPaciente> responsaveisPaciente = new HashSet<AinResponsaveisPaciente>(
			0);

	public CntaConv() {
	}

	public CntaConv(Integer nro, Integer intdCodPrnt, Date intdDataInt,
			Short convCod, Date data, Character indEcrt, BigDecimal qtdeCsh) {
		this.nro = nro;
		this.intdCodPrnt = intdCodPrnt;
		this.intdDataInt = intdDataInt;
		this.convCod = convCod;
		this.data = data;
		this.indEcrt = indEcrt;
		this.qtdeCsh = qtdeCsh;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public CntaConv(Integer nro, FatConvenioSaudePlano fatConvSaudePlanos,
			AghAtendimentos aghAtendimentos, Integer intdCodPrnt,
			Date intdDataInt, Short convCod, Date data, Character indEcrt,
			BigDecimal qtdeCsh, Character indPdca, Date dataEmis,
			Character indReap, Date dataComp, Integer codCid, Byte codTipoAlta,
			Long nroGuia, BigDecimal nroMatr, Long cpfResp, Date dataAprs,
			String codCid10, Date dataGfin, Long codSsm, Date dataAprsSus,
			Long nroPrtcConv, Date dataRctoPrtc, String usuario,
			Long nroAutzInt, DominioTipoPlano tipoAtd, String nomeResp, Integer nroNf,
			Date dthrImpressao, Short siaMspSeq, Short siaSeq, Integer mexSeq,
			Integer pjqSeq, Short tblTptabCod, Integer tblCod,
			String senhaAutorizacao, PacIntdConv pacIntdConv,
			Set<AinResponsaveisPaciente> responsaveisPaciente) {
		this.nro = nro;
		this.fatConvSaudePlanos = fatConvSaudePlanos;
		this.aghAtendimentos = aghAtendimentos;
		this.intdCodPrnt = intdCodPrnt;
		this.intdDataInt = intdDataInt;
		this.convCod = convCod;
		this.data = data;
		this.indEcrt = indEcrt;
		this.qtdeCsh = qtdeCsh;
		this.indPdca = indPdca;
		this.dataEmis = dataEmis;
		this.indReap = indReap;
		this.dataComp = dataComp;
		this.codCid = codCid;
		this.codTipoAlta = codTipoAlta;
		this.nroGuia = nroGuia;
		this.nroMatr = nroMatr;
		this.cpfResp = cpfResp;
		this.dataAprs = dataAprs;
		this.codCid10 = codCid10;
		this.dataGfin = dataGfin;
		this.codSsm = codSsm;
		this.dataAprsSus = dataAprsSus;
		this.nroPrtcConv = nroPrtcConv;
		this.dataRctoPrtc = dataRctoPrtc;
		this.usuario = usuario;
		this.nroAutzInt = nroAutzInt;
		this.tipoAtd = tipoAtd;
		this.nomeResp = nomeResp;
		this.nroNf = nroNf;
		this.dthrImpressao = dthrImpressao;
		this.siaMspSeq = siaMspSeq;
		this.siaSeq = siaSeq;
		this.mexSeq = mexSeq;
		this.pjqSeq = pjqSeq;
		this.tblTptabCod = tblTptabCod;
		this.tblCod = tblCod;
		this.senhaAutorizacao = senhaAutorizacao;
		this.pacIntdConv = pacIntdConv;
		this.responsaveisPaciente = responsaveisPaciente;
	}

	@Id
	@Column(name = "NRO", unique = true, nullable = false, precision = 7, scale = 0)
	public Integer getNro() {
		return this.nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO"),
			@JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ") })
	public FatConvenioSaudePlano getFatConvSaudePlanos() {
		return this.fatConvSaudePlanos;
	}

	public void setFatConvSaudePlanos(FatConvenioSaudePlano fatConvSaudePlanos) {
		this.fatConvSaudePlanos = fatConvSaudePlanos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAghAtendimentos() {
		return this.aghAtendimentos;
	}

	public void setAghAtendimentos(AghAtendimentos aghAtendimentos) {
		this.aghAtendimentos = aghAtendimentos;
	}

	@Column(name = "INTD_COD_PRNT", nullable = false, precision = 9, scale = 0)
	public Integer getIntdCodPrnt() {
		return this.intdCodPrnt;
	}

	public void setIntdCodPrnt(Integer intdCodPrnt) {
		this.intdCodPrnt = intdCodPrnt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INTD_DATA_INT", nullable = false, length = 7)
	public Date getIntdDataInt() {
		return this.intdDataInt;
	}

	public void setIntdDataInt(Date intdDataInt) {
		this.intdDataInt = intdDataInt;
	}

	@Column(name = "CONV_COD", nullable = false, precision = 3, scale = 0)
	public Short getConvCod() {
		return this.convCod;
	}

	public void setConvCod(Short convCod) {
		this.convCod = convCod;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CONV_COD", insertable = false, updatable = false)
	public Conv getConv() {
		return this.conv;
	}

	public void setConv(Conv conv) {
		this.conv = conv;
	}	

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA", nullable = false, length = 7)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "IND_ECRT", nullable = false, length = 1)
	public Character getIndEcrt() {
		return this.indEcrt;
	}

	public void setIndEcrt(Character indEcrt) {
		this.indEcrt = indEcrt;
	}

	@Column(name = "QTDE_CSH", nullable = false, precision = 10)
	public BigDecimal getQtdeCsh() {
		return this.qtdeCsh;
	}

	public void setQtdeCsh(BigDecimal qtdeCsh) {
		this.qtdeCsh = qtdeCsh;
	}

	@Column(name = "IND_PDCA", length = 1)
	public Character getIndPdca() {
		return this.indPdca;
	}

	public void setIndPdca(Character indPdca) {
		this.indPdca = indPdca;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_EMIS", length = 7)
	public Date getDataEmis() {
		return this.dataEmis;
	}

	public void setDataEmis(Date dataEmis) {
		this.dataEmis = dataEmis;
	}

	@Column(name = "IND_REAP", length = 1)
	public Character getIndReap() {
		return this.indReap;
	}

	public void setIndReap(Character indReap) {
		this.indReap = indReap;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_COMP", length = 7)
	public Date getDataComp() {
		return this.dataComp;
	}

	public void setDataComp(Date dataComp) {
		this.dataComp = dataComp;
	}

	@Column(name = "COD_CID", precision = 6, scale = 0)
	public Integer getCodCid() {
		return this.codCid;
	}

	public void setCodCid(Integer codCid) {
		this.codCid = codCid;
	}

	@Column(name = "COD_TIPO_ALTA", precision = 2, scale = 0)
	public Byte getCodTipoAlta() {
		return this.codTipoAlta;
	}

	public void setCodTipoAlta(Byte codTipoAlta) {
		this.codTipoAlta = codTipoAlta;
	}

	@Column(name = "NRO_GUIA", precision = 13, scale = 0)
	public Long getNroGuia() {
		return this.nroGuia;
	}

	public void setNroGuia(Long nroGuia) {
		this.nroGuia = nroGuia;
	}

	@Column(name = "NRO_MATR", precision = 20, scale = 0)
	public BigDecimal getNroMatr() {
		return this.nroMatr;
	}

	public void setNroMatr(BigDecimal nroMatr) {
		this.nroMatr = nroMatr;
	}

	@Column(name = "CPF_RESP", precision = 14, scale = 0)
	public Long getCpfResp() {
		return this.cpfResp;
	}

	public void setCpfResp(Long cpfResp) {
		this.cpfResp = cpfResp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_APRS", length = 7)
	public Date getDataAprs() {
		return this.dataAprs;
	}

	public void setDataAprs(Date dataAprs) {
		this.dataAprs = dataAprs;
	}

	@Column(name = "COD_CID10", length = 4)
	@Length(max = 4)
	public String getCodCid10() {
		return this.codCid10;
	}

	public void setCodCid10(String codCid10) {
		this.codCid10 = codCid10;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_GFIN", length = 7)
	public Date getDataGfin() {
		return this.dataGfin;
	}

	public void setDataGfin(Date dataGfin) {
		this.dataGfin = dataGfin;
	}

	@Column(name = "COD_SSM", precision = 10, scale = 0)
	public Long getCodSsm() {
		return this.codSsm;
	}

	public void setCodSsm(Long codSsm) {
		this.codSsm = codSsm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_APRS_SUS", length = 7)
	public Date getDataAprsSus() {
		return this.dataAprsSus;
	}

	public void setDataAprsSus(Date dataAprsSus) {
		this.dataAprsSus = dataAprsSus;
	}

	@Column(name = "NRO_PRTC_CONV", precision = 12, scale = 0)
	public Long getNroPrtcConv() {
		return this.nroPrtcConv;
	}

	public void setNroPrtcConv(Long nroPrtcConv) {
		this.nroPrtcConv = nroPrtcConv;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_RCTO_PRTC", length = 7)
	public Date getDataRctoPrtc() {
		return this.dataRctoPrtc;
	}

	public void setDataRctoPrtc(Date dataRctoPrtc) {
		this.dataRctoPrtc = dataRctoPrtc;
	}

	@Column(name = "USUARIO", length = 15)
	@Length(max = 15)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "NRO_AUTZ_INT", precision = 10, scale = 0)
	public Long getNroAutzInt() {
		return this.nroAutzInt;
	}

	public void setNroAutzInt(Long nroAutzInt) {
		this.nroAutzInt = nroAutzInt;
	}

	@Column(name = "TIPO_ATD", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoPlano getTipoAtd() {
		return this.tipoAtd;
	}

	public void setTipoAtd(DominioTipoPlano tipoAtd) {
		this.tipoAtd = tipoAtd;
	}

	@Column(name = "NOME_RESP", length = 80)
	@Length(max = 80)
	public String getNomeResp() {
		return this.nomeResp;
	}

	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}

	@Column(name = "NRO_NF", precision = 8, scale = 0)
	public Integer getNroNf() {
		return this.nroNf;
	}

	public void setNroNf(Integer nroNf) {
		this.nroNf = nroNf;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_IMPRESSAO", length = 7)
	public Date getDthrImpressao() {
		return this.dthrImpressao;
	}

	public void setDthrImpressao(Date dthrImpressao) {
		this.dthrImpressao = dthrImpressao;
	}

	@Column(name = "SIA_MSP_SEQ", precision = 3, scale = 0)
	public Short getSiaMspSeq() {
		return this.siaMspSeq;
	}

	public void setSiaMspSeq(Short siaMspSeq) {
		this.siaMspSeq = siaMspSeq;
	}

	@Column(name = "SIA_SEQ", precision = 3, scale = 0)
	public Short getSiaSeq() {
		return this.siaSeq;
	}

	public void setSiaSeq(Short siaSeq) {
		this.siaSeq = siaSeq;
	}

	@Column(name = "MEX_SEQ", precision = 7, scale = 0)
	public Integer getMexSeq() {
		return this.mexSeq;
	}

	public void setMexSeq(Integer mexSeq) {
		this.mexSeq = mexSeq;
	}

	@Column(name = "PJQ_SEQ", precision = 7, scale = 0)
	public Integer getPjqSeq() {
		return this.pjqSeq;
	}

	public void setPjqSeq(Integer pjqSeq) {
		this.pjqSeq = pjqSeq;
	}

	@Column(name = "TBL_TPTAB_COD", precision = 3, scale = 0)
	public Short getTblTptabCod() {
		return this.tblTptabCod;
	}

	public void setTblTptabCod(Short tblTptabCod) {
		this.tblTptabCod = tblTptabCod;
	}

	@Column(name = "TBL_COD", precision = 8, scale = 0)
	public Integer getTblCod() {
		return this.tblCod;
	}

	public void setTblCod(Integer tblCod) {
		this.tblCod = tblCod;
	}

	@Column(name = "SENHA_AUTORIZACAO", length = 20)
	@Length(max = 20)
	public String getSenhaAutorizacao() {
		return this.senhaAutorizacao;
	}

	public void setSenhaAutorizacao(String senhaAutorizacao) {
		this.senhaAutorizacao = senhaAutorizacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PACC_SEQ")
	public PacIntdConv getPacIntdConv() {
		return this.pacIntdConv;
	}

	public void setPacIntdConv(PacIntdConv pacIntdConv) {
		this.pacIntdConv = pacIntdConv;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cntaConv")
	public Set<AinResponsaveisPaciente> getResponsaveisPaciente() {
		return this.responsaveisPaciente;
	}

	public void setResponsaveisPaciente(
			Set<AinResponsaveisPaciente> responsaveisPaciente) {
		this.responsaveisPaciente = responsaveisPaciente;
	}

	public enum Fields {
		NRO("nro"), INTD_COD_PRNT("intdCodPrnt"), INTD_DATA_INT("intdDataInt"), CONV_COD(
				"convCod"), CONV("conv"), ATENDIMENTO_SEQ("aghAtendimentos.seq"),
				ATENDIMENTO("aghAtendimentos"),IND_ECRT("indEcrt"), TIPO_ATD("tipoAtd"), PACC_SEQ("pacIntdConv"),
				SITUACAO_SAIDA_PACIENTE("siaSeq"), MOTIVO_SAIDA_PACIENTE("siaMspSeq"), DATA_COMP("dataComp"), QTDE_CSH("qtdeCsh"),
				FAT_CONV_SAUDE_PLANOS("fatConvSaudePlanos"), CSP_CNV_CODIGO("fatConvSaudePlanos.id.cnvCodigo"), CSP_SEQ("fatConvSaudePlanos.id.seq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nro == null) ? 0 : nro.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		CntaConv other = (CntaConv) obj;
		if (nro == null) {
			if (other.nro != null) {
				return false;
			}
		} else if (!nro.equals(other.nro)) {
			return false;
		}
		return true;
	}

}
