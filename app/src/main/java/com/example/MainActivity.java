package com.example;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rss.RssFeed;
import com.example.rss.RssItem;
import com.example.rss.RssReader;

import java.net.URL;
import java.util.List;

public class MainActivity extends Activity {

//    public static final String RSS_URL = "http://newspda.net/rss/categories.php?app_id=1&app_version=3.0_android_free/";

    public static final String RSS_URL = "http://newspda.net/rss/news.php?app_id=1&app_version=3.0_android_pro&category_id=5";

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doRssWork();
            }
        });

        ListView listView = (ListView) findViewById(R.id.list);
        adapter = new MyAdapter(this);
        listView.setAdapter(adapter);
    }

    private void doRssWork() {
        new AsyncTask<Void, Void, RssFeed>() {

            @Override
            protected void onPreExecute() {
                adapter.clear();
            }

            @Override
            protected RssFeed doInBackground(Void... params) {
                try {
                    URL url = new URL(RSS_URL);
                    return RssReader.read(url);
                } catch (Exception e) {
                    Log.e("RSS Reader", "Can't parse RSS", e);
                }
                return null;
            }

            @Override
            protected void onPostExecute(RssFeed rssFeed) {
                if (rssFeed != null) {

                    List<RssItem> items = rssFeed.getRssItems();
                    Log.i("MainActivity", "items size: " + items.size());

                    adapter.addAll(items);
                }
            }

        }.execute();
    }

}
