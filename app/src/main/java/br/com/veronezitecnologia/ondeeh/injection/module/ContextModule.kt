package br.com.veronezitecnologia.ondeeh.injection.module

import android.app.Application
import android.content.Context
import br.com.veronezitecnologia.ondeeh.base.BaseView
import dagger.Module
import dagger.Provides

@Module
object ContextModule {


    @Provides
    @JvmStatic
    fun provideContext(baseView: BaseView): Context {
        return baseView.getContext()
    }

    @Provides
    @JvmStatic
    fun provideApplication(context: Context): Application {
        return context.applicationContext as Application
    }

}