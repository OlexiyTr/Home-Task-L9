package com.example.homework9

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyFragment : Fragment(R.layout.mfragment){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvDescriptionFragment).text = arguments?.getDouble(mFragment).toString()
    }

    companion object {
        const val mFragment = "mFragment"

        fun newInstance(number : Double) : MyFragment {
            val fragment = MyFragment()
            val bundle = Bundle()
            bundle.putDouble(mFragment, number)
            fragment.arguments = bundle
            return fragment
        }
    }
}