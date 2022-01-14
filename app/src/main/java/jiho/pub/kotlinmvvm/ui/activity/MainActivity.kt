package jiho.pub.kotlinmvvm.ui.activity

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jiho.pub.kotlinmvvm.R
import jiho.pub.kotlinmvvm.base.BaseActivity
import jiho.pub.kotlinmvvm.databinding.ActivityMainBinding
import jiho.pub.kotlinmvvm.domain.viewModel.MainViewModel

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val viewModel: MainViewModel by viewModels()

    override fun init() {
        super.init()
    }


}
