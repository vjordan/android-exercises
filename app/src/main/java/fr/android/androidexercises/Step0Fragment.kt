package fr.android.androidexercises

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Step0Fragment : Fragment() {

    companion object {
        private val STEP_0 = "This is step 0"
    }

    private val textView: TextView? = null
    private val listener: OnNextStep0Listener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // TODO cast context to listener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_step0, container, false)

        // TODO find TextView and set text

        // TODO find Button and set listener
        val nextButton: Button
        nextButton.setOnClickListener {
            // TODO call listener
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO setText(STEP_0)
    }

    interface OnNextStep0Listener// TODO add onNext() method

}
