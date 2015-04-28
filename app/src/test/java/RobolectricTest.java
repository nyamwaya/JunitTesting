import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import com.powermoves.aleckson.understatement.MainActivity;
import com.powermoves.aleckson.understatement.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by aleckson on 4/27/2015.
 */

@RunWith(CustomRobolectricRunner.class)
public class RobolectricTest {

    private Activity mActivity;
    private Button mButton;
    private TextView mTextView;


    @Before
    public void setup() {
        mActivity = Robolectric.buildActivity(
                MainActivity.class).create().get();
        mButton = (Button) mActivity.findViewById(R.id.hi);
        mTextView = (TextView) mActivity.findViewById(R.id.text_view);
    }

    @Test
    public void testForTextViewTextToBeChangedAfterClick() {
        mButton.performClick();

        String text = mTextView.getText().toString();
        assertThat(text, equalTo("After click!"));
    }




}
