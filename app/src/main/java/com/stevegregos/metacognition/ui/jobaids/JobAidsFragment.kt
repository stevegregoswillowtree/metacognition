package com.stevegregos.metacognition.ui.jobaids

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.stevegregos.metacognition.R

class JobAidsFragment : Fragment() {

    private lateinit var jobAidsViewModel: JobAidsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        jobAidsViewModel =
                ViewModelProviders.of(this).get(JobAidsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_job_aids, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        jobAidsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
