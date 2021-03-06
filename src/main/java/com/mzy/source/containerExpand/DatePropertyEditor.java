package com.mzy.source.containerExpand;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {
    private String format = "yyyy-MM-dd";
    public void setFormat(String format) {
        this.format = format;
    }
    @Override
    public void setAsText(String arg0) throws IllegalArgumentException {
        System.out.println("arg0: " + arg0);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date d = sdf.parse(arg0);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
