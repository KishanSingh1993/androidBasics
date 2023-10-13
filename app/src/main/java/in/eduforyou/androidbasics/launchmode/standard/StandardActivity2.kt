package `in`.eduforyou.androidbasics.launchmode.standard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import `in`.eduforyou.androidbasics.R

class StandardActivity2 : AppCompatActivity() {

    var btn1: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard2)
    }
}