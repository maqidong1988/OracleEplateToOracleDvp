package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeBucket {
    private static final ThreadLocal<DateFormat> FORMATS = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    private final Date start;

    private final Date end;

    public TimeBucket(Date start, Date end) {
        if (start.after(end)) {
            throw new IllegalArgumentException("time bucket is invalid");
        }
        this.start = start;
        this.end = end;
    }

    public TimeBucket(String start, String end) throws ParseException {
        this(parse(start), parse(end));
    }

    public TimeBucket(long startTime, long endTime) {
        this(new Date(startTime), new Date(endTime));
    }

    public static TimeBucket union(TimeBucket... buckets) {
        if (buckets == null || buckets.length == 0) {
            return null;
        }
        if (buckets.length == 1) {
            return buckets[0];
        }
        long start = buckets[0].getStartTime();
        long end = buckets[0].getEndTime();
        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i].getStartTime() > start) {
                start = buckets[i].getStartTime();
            }
            if (buckets[i].getEndTime() < end) {
                end = buckets[i].getEndTime();
            }
        }
        if (start > end) {
            return null;
        }
        return new TimeBucket(start, end);
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public long getStartTime() {
        return start.getTime();
    }

    public long getEndTime() {
        return end.getTime();
    }

    private static Date parse(String str) throws ParseException {
        return FORMATS.get().parse(str);
    }

    private static String format(Date str) {
        return FORMATS.get().format(str);
    }

    @Override
    public String toString() {
        return "startTime=" + format(start) + ", endTime=" + format(end);
    }
}

