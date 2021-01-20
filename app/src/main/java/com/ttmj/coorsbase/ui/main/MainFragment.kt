package com.ttmj.coorsbase.ui.main

import com.ttmj.coorsbase.R
import com.ttmj.coorsbase.base.BaseFragment
import com.ttmj.coorsbase.databinding.FragmentMainBinding
import com.ttmj.coorsbase.delegate.viewBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override val viewBinding by viewBinding(FragmentMainBinding::bind)

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment().apply {}
    }


    private fun initLiveData() {}

    private fun beforeInitView() {}

    override fun initView(){
        with(viewBinding){
            rvMainMenu.adapter = MainMenuAdapter()
        }
    }

    private fun afterInitView() {}


}