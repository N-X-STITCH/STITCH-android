package com.seunggyu.stitch.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seunggyu.stitch.adapter.SignupProfileListAdapter
import com.seunggyu.stitch.databinding.FragSignup2Binding
import com.seunggyu.stitch.viewModel.SignupViewModel

class SignupProfileFragment : Fragment() {
    private val viewModel by viewModels<SignupViewModel>()

    private val binding by lazy {
        FragSignup2Binding.inflate(layoutInflater)
    }
    private val signupProfileListAdapter by lazy {
        SignupProfileListAdapter(viewModel.items)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        with(binding) {
            rvProfileItem.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                adapter = SignupProfileListAdapter(viewModel.items)
//                addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            }
        }

        return binding.root
    }
}