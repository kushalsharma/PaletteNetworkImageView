package in.kushalsharma.helloworld;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import in.kushalsharma.palettenetworkimageview.PaletteNetworkImageView;
import in.kushalsharma.utils.AppController;


public class MainActivity extends ActionBarActivity {

    private String URL_1 = "http://kushalsharma.in/21482.jpg";
    private String URL_2 = "http://kushalsharma.in/3590.jpg";
    private String URL_3 = "http://kushalsharma.in/73452.jpg";

    private Toolbar mToolbar;
    private PaletteNetworkImageView mPaletteNetworkImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mPaletteNetworkImageView = (PaletteNetworkImageView) findViewById(R.id.palette_network_image_view);

        final TextView mTextView0 = (TextView) findViewById(R.id.text_view_0);
        final TextView mTextView1 = (TextView) findViewById(R.id.text_view_1);
        final TextView mTextView2 = (TextView) findViewById(R.id.text_view_2);
        final TextView mTextView3 = (TextView) findViewById(R.id.text_view_3);
        final TextView mTextView4 = (TextView) findViewById(R.id.text_view_4);
        final TextView mTextView5 = (TextView) findViewById(R.id.text_view_5);

        final Button mButton1 = (Button) findViewById(R.id.button_1);
        final Button mButton2 = (Button) findViewById(R.id.button_2);
        final Button mButton3 = (Button) findViewById(R.id.button_3);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaletteNetworkImageView.setImageUrl(URL_1, AppController.getInstance().getImageLoader());
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaletteNetworkImageView.setImageUrl(URL_2, AppController.getInstance().getImageLoader());
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPaletteNetworkImageView.setImageUrl(URL_3, AppController.getInstance().getImageLoader());

            }
        });

        mPaletteNetworkImageView.setImageUrl(URL_1, AppController.getInstance().getImageLoader());

        mPaletteNetworkImageView.setResponseObserver(new PaletteNetworkImageView.ResponseObserver() {
            @Override
            public void onSuccess() {

                changeToolbarColor();

                Palette.Swatch mVibrantSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.VIBRANT);
                if (mVibrantSwatch != null) {
                    mTextView0.setText("Vibrant");
                    mTextView0.setTextColor(mVibrantSwatch.getTitleTextColor());
                    mTextView0.setBackgroundColor(mVibrantSwatch.getRgb());
                } else {
                    mTextView0.setText("Vibrant not found");
                    mTextView0.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView0.setBackgroundColor(Color.parseColor("#212121"));
                }

                Palette.Swatch mDarkMutedSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.DARK_MUTED);
                if (mDarkMutedSwatch != null) {
                    mTextView1.setText("Dark Muted");
                    mTextView1.setTextColor(mDarkMutedSwatch.getTitleTextColor());
                    mTextView1.setBackgroundColor(mDarkMutedSwatch.getRgb());
                } else {
                    mTextView1.setText("Dark Muted not found");
                    mTextView1.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView1.setBackgroundColor(Color.parseColor("#212121"));
                }


                Palette.Swatch mDarkVibrantSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.DARK_VIBRANT);
                if (mDarkVibrantSwatch != null) {
                    mTextView2.setText("Dark Vibrant");
                    mTextView2.setTextColor(mDarkVibrantSwatch.getTitleTextColor());
                    mTextView2.setBackgroundColor(mDarkVibrantSwatch.getRgb());
                } else {
                    mTextView2.setText("Dark Vibrant not found");
                    mTextView2.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView2.setBackgroundColor(Color.parseColor("#212121"));
                }

                Palette.Swatch mLightMutedSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.LIGHT_MUTED);
                if (mLightMutedSwatch != null) {
                    mTextView3.setText("Light Muted");
                    mTextView3.setTextColor(mLightMutedSwatch.getTitleTextColor());
                    mTextView3.setBackgroundColor(mLightMutedSwatch.getRgb());
                } else {
                    mTextView3.setText("Light Muted not found");
                    mTextView3.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView3.setBackgroundColor(Color.parseColor("#212121"));
                }

                Palette.Swatch mLightVibrantSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.LIGHT_VIBRANT);
                if (mLightVibrantSwatch != null) {
                    mTextView4.setText("Light Vibrant");
                    mTextView4.setTextColor(mLightVibrantSwatch.getTitleTextColor());
                    mTextView4.setBackgroundColor(mLightVibrantSwatch.getRgb());
                } else {
                    mTextView4.setText("Light Vibrant not found");
                    mTextView4.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView4.setBackgroundColor(Color.parseColor("#212121"));
                }

                Palette.Swatch mMutedSwatch = mPaletteNetworkImageView.getSwatch(PaletteNetworkImageView.MUTED);
                if (mMutedSwatch != null) {
                    mTextView5.setText("Muted");
                    mTextView5.setTextColor(mMutedSwatch.getTitleTextColor());
                    mTextView5.setBackgroundColor(mMutedSwatch.getRgb());
                } else {
                    mTextView5.setText("Muted not found");
                    mTextView5.setTextColor(Color.parseColor("#eeeeee"));
                    mTextView5.setBackgroundColor(Color.parseColor("#212121"));
                }
            }

            @Override
            public void onError() {
                mTextView0.setText("Error!");
            }
        });

    }

    private void changeToolbarColor() {
        mToolbar.setBackgroundColor(mPaletteNetworkImageView.getVibrantColor());
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(mPaletteNetworkImageView.getDarkVibrantColor());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
