package com.stevegregos.metacognition.ui.techniques

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.stevegregos.metacognition.R

class TechniquesFragment : Fragment() {

    private lateinit var techniquesViewModel: TechniquesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        techniquesViewModel =
                ViewModelProviders.of(this).get(TechniquesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_techniques, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        techniquesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
