/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.core.i18n;

import java.util.List;
import java.util.Locale;

import static griffon.util.GriffonNameUtils.isBlank;

/**
 * @author Andres Almiray
 * @author Alexander Klein
 * @since 1.1.0
 */
public abstract class AbstractMessageSource implements MessageSource {
    protected static final Object[] EMPTY_OBJECT_ARGS = new Object[0];

    public String getMessage(String key) throws NoSuchMessageException {
        return getMessage(key, EMPTY_OBJECT_ARGS, Locale.getDefault());
    }

    public String getMessage(String key, Locale locale) throws NoSuchMessageException {
        return getMessage(key, EMPTY_OBJECT_ARGS, locale);
    }

    public String getMessage(String key, Object[] args) throws NoSuchMessageException {
        return getMessage(key, args, Locale.getDefault());
    }

    public String getMessage(String key, List args) throws NoSuchMessageException {
        return getMessage(key, toObjectArray(args), Locale.getDefault());
    }

    public String getMessage(String key, List args, Locale locale) throws NoSuchMessageException {
        return getMessage(key, toObjectArray(args), locale);
    }

    public String getMessage(String key, String defaultMessage) {
        return getMessage(key, EMPTY_OBJECT_ARGS, defaultMessage, Locale.getDefault());
    }

    public String getMessage(String key, String defaultMessage, Locale locale) {
        return getMessage(key, EMPTY_OBJECT_ARGS, defaultMessage, locale);
    }

    public String getMessage(String key, Object[] args, String defaultMessage) {
        return getMessage(key, args, defaultMessage, Locale.getDefault());
    }

    public String getMessage(String key, Object[] args, String defaultMessage, Locale locale) {
        try {
            return getMessage(key, args, locale);
        } catch (NoSuchMessageException nsme) {
            return isBlank(defaultMessage) ? key : defaultMessage;
        }
    }

    public String getMessage(String key, List args, String defaultMessage) {
        return getMessage(key, toObjectArray(args), defaultMessage, Locale.getDefault());
    }

    public String getMessage(String key, List args, String defaultMessage, Locale locale) {
        return getMessage(key, toObjectArray(args), defaultMessage, locale);
    }

    protected Object[] toObjectArray(List args) {
        if (null == args || args.isEmpty()) {
            return EMPTY_OBJECT_ARGS;
        }
        return args.toArray(new Object[args.size()]);
    }
}