package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class LibraryActivity : AppCompatActivity(), Step0Fragment.OnNextStep0Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // TODO replace Step0Fragment in containerFrameLayout
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFrameLayout, Step0Fragment(), Step0Fragment::class.java.name)
                .commit()
    }

    // TODO implement onNext() from Step0Fragment.OnNextStep0Listener
    override fun onNext() {

        supportFragmentManager.beginTransaction()
                .addToBackStack(Step0Fragment::class.java.name)
                .replace(R.id.containerFrameLayout, Step1Fragment(), Step1Fragment::class.java.name)
                .commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFragmentManager.popBackStack()
    }
}
