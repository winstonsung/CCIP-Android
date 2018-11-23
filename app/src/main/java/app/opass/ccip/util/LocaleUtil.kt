package app.opass.ccip.util

import android.annotation.TargetApi
import android.content.Context
import android.os.Build

class LocaleUtil {
    companion object {
        @TargetApi(Build.VERSION_CODES.N)
        fun getCurrentLocale(context: Context) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            context.resources.configuration.locales.get(0)
        } else {
            context.resources.configuration.locale
        }
    }
}
