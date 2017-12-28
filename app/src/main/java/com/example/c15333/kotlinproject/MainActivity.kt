package com.example.c15333.kotlinproject

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.example.c15333.kotlinproject.fragment.FingerprintAlertDialogFragment

class MainActivity : AppCompatActivity() {

    @BindView(R.id.password_edit_text) lateinit var password: EditText
    @BindView(R.id.username_edit_text) lateinit var username: EditText
    private lateinit var login_button: Button

    var SHARED_USERNAME: String? = "username"
    var SHARED_PASSWORD: String? = "password"

    override fun onCreate(savedInstanceState: Bundle?) {
        ButterKnife.bind(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button = findViewById<Button>(R.id.login_button)
        login_button.setOnClickListener(View.OnClickListener {

            val pop = FingerprintAlertDialogFragment()
            val fm = fragmentManager
            pop.show(fm, "name")
        })
    }

    @OnClick(R.id.login_button)
    internal fun login() {
//        val sharedPreferences: SharedPreferences = getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
//        sharedPreferences.edit().putString(SHARED_USERNAME, username.toString()).apply()
//        sharedPreferences.edit().putString(SHARED_PASSWORD, password.toString()).apply()
//
//        Toast.makeText(baseContext, SHARED_PASSWORD, Toast.LENGTH_LONG).show()
//        val fragment = FingerprintAlertDialogFragment()
//        fragment.newInstance()
//        fragment.show(fragmentManager, "")
    }

    fun <T : View> Activity.bind(@IdRes res: Int): Lazy<T> {
        return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(res) }
    }
}
