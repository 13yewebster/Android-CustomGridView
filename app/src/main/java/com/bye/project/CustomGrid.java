package com.bye.project;

/**
 * Created by webster on 9/7/16.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bye.project.R;

import java.util.List;

public class CustomGrid extends BaseAdapter{
      private Context mContext;
      private List<ImageGridModel> object;
 
        public CustomGrid(Context c, List<ImageGridModel> data_cover ) {
            mContext = c;
            object = data_cover;
        }
 
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return object.size();
        }
 
        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }
 
        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }
 
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View grid;
            LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
            if (convertView == null) {
 
                grid = new View(mContext);
                grid = inflater.inflate(R.layout.grid_view, null);
                TextView textView = (TextView) grid.findViewById(R.id.grid_text);
                ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
                textView.setText(object.get(position).getCaption());
                imageView.setImageDrawable(object.get(position).getImage());
            } else {
                grid = (View) convertView;
            }
 
            return grid;
        }
}