package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class LibraryActivity : AppCompatActivity(), Step0Fragment.OnNextStep0Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // TODO replace Step0Fragment in containerFrameLayout

    }

    // TODO implement onNext() from Step0Fragment.OnNextStep0Listener

}
