package com.applicaster.pressengerpushplugin

import android.content.Context
import com.applicaster.plugin_manager.push_plugin.PushContract
import com.applicaster.plugin_manager.push_plugin.helper.PushPluginsType
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagLoadedI
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagRegistrationI

class PressengerPushProvider : PushContract {
    override fun registerPushProvider(context: Context?, registerID: String?) {
        // todo: implement this
    }

    override fun initPushProvider(context: Context?) {
        // todo: implement this
    }

    override fun setPluginParams(params: MutableMap<Any?, Any?>?) {
        // todo: implement this
    }

    override fun addTagToProvider(context: Context?, tag: MutableList<String>?, pushTagRegistrationListener: PushTagRegistrationI?) {
        // todo: implement this
    }

    override fun removeTagToProvider(context: Context?, tag: MutableList<String>?, pushTagRegistrationListener: PushTagRegistrationI?) {
        // todo: implement this
    }

    override fun getPluginType(): PushPluginsType {
        // todo: implement this (testing with urbanAirship)
        return PushPluginsType.urbanAirship
    }

    override fun getTagList(context: Context?, listener: PushTagLoadedI?) {
        // todo: implement this
    }
}
