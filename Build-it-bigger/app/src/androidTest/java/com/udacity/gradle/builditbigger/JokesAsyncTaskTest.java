package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by ahmed on 03/12/17.
 */
public class JokesAsyncTaskTest extends AndroidTestCase{

public void jokeload(){

try {
    JokesAsyncTask loadTask = new JokesAsyncTask();
    loadTask.execute();
    String joke = loadTask.get(30, TimeUnit.SECONDS);
    assertThat(joke,notNullValue());
    assertTrue(joke.length()>0);
} catch (Exception e) {
    fail("uncompleted");
}

}
}