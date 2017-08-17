package calendar;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * This displays a list of months in a calendar format with selectable days.
 */
class DayPickerViewPager extends ViewPager {

    private final ArrayList<View> mMatchParentChildren = new ArrayList<>(1);

    public DayPickerViewPager(Context context) {
        super(context);
    }

    public DayPickerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        setCurrentItem(0);
//        //   populate();
//        // Everything below is mostly copied from FrameLayout.
//        int count = getChildCount();
//        final boolean measureMatchParentChildren =
//                MeasureSpec.getMode(widthMeasureSpec) != MeasureSpec.EXACTLY ||
//                        MeasureSpec.getMode(heightMeasureSpec) != MeasureSpec.EXACTLY;
//        int maxHeight = 0;
//        int maxWidth = 0;
//        int childState = 0;
//        for (int i = 0; i < count; i++) {
//            final View child = getChildAt(i);
//            if (child.getVisibility() != GONE) {
//                measureChild(child, widthMeasureSpec, heightMeasureSpec);
//                final LayoutParams lp = (LayoutParams) child.getLayoutParams();
//                maxWidth = Math.max(maxWidth, child.getMeasuredWidth());
//                maxHeight = Math.max(maxHeight, child.getMeasuredHeight());
//                childState = combineMeasuredStates(childState, child.getMeasuredState());
//                if (measureMatchParentChildren) {
//                    if (lp.width == LayoutParams.MATCH_PARENT ||
//                            lp.height == LayoutParams.MATCH_PARENT) {
//                        mMatchParentChildren.add(child);
//                    }
//                }
//            }
//        }
//        // Account for padding too
//        maxWidth += getPaddingLeft() + getPaddingRight();
//        maxHeight += getPaddingTop() + getPaddingBottom();
//        // Check against our minimum height and width
//        maxHeight = Math.max(maxHeight, getSuggestedMinimumHeight());
//        maxWidth = Math.max(maxWidth, getSuggestedMinimumWidth());
//        // Check against our foreground's minimum height and width
//        final Drawable drawable;
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
//            drawable = getForeground();
//            if (drawable != null) {
//                maxHeight = Math.max(maxHeight, drawable.getMinimumHeight());
//                maxWidth = Math.max(maxWidth, drawable.getMinimumWidth());
//            }
//        }
//
//        setMeasuredDimension(resolveSizeAndState(maxWidth, widthMeasureSpec, childState),
//                resolveSizeAndState(maxHeight, heightMeasureSpec,
//                        childState << MEASURED_HEIGHT_STATE_SHIFT));
//        count = mMatchParentChildren.size();
//        if (count > 1) {
//            for (int i = 0; i < count; i++) {
//                final View child = mMatchParentChildren.get(i);
//                final LayoutParams lp = (LayoutParams) child.getLayoutParams();
//                final int childWidthMeasureSpec;
//                final int childHeightMeasureSpec;
//                if (lp.width == LayoutParams.MATCH_PARENT) {
//                    childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(
//                            getMeasuredWidth() - getPaddingLeft() - getPaddingRight(),
//                            MeasureSpec.EXACTLY);
//                } else {
//                    childWidthMeasureSpec = getChildMeasureSpec(widthMeasureSpec,
//                            getPaddingLeft() + getPaddingRight(),
//                            lp.width);
//                }
//                if (lp.height == LayoutParams.MATCH_PARENT) {
//                    childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(
//                            getMeasuredHeight() - getPaddingTop() - getPaddingBottom(),
//                            MeasureSpec.EXACTLY);
//                } else {
//                    childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec,
//                            getPaddingTop() + getPaddingBottom(),
//                            lp.height);
//                }
//                child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
//            }
//        }
//        mMatchParentChildren.clear();
//    }

//    @Override
//    protected View findViewByPredicateTraversal(Predicate<View> predicate, View childToSkip) {
//        if (predicate.test(this)) {
//            return this;
//        }
//        // Always try the selected view first.
//        final DayPickerPagerAdapter adapter = (DayPickerPagerAdapter) getAdapter();
//        final SimpleMonthView current = adapter.getView(getCurrent());
//        if (current != childToSkip && current != null) {
//            final View v = current.findViewByPredicate(predicate);
//            if (v != null) {
//                return v;
//            }
//        }
//        final int len = getChildCount();
//        for (int i = 0; i < len; i++) {
//            final View child = getChildAt(i);
//            if (child != childToSkip && child != current) {
//                final View v = child.findViewByPredicate(predicate);
//                if (v != null) {
//                    return v;
//                }
//            }
//        }
//        return null;
//    }
}