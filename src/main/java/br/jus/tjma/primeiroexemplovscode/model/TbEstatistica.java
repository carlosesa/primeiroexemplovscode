package br.jus.tjma.primeiroexemplovscode.model;

import java.util.Date;

public class TbEstatistica {

	private Integer idEstatistica;
	private Integer nmTask;
	private Integer nmNode;
	private Date dtInicio;
	private Date dtFim;
	private Integer nrDuracao;
	private String dsFluxo;

	public Integer getIdEstatistica() {
		return idEstatistica;
	}
	public void setIdEstatistica(Integer idEstatistica) {
		this.idEstatistica = idEstatistica;
	}
	public Integer getNmTask() {
		return nmTask;
	}
	public void setNmTask(Integer nmTask) {
		this.nmTask = nmTask;
	}
	public Integer getNmNode() {
		return nmNode;
	}
	public void setNmNode(Integer nmNode) {
		this.nmNode = nmNode;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
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
	public String getDsFluxo() {
		return dsFluxo;
	}
	public void setDsFluxo(String dsFluxo) {
		this.dsFluxo = dsFluxo;
	}
}
