package ssm.learning.session3task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button show_name_button=(Button)findViewById(R.id.show_name_button);
        show_name_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name_text=findViewById(R.id.name_text);
                Toast.makeText(MainActivity.this,"Your name is : "+name_text.getText(),Toast.LENGTH_LONG).show();
            }
        });

        Button toggleDrawerButton=(Button)findViewById(R.id.toggle_drawer);
        toggleDrawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
                if(drawerLayout.isOpen())
                {
                    drawerLayout.close();
                }
                else
                    drawerLayout.open();
            }
        });

        Button loadGoogleButton=(Button)findViewById(R.id.load_google);
        loadGoogleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView webView=(WebView)findViewById(R.id.web_view);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.google.com");
            }
        });

        Button loadVideoButton=(Button)findViewById(R.id.load_video);
        loadVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView videoView=(VideoView)findViewById(R.id.video_view);
                String videoUrl="https://hw2.cdn.asset.aparat.com/aparat-video/a840a8ca7680ceec8f73ce313d73643e26731211-480p.mp4";
                videoView.setMediaController(new MediaController(MainActivity.this));
                videoView.setVideoURI(Uri.parse(videoUrl));
                videoView.start();


            }
        });

        TextView webViewTitle=(TextView)findViewById(R.id.web_view_title);
        webViewTitle.setText(HtmlCompat.fromHtml("<h2>Web View Sample</h2></h2><p>From Html Compact</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));

        TextView videoViewTitle=(TextView)findViewById(R.id.video_view_title);
        videoViewTitle.setText(HtmlCompat.fromHtml("<h2>Vide View Sample</h2><p>From Html Compact</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));

        TextView customViewTitle=(TextView)findViewById(R.id.cuttom_view_title);
        customViewTitle.setText(HtmlCompat.fromHtml("<h2>Creating custom view by extending TextView and set type face to vazir font and show some farsi poem</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));


    }
}