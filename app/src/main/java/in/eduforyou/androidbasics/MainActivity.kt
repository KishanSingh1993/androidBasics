package `in`.eduforyou.androidbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import `in`.eduforyou.androidbasics.broadcast.BroadcastActivity
import `in`.eduforyou.androidbasics.intentandintentfilters.IntentAndIntentFiltersActivity
import `in`.eduforyou.androidbasics.launchmode.standard.StandardActivity1
import `in`.eduforyou.androidbasics.mvvmwithkotlincoroutinesandretrofit.MovieActivity
import `in`.eduforyou.androidbasics.services.AndroidServiceActivity
import `in`.eduforyou.androidbasics.viewmodelsandconfigchange.AndroidViewModelAndConfigChanges
import `in`.eduforyou.androidbasics.workmanager.NotificationActivity
import `in`.eduforyou.androidbasics.workmanager.WorkNotificationActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var btn1:Button?=null
    var btn2:Button?=null
    var btn3:Button?=null
    var btn4:Button?=null
    var btn5:Button?=null
    var btn6:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btnMain)
        btn2 = findViewById(R.id.btnBroadcast)
        btn3 = findViewById(R.id.btnServices)
        btn4 = findViewById(R.id.btnViewModel)
        btn5 = findViewById(R.id.btnRetrofit)
        btn6 = findViewById(R.id.btnWorkManager)
        btn1?.setOnClickListener(this)
        btn2?.setOnClickListener(this)
        btn3?.setOnClickListener(this)
        btn4?.setOnClickListener(this)
        btn5?.setOnClickListener(this)
        btn6?.setOnClickListener(this)
        Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

       Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            // when button 1 is clicked then execute this block of code
            R.id.btnMain -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
            R.id.btnBroadcast -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, BroadcastActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
            R.id.btnServices -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, AndroidServiceActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
            R.id.btnViewModel -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, AndroidViewModelAndConfigChanges::class.java)
                // start your next activity
                startActivity(intent)
            }
            R.id.btnRetrofit -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, MovieActivity::class.java)
                // start your next activity
                startActivity(intent)
            }

            R.id.btnWorkManager -> {

                //val intent = Intent(this, IntentAndIntentFiltersActivity::class.java)
                val intent = Intent(this, WorkNotificationActivity::class.java)
                // start your next activity
                startActivity(intent)
            }
        }
    }
}

