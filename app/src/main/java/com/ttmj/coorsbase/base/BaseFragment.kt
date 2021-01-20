package com.ttmj.coorsbase.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment(@LayoutRes layoutRes: Int) : Fragment(layoutRes) {
    abstract val viewBinding: ViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLiveData()
        beforeInitView()
        initView()
        afterInitView()
    }

    private fun initLiveData() {}

    private fun beforeInitView() {}

    abstract fun initView()

    private fun afterInitView() {}
}