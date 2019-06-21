package com.applicaster.pressengerpushplugin

import android.content.Context
import android.util.Log
import com.applicaster.plugin_manager.push_plugin.PushContract
import com.applicaster.plugin_manager.push_plugin.helper.PushPluginsType
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagLoadedI
import com.applicaster.plugin_manager.push_plugin.listeners.PushTagRegistrationI
import com.pressenger.sdk.PressengerSDKFactory
import com.pressenger.sdk.utils.callback.Callback
import com.pressenger.sdk.utils.callback.Result

class PressengerPushProvider : PushContract {

    var groupId: String? = null

    override fun registerPushProvider(context: Context?, registerID: String?) {
        // do nothing
    }

    override fun initPushProvider(context: Context?) {
        // todo: implement this
        val instance = PressengerSDKFactory.getInstance()
        instance.checkOverlayEnabled(context)
        instance.register(context, groupId) {
            result ->
            if (result.resultCode == Result.RES_SUCCESS) {
                Log.d(this.javaClass.simpleName, "push provider initialized successfully")
            } else {
                Log.e(this.javaClass.simpleName, "push provider initialization failed")
            }
        }
    }

    override fun setPluginParams(params: MutableMap<Any?, Any?>?) {
        // todo: implement this
        params?.let {
            groupId = params["group_id"].toString()
        }
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
