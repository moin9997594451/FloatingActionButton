package com.complexity.moinkhan.floatingactionbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import static com.complexity.moinkhan.floatingactionbutton.R.drawable.ic_add;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon = new ImageView(this);
        icon.setImageDrawable(getResources().getDrawable(R.drawable.ic_add));

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this).setContentView(icon).build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView itemicon1 = new ImageView(this);
        itemicon1.setImageDrawable(getResources().getDrawable(R.drawable.ic_beach));
        SubActionButton button1 = itemBuilder.setContentView(itemicon1).build();

        ImageView itemicon2 = new ImageView(this);
        itemicon2.setImageDrawable(getResources().getDrawable(R.drawable.ic_cake));
        SubActionButton button2 = itemBuilder.setContentView(itemicon2).build();

        ImageView itemicon3 = new ImageView(this);
        itemicon3.setImageDrawable(getResources().getDrawable(R.drawable.ic_fav));
        SubActionButton button3 = itemBuilder.setContentView(itemicon3).build();

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this).addSubActionView(button1).addSubActionView(button2).addSubActionView(button3).attachTo(actionButton).build();
    }
}
