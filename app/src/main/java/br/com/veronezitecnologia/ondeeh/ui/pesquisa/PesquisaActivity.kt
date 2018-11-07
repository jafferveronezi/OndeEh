package br.com.veronezitecnologia.ondeeh.ui.pesquisa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.veronezitecnologia.ondeeh.Endereco
import br.com.veronezitecnologia.ondeeh.R
import br.com.veronezitecnologia.ondeeh.base.BaseActivity
import br.com.veronezitecnologia.ondeeh.base.BaseView

class PesquisaActivity : BaseActivity<PesquisaPresenter>(), PesquisaView {
    override fun atualizaEndereco(endereco: Endereco) {
        Toast.makeText(this, endereco.logradouro, Toast.LENGTH_LONG).show()
    }

    override fun showErro(erro: String) {
        Toast.makeText(this, erro, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        Toast.makeText(this, "Carregando", Toast.LENGTH_LONG).show()
    }

    override fun hideLoading() {
        Toast.makeText(this, "", Toast.LENGTH_LONG).show()
    }

    override fun instatiatePresenter(): PesquisaPresenter {
        return PesquisaPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.pesquisar("06213080")
    }

}
