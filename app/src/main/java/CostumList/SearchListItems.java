package CostumList;

import android.widget.ImageView;

public class SearchListItems {

    public ImageView imageView;
    public String eventName;
    public String event;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public SearchListItems (ImageView imageView, String eventName, String event) {
        this.imageView = imageView;
        this.eventName = eventName;
        this.event = event;

    }


}
