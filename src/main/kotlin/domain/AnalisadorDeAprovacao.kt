package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

	private lateinit var criterio: CriterioDeAprovacao

	fun defineCriterio(criterio: CriterioDeAprovacao) {
		this.criterio = criterio
	}

	fun fechaBoletim(boletim: Boletim): BoletimFechado {
		val mediaFinal: Double = criterio.mediaFinal(boletim)
		val foiAprovado: Boolean = criterio.estaAprovado(boletim)

		return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs,
                              mediaFinal, foiAprovado)
	}
}
