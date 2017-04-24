package br.gov.mec.aghu.model;

// Generated 21/06/2012 16:43:58 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelExaAgendPac generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_EXA_AGEND_PAC", schema = "AGH")
@Immutable
public class VAelExaAgendPac extends BaseEntityId<VAelExaAgendPacId> implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1517317524548264991L;
	
	private VAelExaAgendPacId id;

	public VAelExaAgendPac() {
	}

	public VAelExaAgendPac(VAelExaAgendPacId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "iseSoeSeq", column = @Column(name = "ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "hedDthrAgenda", column = @Column(name = "HED_DTHR_AGENDA", nullable = false, length = 7)),
			@AttributeOverride(name = "exaSigla", column = @Column(name = "EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "manSeq", column = @Column(name = "MAN_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "descricaoExame", column = @Column(name = "DESCRICAO_EXAME", nullable = false, length = 100)),
			@AttributeOverride(name = "iseSolicitacao", column = @Column(name = "ISE_SOLICITACAO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "hedGaeUnfSeq", column = @Column(name = "HED_GAE_UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "hedGaeSeqp", column = @Column(name = "HED_GAE_SEQP", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "dataSolic", column = @Column(name = "DATA_SOLIC", nullable = false, length = 7)) })
	public VAelExaAgendPacId getId() {
		return this.id;
	}

	public void setId(VAelExaAgendPacId id) {
		this.id = id;
	}
	
public enum Fields {
		
		PAC_CODIGO("id.pacCodigo"),
		ISE_SOE_SEQ("id.iseSoeSeq"),
		HED_DTHR_AGENDA("id.hedDthrAgenda"),
		EXA_SIGLA("id.exaSigla"),
		MAN_SEQ("id.manSeq"),
		UNF_SEQ("id.unfSeq"),
		DESCRICAO_EXAME("id.descricaoExame"),
		HED_GAE_UNF_SEQ("id.hedGaeUnfSeq"),
		HED_GAE_SEQP("id.hedGaeSeqp"),
		DATA_SOLIC("id.dataSolic");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		VAelExaAgendPac other = (VAelExaAgendPac) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}