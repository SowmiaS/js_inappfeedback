package inappfeedback.imp.com.inappfeedback.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import inappfeedback.imp.com.imp_inappfeedback.R;
import inappfeedback.imp.com.inappfeedback.utils.AndroidBaseUtils;

/**
 * Created by sowmia on 17/12/15.
 */
public class JSMainOptionsView extends LinearLayout implements View.OnClickListener{

    private IMPINstaBugMainOptionsActions mImpInstaBugMainOptionsAction;

    private JSMainOptionsView(Context context) {
        super(context);
        init(context);
    }

    public JSMainOptionsView(Context context, IMPINstaBugMainOptionsActions mImpInstaBugMainOptionsAction) {
        super(context);
        init(context);
        this.mImpInstaBugMainOptionsAction = mImpInstaBugMainOptionsAction;
    }


    private JSMainOptionsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private JSMainOptionsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setOrientation(VERTICAL);
        AndroidBaseUtils.inflateLayout(context, R.layout.imp_instabug_mainoptions, this);
        setClickListeners();
    }

    private void setClickListeners() {
        findViewById(R.id.txt_instabug_mainoptions_reportbug).setOnClickListener(this);
        findViewById(R.id.txt_instabug_mainoptions_feedback).setOnClickListener(this);
        findViewById(R.id.txt_instabug_mainoptions_dismiss).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("IMP_InstaBug","Report a Bug");
        if(v.getId() == R.id.txt_instabug_mainoptions_reportbug){
            Log.d("IMP_InstaBug","Report a Bug");
            if(mImpInstaBugMainOptionsAction !=null){
                mImpInstaBugMainOptionsAction.onClickOfReportBug();
            }
        }else if(v.getId() == R.id.txt_instabug_mainoptions_feedback){
            Log.d("IMP_InstaBug","FeedBack");

            if(mImpInstaBugMainOptionsAction !=null){
                mImpInstaBugMainOptionsAction.onClickOfFeedBack();
            }
        }else if(v.getId() == R.id.txt_instabug_mainoptions_dismiss){
            Log.d("IMP_InstaBug","Dismiss");
            if(mImpInstaBugMainOptionsAction !=null){
                mImpInstaBugMainOptionsAction.onClickOfDismiss();
            }
        }
    }


    public interface IMPINstaBugMainOptionsActions{
        public void onClickOfReportBug();
        public void onClickOfFeedBack();
        public void onClickOfDismiss();
    }
}
