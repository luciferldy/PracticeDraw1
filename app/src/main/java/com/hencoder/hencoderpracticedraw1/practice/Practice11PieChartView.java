package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private static final String[] CATEGORIES = {"Lollipop", "Marshmallow", "Froyo",
            "Gingerbread", "IceCream\nSandwich", "Jelly Bean", "KitKat"};
    Paint paint = new Paint();
    Paint linePaint = new Paint();
    Paint textPaint = new Paint();
    Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int width = getWidth();
        int height = getHeight();

        int radius = 300;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        // 向上，向左偏移 20 以突出
        canvas.drawArc(width/2 - radius - 20, height/2 - radius - 20, width/2 + radius - 20, height/2 + radius - 20, -180, 135, true, paint);
        path.moveTo(width/2 - 213 - 20, height/2 - 213 - 20);
        path.rLineTo(-20, -20);
        path.rLineTo(-150, 0);
        linePaint.setStyle(Paint.Style.STROKE);
        linePaint.setStrokeWidth(5);
        linePaint.setColor(Color.GRAY);
        canvas.drawPath(path, linePaint);
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(22);
        canvas.drawText(CATEGORIES[0], width/2 - 213 -20 - 20 - 150 - 100, height/2 - 213 - 20 - 20, textPaint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(width/2 - radius, height/2 - radius, width/2 + radius, height/2 + radius,
                -45, 45, true, paint);
        path.reset();
        path.moveTo(width/2 + 282, height/2 - 102);
        path.rLineTo(30, -30);
        path.rLineTo(80, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[1], width/2 + 282 + 30 + 80 + 5, height/2 - 102 - 30, textPaint);

        path.reset();
        path.moveTo(width/2 + 300, height/2 + 2);
        path.rLineTo(90, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[2], width/2 + 300 + 90 + 5, height/2 + 2, textPaint);

        paint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(width/2 - radius, height/2 - radius, width/2 + radius, height/2 + radius,
                2, 10, true, paint);
        path.reset();
        path.moveTo(width/2 + 299, height/2 + 48);
        path.rLineTo(10, 0);
        path.rLineTo(20, 20);
        path.rLineTo(61, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[3], width/2 + 299 + 10 + 20 + 61 + 5, height/2 + 48 + 20, textPaint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(width/2 - radius, height/2 - radius, width/2 + radius, height/2 + radius,
                14, 10, true, paint);
        path.reset();
        path.moveTo(width/2 + 284, height/2 + 113);
        path.rLineTo(10, 0);
        path.rLineTo(20, 20);
        path.rLineTo(76, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[4], width/2 + 284 + 10 + 20 + 76 + 5, height/2 + 113 + 20, textPaint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(width/2 - radius, height/2 - radius, width/2 + radius, height/2 + radius,
                26, 45, true, paint);
        path.reset();
        path.moveTo(width/2 + 200, height/2 + 234);
        path.rLineTo(20, 20);
        path.rLineTo(170, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[5], width/2 + 200 + 20 + 170 + 5, height/2 + 234 + 20, textPaint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(width/2 - radius, height/2 - radius, width/2 + radius, height/2 + radius,
                73, 107, true, paint);
        path.reset();
        path.moveTo(width/2 - 200, height/2 + 238);
        path.rLineTo(-20, 20);
        path.rLineTo(-185, 0);
        canvas.drawPath(path, linePaint);
        canvas.drawText(CATEGORIES[6], width/2 - 200 - 20 - 185 - 100, height/2 + 238 + 20, textPaint);

    }
}
