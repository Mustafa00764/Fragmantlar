package uz.datatalim.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val bFirstFragment = findViewById<Button>(R.id.b_FirstFragment)
        val bSecondFragment = findViewById<Button>(R.id.b_SecondFragment)


        bFirstFragment.setOnClickListener {
            val firstfragment = FirstFragment()
            setFragment(firstfragment)
        }
        bSecondFragment.setOnClickListener {
            val secondfragment = SecondFragment()
            setFragment(secondfragment)
        }
    }

    private fun setFragment(some: Fragment) {

       supportFragmentManager
           .beginTransaction()
           .replace(R.id.fragment,some)
           .commit()

    }
}


