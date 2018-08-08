package c.citizencenter.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity
{
    ImageSwitcher imageSwitcher;
    NumberPicker numberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });

        numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(100);
        numberPicker.setMinValue(0);
        numberPicker.setWrapSelectorWheel(true);
    }

    public void next(View view) {
        imageSwitcher.setImageResource(R.drawable.ic_launcher_background);
    }

    public void back(View view) {
        imageSwitcher.setImageResource(R.drawable.ic_launcher_foreground);
    }
}
