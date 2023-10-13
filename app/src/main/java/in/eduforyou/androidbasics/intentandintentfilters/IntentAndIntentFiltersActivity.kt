package `in`.eduforyou.androidbasics.intentandintentfilters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import `in`.eduforyou.androidbasics.R
import `in`.eduforyou.androidbasics.viewmodelsandconfigchange.AndroidViewModelAndConfigChanges

class IntentAndIntentFiltersActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_and_intent_filters)

        val btnSend: Button = findViewById(R.id.sendButton)
        val btnView: Button = findViewById(R.id.buttonView)

        btnSend.setOnClickListener(this)
        btnView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            // when button 1 is clicked then execute this block of code
            R.id.sendButton -> {

                val intent = Intent(Intent.ACTION_SEND) // intent
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, "kishang.90@gmail.com")
                intent.putExtra(Intent.EXTRA_SUBJECT, "This is a dummy message")
                intent.putExtra(Intent.EXTRA_TEXT, "Dummy test message")
                startActivity(intent)
            }

            R.id.buttonView -> {

                val intent = Intent(Intent.ACTION_VIEW)
                startActivity(intent)
            }
        }
    }
}