package calendar;


import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.ColorInt;

import java.util.Locale;

/**
 * An abstract class which can be used as a start for CalendarView implementations
 */

abstract class AbstractCalendarViewDelegate implements CalendarViewDelegate {

    /**
     * The default minimal date.
     */
    protected static final String DEFAULT_MIN_DATE = "01/01/1900";

    /**
     * The default maximal date.
     */
    protected static final String DEFAULT_MAX_DATE = "01/01/2100";

    public CalendarView mDelegator;
    protected Context mContext;
    protected Locale mCurrentLocale;

    AbstractCalendarViewDelegate(CalendarView delegator, Context context) {
        mDelegator = delegator;
        mContext = context;

        // Initialization based on locale
        setCurrentLocale(Locale.getDefault());
    }

    protected void setCurrentLocale(Locale locale) {
        if (locale.equals(mCurrentLocale)) {
            return;
        }
        mCurrentLocale = locale;
    }


    @ColorInt
    @Override
    public int getSelectedWeekBackgroundColor() {
        return 0;
    }

    @ColorInt
    @Override
    public int getFocusedMonthDateColor() {
        return 0;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // Nothing to do here, configuration changes are already propagated
        // by ViewGroup.
    }
}
