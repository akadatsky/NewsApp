package com.example.rss;

import java.util.ArrayList;

public class RssFeed {

    private ArrayList<RssItem> rssItems;

    public RssFeed() {
        rssItems = new ArrayList<>();
    }

    public void addRssItem(RssItem rssItem) {
        rssItems.add(rssItem);
    }

    public ArrayList<RssItem> getRssItems() {
        return rssItems;
    }


}
