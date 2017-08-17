package calendar;

import android.content.Context;
import android.support.annotation.StyleRes;
import android.widget.CalendarView;

import java.util.Calendar;


public class CalendarViewMaterialDelegate extends AbstractCalendarViewDelegate {

    private calendar.CalendarView.OnDateChangeListener mOnDateChangeListener;

    public final DayPickerView.OnDaySelectedListener mOnDaySelectedListener = new DayPickerView.OnDaySelectedListener() {

        @Override
        public void onDaySelected(DayPickerView view, java.util.Calendar day) {
            if (mOnDateChangeListener != null) {
                final int year = day.get(Calendar.YEAR);
                final int month = day.get(Calendar.MONTH);
                final int dayOfMonth = day.get(Calendar.DAY_OF_MONTH);
                mOnDateChangeListener.onSelectedDayChange(mDelegator, year, month, dayOfMonth);
            }
        }
    };

    public CalendarViewMaterialDelegate(final calendar.CalendarView delegator, Context context) {
        super(delegator, context);
        DayPickerView mDayPickerView = new DayPickerView(context);
        mDayPickerView.setOnDaySelectedListener(mOnDaySelectedListener);
        delegator.addView(mDayPickerView);
    }

    @Override
    public int getUnfocusedMonthDateColor() {
        return 0;
    }

    @Override
    public void setWeekDayTextAppearance(@StyleRes int resourceId) {

    }

    @Override
    public int getWeekDayTextAppearance() {
        return 0;
    }

    @Override
    public void setDateTextAppearance(@StyleRes int resourceId) {

    }

    @Override
    public int getDateTextAppearance() {
        return 0;
    }

    @Override
    public void setMinDate(long minDate) {

    }

    @Override
    public long getMinDate() {
        return 0;
    }

    @Override
    public void setMaxDate(long maxDate) {

    }

    @Override
    public long getMaxDate() {
        return 0;
    }

    @Override
    public void setFirstDayOfWeek(int firstDayOfWeek) {

    }

    @Override
    public int getFirstDayOfWeek() {
        return 0;
    }

    @Override
    public void setDate(long date) {

    }

    @Override
    public void setDate(long date, boolean animate, boolean center) {

    }

    @Override
    public long getDate() {
        return 0;
    }

    @Override
    public void setOnDateChangeListener(CalendarView.OnDateChangeListener listener) {

    }
}

