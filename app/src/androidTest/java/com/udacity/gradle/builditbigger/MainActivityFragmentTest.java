package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityFragmentTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void clickTellJokeButton_ShowsNonEmptyString() {
        onView(withId(R.id.btn_getJoke)).perform(click());
        onView(withId(R.id.tv_newJoke)).check(matches(new TextViewValueExistenceMatcher()));
    }

    public class TextViewValueExistenceMatcher extends TypeSafeMatcher<View> {
        @Override
        protected boolean matchesSafely(View item) {
            TextView textView = (TextView) item;
            String value = textView.getText().toString();
            return !value.isEmpty();
        }

        @Override
        public void describeTo(Description description) {

        }
    }



    @After
    public void tearDown() throws Exception {
    }
}