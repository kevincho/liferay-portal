/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.taglib.ui;

import com.liferay.taglib.util.IncludeTag;

import java.text.Format;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Brian Wing Shun Chan
 */
public class InputFieldTag extends IncludeTag {

	public void setBean(Object bean) {
		_bean = bean;
	}

	public void setCssClass(String cssClass) {
		_cssClass = cssClass;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		_defaultLanguageId = defaultLanguageId;
	}

	public void setDefaultValue(Object defaultValue) {
		_defaultValue = defaultValue;
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;
	}

	public void setField(String field) {
		_field = field;
	}

	public void setFieldParam(String fieldParam) {
		_fieldParam = fieldParam;
	}

	public void setFormat(Format format) {
		_format = format;
	}

	public void setFormName(String formName) {
		_formName = formName;
	}

	public void setIgnoreRequestValue(boolean ignoreRequestValue) {
		_ignoreRequestValue = ignoreRequestValue;
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public void setModel(Class<?> model) {
		_model = model;
	}

	public void setPlaceholder(String placeholder) {
		_placeholder = placeholder;
	}

	@Override
	protected void cleanUp() {
		_bean = null;
		_cssClass = null;
		_defaultLanguageId = null;
		_defaultValue = null;
		_disabled = false;
		_field = null;
		_fieldParam = null;
		_format = null;
		_formName = "fm";
		_ignoreRequestValue = false;
		_languageId = null;
		_model = null;
		_placeholder = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("liferay-ui:input-field:bean", _bean);
		request.setAttribute("liferay-ui:input-field:cssClass", _cssClass);
		request.setAttribute(
			"liferay-ui:input-field:defaultLanguageId", _defaultLanguageId);
		request.setAttribute(
			"liferay-ui:input-field:defaultValue", _defaultValue);
		request.setAttribute(
			"liferay-ui:input-field:disabled", String.valueOf(_disabled));
		request.setAttribute("liferay-ui:input-field:field", _field);
		request.setAttribute("liferay-ui:input-field:fieldParam", _fieldParam);
		request.setAttribute("liferay-ui:input-field:format", _format);
		request.setAttribute("liferay-ui:input-field:formName", _formName);
		request.setAttribute(
			"liferay-ui:input-field:ignoreRequestValue",
			String.valueOf(_ignoreRequestValue));
		request.setAttribute("liferay-ui:input-field:languageId", _languageId);
		request.setAttribute("liferay-ui:input-field:model", _model.getName());
		request.setAttribute(
			"liferay-ui:input-field:placeholder", _placeholder);
	}

	private static final String _PAGE = "/html/taglib/ui/input_field/page.jsp";

	private Object _bean;
	private String _cssClass;
	private String _defaultLanguageId;
	private Object _defaultValue;
	private boolean _disabled;
	private String _field;
	private String _fieldParam;
	private Format _format;
	private String _formName = "fm";
	private boolean _ignoreRequestValue;
	private String _languageId;
	private Class<?> _model;
	private String _placeholder;

}