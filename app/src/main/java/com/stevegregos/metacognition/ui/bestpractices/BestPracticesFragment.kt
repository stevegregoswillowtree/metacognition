package com.stevegregos.metacognition.ui.bestpractices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.stevegregos.metacognition.R

class BestPracticesFragment : Fragment() {

    private lateinit var bestPracticesViewModel: BestPracticesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        bestPracticesViewModel =
                ViewModelProviders.of(this).get(BestPracticesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_best_practices, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        bestPracticesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
