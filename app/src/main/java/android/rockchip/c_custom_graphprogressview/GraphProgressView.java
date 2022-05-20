package android.rockchip.c_custom_graphprogressview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

public class GraphProgressView extends View {
    public static final String TAG = "hank";
    private Paint mPaint;
    private Context mContent;
    private int mBackground = R.drawable.bg_black_rect_workout_diagram;

    public GraphProgressView(Context context) {
        super(context);
    }

    public GraphProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        Log.v(TAG, "GraphProgressView -> GraphProgressView(Context context, @Nullable AttributeSet attrs)");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.v(TAG, "GraphProgressView -> onDraw()");
    }

    private void initView(Context context) {
        this.mContent = context;
        setBackground(context.getResources().getDrawable(mBackground));
    }


}
