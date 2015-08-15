package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends Activity {

    public static final String[] COLORS = {
            "#142b44",
            "#1d508d",
            "#297cbb",
            "#288ad6",
            "#0fdebd",
            "#16c98d",
            "#feef6d",
            "#ffc83f",
            "#fa5e5b",
            "#bf538d"
    };
    public TextView textLog;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        textLog = (TextView) findViewById(R.id.textLog);
        listView = (ListView) findViewById(R.id.list);

        ColorAdapter adapter = new ColorAdapter(this, android.R.layout.simple_list_item_1, COLORS);
        listView.setAdapter(adapter);

        //08
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String color = (String) listView.getItemAtPosition(position);

                textLog.setText("You clicked on Item(position=" + itemPosition + "," + "color=" + color + ")");
            }
        });
    }

    public class ColorAdapter extends ArrayAdapter<String> {

        public ColorAdapter(Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView = super.getView(position, convertView, parent);
            String colorString = COLORS[position];
            int colorValue = Color.parseColor(colorString);
            Drawable colorDrawable = new ColorDrawable(colorValue);
            rowView.setBackground(colorDrawable);
            return rowView;
        }
    }


}
