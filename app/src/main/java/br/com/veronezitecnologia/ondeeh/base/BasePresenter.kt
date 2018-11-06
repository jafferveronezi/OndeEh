package br.com.veronezitecnologia.ondeeh.base

abstract  class BasePresenter<out V : BaseView>(protected  val view: V) {

    init {
        inject()
    }

    open fun onViewCreated() {

    }

    open fun onViewDestroyed() {

    }


    private fun inject() {

    }
}