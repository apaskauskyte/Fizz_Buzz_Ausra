import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.random.Random

class CodeSamples {

    companion object {

        fun generateRandomNumber(TAG: String) {

            Log.i(TAG, "generateRandomNumber: ${(1 until 10).random()}")
            Log.i(TAG, "generateRandomNumber: ${(1..10).random()}")
            Log.i(TAG, "generateRandomNumber: ${List(5) { Random.nextInt(1, 10) }}")

            Log.i(TAG, "generateRandomNumber: ${Random.nextDouble(0.0, 10.0)}")
            Log.i(TAG, "generateRandomNumber: ${Random.nextDouble(0.0, 10.0).toFloat()}")
        }

        fun getCurrentTime(TAG: String) {

            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now()}")
            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now().year}")
            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now().month}")
            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now().dayOfMonth}")

            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now().hour}")
            Log.i(TAG, "getCurrentTime: ${LocalDateTime.now().minute}")
        }

        fun getDateWithDateFormatter_InputOutput(TAG: String) {

            val input = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val output = SimpleDateFormat("MMMM")

            Log.i(
                TAG, "getDateWithDateFormatter: ${input.parse("2023-01-01 12:12:12")}"
            )

            Log.i(
                TAG, "getDateWithDateFormatter: ${
                    output.format(input.parse("2023-01-01 12:12:12"))
                }"
            )

            Log.i(TAG, "getDateWithDateFormatter_InputOutput NEW: ${input.format(Date())}")
        }

        fun getDateWithDateFormatter_Output(TAG: String) {

            // Kotlin API Levels 26 or greater, here is a DateTimeFormatter Example:
            // https://www.baeldung.com/kotlin/dates
            var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

            Log.i(
                TAG,
                "getDateWithDateFormatter_Output: ${LocalDateTime.now().format(formatter)}"
            )
        }

        fun delayWithLifecycleScope(activity: AppCompatActivity, TAG: String) {
            activity.lifecycleScope.launch {
                delay(5000)
                Log.i(TAG, "newTst: OK ")
            }
        }
    }
}