package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    Paint paint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        int height = getHeight();
        int width = getWidth();
        paint.setAntiAlias(true);
        // 实心圆
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width/2 - 40 - 140, 140, 140, paint);
        // 空心圆
        // 四个圆使用同一个画笔会导致一些问题，例如第二个空心圆重绘的时候变成了第四个圆的样式
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawCircle(width/2 + 40 + 140, 140, 140, paint);
        // 蓝色实心圆
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(width/2 - 40 - 140, height - 140 - 60, 140, paint);
        // 线宽20的空心圆
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(60);
        canvas.drawCircle(width/2 + 40 + 140, height - 140 - 60, 140, paint);
    }
}
