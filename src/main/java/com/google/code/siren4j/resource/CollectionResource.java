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

import com.google.code.siren4j.annotations.Siren4JEntity;
import com.google.code.siren4j.annotations.Siren4JInclude;
import com.google.code.siren4j.annotations.Siren4JInclude.Include;
import com.google.code.siren4j.annotations.Siren4JSubEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Class representing a collection of resources.
 */

@Siren4JEntity(name = "siren4J.collectionResource")
public class CollectionResource<T> extends BaseResource implements Collection<T> {
    @Siren4JSubEntity(rel = "item")
    private Collection<T> items = new ArrayList<T>();
    private long offset;
    private long limit;
    @Siren4JInclude(Include.NON_NULL)
    private Long total;

    public Collection<T> getItems() {
        return getCollection();
    }

    public void setItems(Collection<T> items) {
        this.items = items;
    }

    public void clear() {
        if (items != null) {
            items.clear();
        }
    }

    public boolean isEmpty() {
        return getCollection().isEmpty();
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int size() {
        return getCollection().size();
    }

    public boolean contains(Object o) {
        return getCollection().contains(o);
    }

    public Iterator<T> iterator() {
        return getCollection().iterator();
    }

    public Object[] toArray() {
        return getCollection().toArray();
    }

    @SuppressWarnings("hiding")
    public <T> T[] toArray(T[] a) {
        return getCollection().toArray(a);
    }

    public boolean remove(Object o) {
        return getCollection().remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return getCollection().containsAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return getCollection().removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return getCollection().retainAll(c);
    }

    public boolean add(T e) {
        return getCollection().add(e);
    }

    public boolean addAll(Collection<? extends T> c) {
        return getCollection().addAll(c);
    }

    private Collection<T> getCollection() {
        if (items == null) {
            items = new ArrayList<T>();
        }
        return items;
    }
}
