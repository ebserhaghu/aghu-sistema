package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoLembrete;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamLembrete generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamLemSq1", sequenceName="AGH.MAM_LEM_SQ1", allocationSize = 1)
@Table(name = "MAM_LEMBRETES", schema = "AGH")
public class MamLembrete extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5656082283260437742L;
	private Long seq;
	private Integer version;
	private RapServidores rapServidoresByMamLemSerFk3;
	private MamLembrete mamLembrete;
	private AacConsultas aacConsultas;
	private RapServidores rapServidoresByMamLemSerFk1;
	private RapServidores rapServidoresByMamLemSerFk4;
	private MamRegistro mamRegistro;
	private RapServidores rapServidoresByMamLemSerFk2;
	private AghAtendimentos aghAtendimentos;
	private AipPacientes aipPacientes;
	private String descricao;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	//private String indPendente;
	private DominioSituacaoLembrete indPendente;
	
	
	private Set<MamLembrete> mamLembretees = new HashSet<MamLembrete>(0);

	public MamLembrete() {
	}

	public MamLembrete(Long seq, RapServidores rapServidoresByMamLemSerFk1, AipPacientes aipPacientes, String descricao,
			Date dthrCriacao, DominioSituacaoLembrete indPendente) {
		this.seq = seq;
		this.rapServidoresByMamLemSerFk1 = rapServidoresByMamLemSerFk1;
		this.aipPacientes = aipPacientes;
		this.descricao = descricao;
		this.dthrCriacao = dthrCriacao;
		this.indPendente = indPendente;
	}

	public MamLembrete(Long seq, RapServidores rapServidoresByMamLemSerFk3, MamLembrete mamLembrete, AacConsultas aacConsultas,
			RapServidores rapServidoresByMamLemSerFk1, RapServidores rapServidoresByMamLemSerFk4, MamRegistro mamRegistro,
			RapServidores rapServidoresByMamLemSerFk2, AghAtendimentos aghAtendimentos, AipPacientes aipPacientes, String descricao,
			Date dthrCriacao, Date dthrValida, Date dthrMvto, Date dthrValidaMvto, DominioSituacaoLembrete indPendente, Set<MamLembrete> mamLembretees) {
		this.seq = seq;
		this.rapServidoresByMamLemSerFk3 = rapServidoresByMamLemSerFk3;
		this.mamLembrete = mamLembrete;
		this.aacConsultas = aacConsultas;
		this.rapServidoresByMamLemSerFk1 = rapServidoresByMamLemSerFk1;
		this.rapServidoresByMamLemSerFk4 = rapServidoresByMamLemSerFk4;
		this.mamRegistro = mamRegistro;
		this.rapServidoresByMamLemSerFk2 = rapServidoresByMamLemSerFk2;
		this.aghAtendimentos = aghAtendimentos;
		this.aipPacientes = aipPacientes;
		this.descricao = descricao;
		this.dthrCriacao = dthrCriacao;
		this.dthrValida = dthrValida;
		this.dthrMvto = dthrMvto;
		this.dthrValidaMvto = dthrValidaMvto;
		this.indPendente = indPendente;
		this.mamLembretees = mamLembretees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamLemSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamLemSerFk3() {
		return this.rapServidoresByMamLemSerFk3;
	}

	public void setRapServidoresByMamLemSerFk3(RapServidores rapServidoresByMamLemSerFk3) {
		this.rapServidoresByMamLemSerFk3 = rapServidoresByMamLemSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LEM_SEQ")
	public MamLembrete getMamLembrete() {
		return this.mamLembrete;
	}

	public void setMamLembrete(MamLembrete mamLembrete) {
		this.mamLembrete = mamLembrete;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getAacConsultas() {
		return this.aacConsultas;
	}

	public void setAacConsultas(AacConsultas aacConsultas) {
		this.aacConsultas = aacConsultas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMamLemSerFk1() {
		return this.rapServidoresByMamLemSerFk1;
	}

	public void setRapServidoresByMamLemSerFk1(RapServidores rapServidoresByMamLemSerFk1) {
		this.rapServidoresByMamLemSerFk1 = rapServidoresByMamLemSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_VALIDA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamLemSerFk4() {
		return this.rapServidoresByMamLemSerFk4;
	}

	public void setRapServidoresByMamLemSerFk4(RapServidores rapServidoresByMamLemSerFk4) {
		this.rapServidoresByMamLemSerFk4 = rapServidoresByMamLemSerFk4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RGT_SEQ")
	public MamRegistro getMamRegistro() {
		return this.mamRegistro;
	}

	public void setMamRegistro(MamRegistro mamRegistro) {
		this.mamRegistro = mamRegistro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamLemSerFk2() {
		return this.rapServidoresByMamLemSerFk2;
	}

	public void setRapServidoresByMamLemSerFk2(RapServidores rapServidoresByMamLemSerFk2) {
		this.rapServidoresByMamLemSerFk2 = rapServidoresByMamLemSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAghAtendimentos() {
		return this.aghAtendimentos;
	}

	public void setAghAtendimentos(AghAtendimentos aghAtendimentos) {
		this.aghAtendimentos = aghAtendimentos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false)
	public AipPacientes getAipPacientes() {
		return this.aipPacientes;
	}

	public void setAipPacientes(AipPacientes aipPacientes) {
		this.aipPacientes = aipPacientes;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 29)
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 29)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MVTO", length = 29)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA_MVTO", length = 29)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "IND_PENDENTE")
	@Enumerated(EnumType.STRING)
	public DominioSituacaoLembrete getIndPendente() {
		return this.indPendente;
	}
	
	public void setIndPendente(DominioSituacaoLembrete indPendente) {
		this.indPendente = indPendente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamLembrete")
	public Set<MamLembrete> getMamLembretees() {
		return this.mamLembretees;
	}

	public void setMamLembretees(Set<MamLembrete> mamLembretees) {
		this.mamLembretees = mamLembretees;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MAM_LEM_SER_FK3("rapServidoresByMamLemSerFk3"),
		MAM_LEMBRETES("mamLembrete"),
		AAC_CONSULTAS("aacConsultas"),
		CON_NUMERO("aacConsultas.numero"),
		RAP_SERVIDORES_BY_MAM_LEM_SER_FK1("rapServidoresByMamLemSerFk1"),
		RAP_SERVIDORES_BY_MAM_LEM_SER_FK4("rapServidoresByMamLemSerFk4"),
		MAM_REGISTRO("mamRegistro"),
		RAP_SERVIDORES_BY_MAM_LEM_SER_FK2("rapServidoresByMamLemSerFk2"),
		AGH_ATENDIMENTOS("aghAtendimentos"),
		AIP_PACIENTES("aipPacientes"),
		DESCRICAO("descricao"),
		DTHR_CRIACAO("dthrCriacao"),
		DTHR_VALIDA("dthrValida"),
		DTHR_MVTO("dthrMvto"),
		DTHR_VALIDA_MVTO("dthrValidaMvto"),
		IND_PENDENTE("indPendente"),
		MAM_LEMBRETEES("mamLembretees"),
		LEM_SEQ("mamLembrete.seq");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamLembrete)) {
			return false;
		}
		MamLembrete other = (MamLembrete) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
