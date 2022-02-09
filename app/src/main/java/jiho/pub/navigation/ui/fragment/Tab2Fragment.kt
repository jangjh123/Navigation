package jiho.pub.navigation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jiho.pub.navigation.R
import jiho.pub.navigation.base.BaseFragment
import jiho.pub.navigation.databinding.FragmentTab2Binding

class Tab2Fragment : BaseFragment<FragmentTab2Binding>(R.layout.fragment_tab2) {
    override fun onResume() {
        super.onResume()

        binding.textView.text = "b"

    }
}