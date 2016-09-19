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
package com.google.code.siren4j.resource;

import com.google.code.siren4j.annotations.Siren4JPropertyIgnore;
import com.google.code.siren4j.component.Action;
import com.google.code.siren4j.component.Link;

import java.util.Collection;


public abstract class BaseResource implements Resource {

    @Siren4JPropertyIgnore
    protected String overrideUri;
    @Siren4JPropertyIgnore
    protected Boolean overrideEmbeddedLink;
    @Siren4JPropertyIgnore
    protected Collection<Link> entityLinks;
    @Siren4JPropertyIgnore
    protected Collection<Action> entityActions;
    @Siren4JPropertyIgnore
    protected Boolean fullyQualified;
    @Siren4JPropertyIgnore
    protected String baseUri;

    public void setOverrideUri(String uri) {
        overrideUri = uri;
    }

    public String getOverrideUri() {
        return overrideUri;
    }

    public void setOverrideEmbeddedLink(Boolean isEmbeddedLink) {
        overrideEmbeddedLink = isEmbeddedLink;
    }

    public Boolean getOverrideEmbeddedLink() {
        return overrideEmbeddedLink;
    }

    public Collection<Link> getEntityLinks() {
        return entityLinks;
    }

    public void setEntityLinks(Collection<Link> entityLinks) {
        this.entityLinks = entityLinks;
    }

    public Collection<Action> getEntityActions() {
        return entityActions;
    }

    public void setEntityActions(Collection<Action> entityActions) {
        this.entityActions = entityActions;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public Boolean isFullyQualifiedLinks() {
        return fullyQualified;
    }

    public void setFullyQualifiedLinks(Boolean fullyQualified) {
        this.fullyQualified = fullyQualified;
    }


}
