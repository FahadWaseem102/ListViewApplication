package com.example.fahad.listviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.alligator,R.drawable.goat,R.drawable.hen,R.drawable.jaguar,R.drawable.leapord,
                    R.drawable.lion,R.drawable.macaw,R.drawable.peigon,R.drawable.snake} ;
    String[] NAMES = {"Alligator","Goat","Hen","Jaguar","Leopard","Lion","Macaw","Pigeon","Snake"} ;
    String[] DESCRIPTIONS = {"Reptile","Pet Animal","Pet Animal","Wild Animal","Wild Animal",
                             "Wild Animal","Bird","Bird","Reptile"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView) ;

        ListAdapter listAdapter = new ListAdapter() ;
        listView.setAdapter(listAdapter);
    }

    public class ListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.list_items,null) ;
            ImageView imageView = convertView.findViewById(R.id.imageView) ;
            TextView textView_name = convertView.findViewById(R.id.textView_name) ;
            TextView textView_description = convertView.findViewById(R.id.textView_description) ;

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_description.setText(DESCRIPTIONS[position]);

            return convertView;
        }
    }
}
