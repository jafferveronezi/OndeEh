package br.com.veronezitecnologia.ondeeh.ui.pesquisa

import br.com.veronezitecnologia.ondeeh.Endereco
import br.com.veronezitecnologia.ondeeh.base.BaseView

interface PesquisaView : BaseView {

    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro: String)

    fun showLoading()

    fun hideLoading()

}