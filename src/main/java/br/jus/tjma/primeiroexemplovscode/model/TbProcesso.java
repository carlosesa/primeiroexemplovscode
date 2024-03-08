/**
 * 
 */
package br.jus.tjma.primeiroexemplovscode.model;

import java.util.Date;

/**
 * 
 */
public class TbProcesso {
	private Integer idProcesso;
	private Integer nrProcesso;
	private Integer nrProcessoOrigem;
	private String dsComplemento;
	private Date dtInicio;
	private Integer idJbpm;
	private Date dtFim;
	private Integer nrDuracao;
	private Integer nmActorId;
	private String dsNmUsuCadastroProcesso;
	private Integer idPkTbProcessoPg;
	private Integer IdSessaoPg;
	private Integer NrProcessoTemp;

	public Integer getIdProcesso() {
		return idProcesso;
	}
	public void setIdProcesso(Integer idProcesso) {
		this.idProcesso = idProcesso;
	}
	public Integer getNrProcesso() {
		return nrProcesso;
	}
	public void setNrProcesso(Integer nrProcesso) {
		this.nrProcesso = nrProcesso;
	}
	public Integer getNrProcessoOrigem() {
		return nrProcessoOrigem;
	}
	public void setNrProcessoOrigem(Integer nrProcessoOrigem) {
		this.nrProcessoOrigem = nrProcessoOrigem;
	}
	public String getDsComplemento() {
		return dsComplemento;
	}
	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Integer getIdJbpm() {
		return idJbpm;
	}
	public void setIdJbpm(Integer idJbpm) {
		this.idJbpm = idJbpm;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public Integer getNrDuracao() {
		return nrDuracao;
	}
	public void setNrDuracao(Integer nrDuracao) {
		this.nrDuracao = nrDuracao;
	}
	public Integer getNmActorId() {
		return nmActorId;
	}
	public void setNmActorId(Integer nmActorId) {
		this.nmActorId = nmActorId;
	}
	public String getDsNmUsuCadastroProcesso() {
		return dsNmUsuCadastroProcesso;
	}
	public void setDsNmUsuCadastroProcesso(String dsNmUsuCadastroProcesso) {
		this.dsNmUsuCadastroProcesso = dsNmUsuCadastroProcesso;
	}
	public Integer getIdPkTbProcessoPg() {
		return idPkTbProcessoPg;
	}
	public void setIdPkTbProcessoPg(Integer idPkTbProcessoPg) {
		this.idPkTbProcessoPg = idPkTbProcessoPg;
	}
	public Integer getIdSessaoPg() {
		return IdSessaoPg;
	}
	public void setIdSessaoPg(Integer idSessaoPg) {
		IdSessaoPg = idSessaoPg;
	}
	public Integer getNrProcessoTemp() {
		return NrProcessoTemp;
	}
	public void setNrProcessoTemp(Integer nrProcessoTemp) {
		NrProcessoTemp = nrProcessoTemp;
	}
}