package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    Paint paint = new Paint();
    Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        // 284*284
        int height = getHeight();
        int width = getWidth();
        paint.setAntiAlias(true);

        path.addArc(width/2-142, height/2-142, width/2, height/2, -225, 225);
        path.arcTo(width/2, height/2-142, width/2+142, height/2, -180, 225, false);
        path.lineTo(width/2, height/2+120);

        canvas.drawPath(path, paint);
    }
}
