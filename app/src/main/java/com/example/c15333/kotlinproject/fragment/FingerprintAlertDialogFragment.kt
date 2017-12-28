package com.example.c15333.kotlinproject.fragment

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.c15333.kotlinproject.R

/**
 * Created by c15333 on 12/18/17.
 */
class FingerprintAlertDialogFragment : DialogFragment() {

    fun newInstance(): FingerprintAlertDialogFragment {
        return FingerprintAlertDialogFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fingerprint_alert_dialog_container, container, false)
    }

}