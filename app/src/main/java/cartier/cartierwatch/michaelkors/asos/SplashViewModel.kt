package cartier.cartierwatch.michaelkors.asos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

class SplashViewModel : ViewModel() {

    private var _isError = MutableLiveData<Boolean>()
    val isError: LiveData<Boolean> = _isError

    fun sendHttpRequest(urlString: String) {
        viewModelScope.launch {
            val responseCode = makeRequest(urlString)
            _isError.value = responseCode == 404
        }
    }

    private suspend fun makeRequest(urlString: String): Int {
        return withContext(Dispatchers.IO) {
            var urlConnection: HttpURLConnection? = null
            try {
                val url = URL(urlString)
                urlConnection = url.openConnection() as HttpURLConnection
                urlConnection.responseCode
            } finally {
                urlConnection?.disconnect()
            }
        }
    }
}