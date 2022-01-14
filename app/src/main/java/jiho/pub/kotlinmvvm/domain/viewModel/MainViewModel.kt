package jiho.pub.kotlinmvvm.domain.viewModel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import jiho.pub.kotlinmvvm.data.model.Match
import jiho.pub.kotlinmvvm.domain.repository.Repository
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

//    get / set / on(콜백) / 동사

@ViewModelScoped
class MainViewModel @Inject constructor(
    private val repository: Repository,
    dispatcher: CoroutineDispatcher
) : ViewModel() {

    lateinit var matchList : ArrayList<Match>

    init {
        matchList.add(Match("a"))
        matchList.add(Match("1"))
        matchList.add(Match("as"))
    }

}