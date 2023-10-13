package `in`.eduforyou.androidbasics.viewmodelsandconfigchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import `in`.eduforyou.androidbasics.R

class AndroidViewModelAndConfigChanges : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_view_model_and_config_changes)

        // create instance of the viewModel of the Custom MyViewModel for the activity MainActivity.kt
        val myViewModel: MyViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        // create instances of the UI elements
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)

        textView.text = myViewModel.number.toString()
        button.setOnClickListener {
            // trigger the increment
            // function to increment the value
            myViewModel.addNumber()

            // set the updated value of number to the TextView
            textView.text = myViewModel.number.toString()
        }
    }
}