package com.example.rss;

public class RssItem {

    private String id;
    private String title;
    private String icon;

    private String category_id;
    private String url;
    private String image;
    private String source;
    private String source_url;
    private String time;
    private String description;

    public RssItem() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RssItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", category_id='" + category_id + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", source='" + source + '\'' +
                ", source_url='" + source_url + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
