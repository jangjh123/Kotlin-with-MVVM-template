package jiho.pub.kotlinmvvm.ui.activity

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jiho.pub.kotlinmvvm.R
import jiho.pub.kotlinmvvm.base.BaseActivity
import jiho.pub.kotlinmvvm.databinding.ActivityMainBinding
import jiho.pub.kotlinmvvm.domain.viewModel.MainViewModel
import jiho.pub.kotlinmvvm.ui.component.MatchAdapter

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val viewModel: MainViewModel by viewModels()
    val matchAdapter = MatchAdapter()

    override fun init() {
        super.init()
        binding.activity = this
        binding.viewModel = viewModel
    }
}
