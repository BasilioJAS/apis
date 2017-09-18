package ar.com.basilium.apis.fabric;

/**
 * Created by sader on 16/9/2017.
 */

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.crashlytics.android.answers.ContentViewEvent;


public class answersInterface {

    private answersInterface() {}
    private static answersInterface instance = null;
    public static answersInterface getInstance(){
        if (instance == null) instance = new answersInterface();
        return instance;
    }

    // TODO: Move this method and use your own event name to track your key metrics
    public void logKeyMetric() {
        // TODO: Use your own string attributes to track common values over time
        // TODO: Use your own number attributes to track median value over time
        Answers.getInstance().logCustom(new CustomEvent("Video Played")
                .putCustomAttribute("Category", "Comedy")
                .putCustomAttribute("order", "peperoni")
                .putCustomAttribute("Length", 350));
    }

    public void logContentView()
    {
        // TODO: Use your own attributes to track content views in your app
        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentName("Tweet")
                .putContentType("Video")
                .putContentId("1234")
                .putCustomAttribute("Favorites Count", 20)
                .putCustomAttribute("Screen Orientation", "Landscape"));


    }
}
