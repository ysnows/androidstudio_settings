package ${PACKAGE_NAME};

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.ysnows.base.BView;

/**
 * Created by xianguangjin on 16/6/1.
 * 自定义
 */

public class Widget${name} extends LinearLayout {


    private BView view;


    public Widget${name}(Context context) {
        this(context, null);

    }

    public Widget${name}(Context context, AttributeSet attrs) {
        this(context, attrs, 0);


    }

    public Widget${name}(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);

    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        if (context instanceof BView) {
            this.view = (BView) context;
        }

        inflate(context, R.layout.widget_${layout}, this);
 
    }


}
