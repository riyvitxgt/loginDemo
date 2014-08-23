package com.king.converter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value,
			Class toType) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(toType == Date.class){
				String[] params = (String[])value;
				
				return sdf.parseObject(params[0]);
			}else if(toType == String.class){
				return sdf.format((Date)value);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
}
