package `in`.eduforyou.androidbasics.launchmode.standard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import `in`.eduforyou.androidbasics.R

class StandardActivity1 : AppCompatActivity(), View.OnClickListener {

    var btn1: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard1)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}