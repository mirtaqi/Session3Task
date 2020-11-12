package ssm.learning.session3task;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintContextWrapper;

public class PoemTextView extends androidx.appcompat.widget.AppCompatTextView {
    public PoemTextView(Context context) {
        super(context);
        init();

    }
    public PoemTextView(Context context, @Nullable AttributeSet attributeSet)
    {
        super(context,attributeSet);
        init();
    }
    public PoemTextView(
            @NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void  init()
    {
        Typeface vazirFont=Typeface.createFromAsset(getContext().getAssets(),"Vazir.ttf");
        this.setTypeface(vazirFont);
        setText("شراب تلخ می\u200Cخواهم که مردافکن بود زورش\n" +
                "که تا یک دم بیاسایم ز دنیا و شر و شورش");
        
    }
}
