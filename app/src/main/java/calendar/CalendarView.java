package calendar;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarView extends FrameLayout {
    private static final String LOG_TAG = "CalendarView";

    /**
     * The callback used to indicate the user changes the date.
     */
    public interface OnDateChangeListener {
        /**
         * Called upon change of the selected day.
         *
         * @param view       The view associated with this listener.
         * @param year       The year that was set.
         * @param month      The month that was set [0-11].
         * @param dayOfMonth The day of the month that was set.
         */
        void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth);
    }

    private CalendarViewDelegate mDelegate;

    public CalendarView(@NonNull Context context) {
        super(context);
        init();
    }

    public CalendarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CalendarView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CalendarView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();

    }

    private void init() {
        mDelegate = new CalendarViewMaterialDelegate(this, getContext());
    }

    /** String for parsing dates. */
    private static final String DATE_FORMAT = "MM/dd/yyyy";

    /** Date format for parsing dates. */
    private static final DateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);

    /**
     * Utility method for the date format used by CalendarView's min/max date.
     *
     * @hide Use only as directed. For internal use only.
     */
    public static boolean parseDate(String date, Calendar outDate) {
        if (date == null || date.isEmpty()) {
            return false;
        }

        try {
            final Date parsedDate = DATE_FORMATTER.parse(date);
            outDate.setTime(parsedDate);
            return true;
        } catch (ParseException e) {
            Log.w(LOG_TAG, "Date: " + date + " not in format: " + DATE_FORMAT);
            return false;
        }
    }
}
