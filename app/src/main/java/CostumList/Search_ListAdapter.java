package CostumList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.madsfinnerup.tractrac.R;

import java.util.ArrayList;

public class Search_ListAdapter extends ArrayAdapter<SearchListItems> {

    private Context context;
    private int res;

    public Search_ListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<SearchListItems> objects) {
        super(context, resource, objects);
        context = context;
        res = resource;
    }
    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        ImageView imageView = getItem(position).imageView;
        String eventName = getItem(position).eventName;
        String event = getItem(position).event;

        SearchListItems itemsForSale = new SearchListItems(imageView,eventName,event);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(res,parent,false);

        ImageView eventflag = (ImageView) convertView.findViewById(R.id.eventFlag);
        TextView eventname = (TextView) convertView.findViewById(R.id.eventText01);
        TextView textPrice = (TextView) convertView.findViewById(R.id.eventText02);

        eventflag.setImageResource(imageView.getId());
        eventname.setText(eventName);
        textPrice.setText(event);
        return convertView;
    }
}
