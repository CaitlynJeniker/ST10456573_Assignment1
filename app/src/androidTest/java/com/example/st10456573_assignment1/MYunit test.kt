import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MYunittest {

    @Test
    fun testButtonClicked() {
        // Start the MainActivity
        ActivityScenario.launch(MainActivity::class.java)

        // Simulate button click
        onView(withId(R.id.button2)).perform(click())

        // Verify that the text in the TextView has changed
        onView(withId(R.id.TextView)).check(withText("Expected Text After Button Click"))
    }
}
