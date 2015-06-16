package uk.co.jordanrobinson.githubstreakreminders.Utilities;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class StreakUtilities {

    private final static String URL = "https://github.com/";

    public static int GetCurrentStreak(String username) {
        int ret = -1;
        Document document;

        try {
            document = Jsoup.connect(URL + username).get();
            Element streakElement = document.select("span.contrib-number").last();
            String streak = streakElement.text();
            ret = Integer.valueOf(streak.replace(" days", "").replace(",", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ret;
    }
}
