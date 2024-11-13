import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserverDev1 : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "OnCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "onStart")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "onResume")
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "onPause")
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("Dev1LifecycleObserver", "onDestroy")
    }
}
class MyLifecycleObserverDev2 : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "OnCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "onStart")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "onResume")
    }
    override fun onPause(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "onPause")
    }
    override fun onStop(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("Dev2LifecycleObserver", "onDestroy")
    }
}