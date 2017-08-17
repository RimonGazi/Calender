package calendar;

import android.content.res.Configuration;
import android.support.annotation.ColorInt;
import android.support.annotation.StyleRes;
import android.widget.CalendarView;

/**
 * A delegate interface that defined the public API of the CalendarView. Allows different
 * CalendarView implementations. This would need to be implemented by the CalendarView delegates
 * for the real behavior.
 */
public interface CalendarViewDelegate {


    @ColorInt int getSelectedWeekBackgroundColor();

    @ColorInt int getFocusedMonthDateColor();

    @ColorInt int getUnfocusedMonthDateColor();


    void setWeekDayTextAppearance(@StyleRes int resourceId);
    @StyleRes int getWeekDayTextAppearance();

    void setDateTextAppearance(@StyleRes int resourceId);
    @StyleRes int getDateTextAppearance();

    void setMinDate(long minDate);
    long getMinDate();

    void setMaxDate(long maxDate);
    long getMaxDate();

    void setFirstDayOfWeek(int firstDayOfWeek);
    int getFirstDayOfWeek();

    void setDate(long date);
    void setDate(long date, boolean animate, boolean center);
    long getDate();

    void setOnDateChangeListener(CalendarView.OnDateChangeListener listener);

    void onConfigurationChanged(Configuration newConfig);
}
