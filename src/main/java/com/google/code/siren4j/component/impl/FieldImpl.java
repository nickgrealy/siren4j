/*******************************************************************************************
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2013 Erik R Serating
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *********************************************************************************************/
package com.google.code.siren4j.component.impl;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.code.siren4j.component.Field;
import com.google.code.siren4j.meta.FieldOption;
import com.google.code.siren4j.meta.FieldType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
public class FieldImpl extends Siren4JBaseComponent implements Field {

    private String name;

    private String title;

    private FieldType type = FieldType.TEXT;

    private String value;

    private Boolean required;

    private String pattern;

    private List<FieldOption> options;

    private String optionsURL;

    @JsonInclude(Include.NON_DEFAULT)
    private Double max = null;

    @JsonInclude(Include.NON_DEFAULT)
    private Double min = null;

    @JsonInclude(Include.NON_DEFAULT)
    private Long maxLength = null;

    private String step;

    private String placeholder;

    private Boolean multiple;

    private Map<String, String> metaData;

    /*
     * (non-Javadoc)
     * 
     * @see com.google.code.siren4j.component.impl.Field#getName()
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.code.siren4j.component.impl.Field#getType()
     */
    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.google.code.siren4j.component.impl.Field#getValue()
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean isRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FieldOption> getOptions() {
        return options;
    }

    public void setOptions(List<FieldOption> options) {
        this.options = options;
    }

    public void addOption(FieldOption option) {
        if (option != null) {
            if (options == null) {
                options = new ArrayList<FieldOption>();
            }
            options.add(option);
        }
    }

    public String getOptionsURL() {
        return optionsURL;
    }

    public void setOptionsURL(String optionsURL) {
        this.optionsURL = optionsURL;
    }

    public Map<String, String> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, String> metaData) {
        this.metaData = metaData;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCodeBuilder.append(name);
        return hashCodeBuilder.toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FieldImpl)) {
            return false;
        }
        FieldImpl other = (FieldImpl) obj;
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        equalsBuilder.append(name, other.name);
        return equalsBuilder.isEquals();
    }


}
