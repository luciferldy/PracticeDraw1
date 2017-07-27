package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private final String[] CATEGORIES = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    private final float[] PERCENT = {0.0208f, 0.05f, 0.0417f, 0.417f, 0.75f, 0.875f, 0.375f};
    private Paint paint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        // 840*480, distance 24 pixel
        int dw = 840;
        int dh = 480;
        int height = getHeight();
        int width = getWidth();

        // 坐标系
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(width/2 - dw/2, height/2 + dh/2, width/2 + dw/2, height/2 + dh/2, paint);
        canvas.drawLine(width/2 - dw/2, height/2 + dh/2, width/2 - dw/2, height/2 - dh/2, paint);

        // 圆柱宽度
        int distance = 24;
        int rw = (dw - distance * (CATEGORIES.length + 1)) / CATEGORIES.length;
        int startX = width/2 - dw/2;
        int startY = height/2 + dh/2;

        paint.setColor(Color.GREEN);
        for (int i = 0; i < CATEGORIES.length; i++) {
            canvas.drawRect(startX + distance + rw * i + distance * i,
                    startY - dh * PERCENT[i],
                    startX + distance + rw * i + distance * i + rw,
                    startY, paint);
        }

        // 写字
        paint.setTextSize(22);
        paint.setColor(Color.WHITE);
        for (int i = 0; i < CATEGORIES.length; i++) {
            canvas.drawText(CATEGORIES[i], startX + distance + rw * i + distance * i + rw/5, startY + 30, paint);
        }

    }
}
