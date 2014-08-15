/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-web.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.redhat.darcy.web.api.elements;

import com.redhat.darcy.ui.api.elements.Element;
import com.redhat.darcy.ui.api.elements.HasAttributes;

import java.util.Set;

/**
 * Elements that wrap specific elements in an HTML document are expected to implement this
 * interface, which gives clients API's to access attributes and other HTML specifics about the
 * element.
 */
public interface HtmlElement extends Element, HasAttributes {
    /**
     * @return The actual HTML tag of the element this refers to.
     */
    String getTagName();

    /**
     * Retrieves the CSS value of a given property for the element this refers to.
     *
     * Depending on the implementation, color values like, "green," may be returned "rgba"
     * formatted. Additionally, shorthand properties may not be returned.
     */
    String getCssValue(String property);

    /**
     * Organizes the space delimited list of CSS classes for the element this refers to into a set.
     */
    Set<String> getClasses();
}