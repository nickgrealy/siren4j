/*******************************************************************************************
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2013 Erik R Serating
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *********************************************************************************************/
package com.google.code.siren4j.condition;

import com.google.code.siren4j.error.Siren4JRuntimeException;
import com.google.code.siren4j.util.ComponentUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @author Erik
 *
 */
public class NotEmptyCondition implements Condition {

    /* (non-Javadoc)
     * @see com.google.code.siren4j.condition.Condition#evaluate(java.lang.Object)
     */
    public boolean evaluate(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean result = true;
        if (obj instanceof String) {
            result = StringUtils.isNotEmpty((String) obj);
        } else if (obj instanceof Collection<?>) {
            result = !((Collection<?>) obj).isEmpty();
        } else if (obj instanceof Map<?, ?>) {
            result = !((Map<?, ?>) obj).isEmpty();
        } else if (obj instanceof Object[]) {
            result = ArrayUtils.isNotEmpty((Object[]) obj);
        } else if (ComponentUtils.isNumeric(obj)) {
            result = ((Number) obj).intValue() != 0;
        } else if (obj instanceof Boolean) {
            throw new Siren4JRuntimeException(
                    "Unsupported value type for 'NOTEMPTY' condition: Boolean");
        }
        return result;
    }

}
