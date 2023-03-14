package com.seunggyu.stitch.ui.fragment.mymatch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

import com.seunggyu.stitch.R
import com.seunggyu.stitch.databinding.FragMainMymatchBinding

class MymatchFragment : Fragment() {
    private lateinit var binding: FragMainMymatchBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_main_mymatch, container, false)
        initClickListener()
        initView()
        initGroup()
        initObserver()
        return binding.root
    }

    private fun initView() {

    }

    private fun initObserver() {

    }

    private fun initGroup() {

    }

    private fun initClickListener() {

    }
}