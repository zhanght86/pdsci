package com.pinde.sci.enums.edu;

import com.pinde.core.commom.GeneralEnum;
import com.pinde.core.util.EnumUtil;

public enum EduCollectionTypeEnum implements GeneralEnum<String> {
	
	Course("Course","�γ�"),
	Chapter("Chapter","�½�")
	;

	private final String id;
	private final String name;
	
	EduCollectionTypeEnum(String id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public static String getNameById(String id) {
		return EnumUtil.getById(id, EduCollectionTypeEnum.class).getName();
	}
}
