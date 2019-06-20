package com.applicaster.pressengerpushplugin

import android.content.Context
import com.applicaster.plugin_manager.push_plugin.PushContract
import com.applicaster.plugin_manager.push_plugin.helper.PushPluginsType
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagLoadedI
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagRegistrationI

class PressengerPushProvider : PushContract {
    override fun registerPushProvider(context: Context?, registerID: String?) {
        TODO("not implemented")
    }

    override fun initPushProvider(context: Context?) {
        TODO("not implemented")
    }

    override fun setPluginParams(params: MutableMap<Any?, Any?>?) {
        TODO("not implemented")
    }

    override fun addTagToProvider(context: Context?, tag: MutableList<String>?, pushTagRegistrationListener: PushTagRegistrationI?) {
        TODO("not implemented")
    }

    override fun removeTagToProvider(context: Context?, tag: MutableList<String>?, pushTagRegistrationListener: PushTagRegistrationI?) {
        TODO("not implemented")
    }

    override fun getPluginType(): PushPluginsType {
        TODO("not implemented")
    }

    override fun getTagList(context: Context?, listener: PushTagLoadedI?) {
        TODO("not implemented")
    }
}
