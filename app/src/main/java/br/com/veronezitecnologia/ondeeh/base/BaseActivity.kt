package br.com.veronezitecnologia.ondeeh.base

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<P : BasePresenter<BaseView>>: BaseView, AppCompatActivity() {

    protected lateinit var presenter: P

    protected abstract fun instatiatePresenter(): P

    override fun getContext(): Context {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        presenter = instatiatePresenter()
    }

}