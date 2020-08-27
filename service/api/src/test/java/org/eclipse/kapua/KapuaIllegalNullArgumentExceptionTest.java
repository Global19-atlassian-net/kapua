/*******************************************************************************
 * Copyright (c) 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua;

import org.eclipse.kapua.qa.markers.junit.JUnitTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(JUnitTests.class)
public class KapuaIllegalNullArgumentExceptionTest extends Assert {

    String[] argumentName;

    @Before
    public void initialize() {
        argumentName = new String[]{"Argument Name", null};
    }

    @Test
    public void kapuaIllegalNullArgumentExceptionTest() {
        for (String name : argumentName) {
            KapuaIllegalNullArgumentException kapuaIllegalNullArgumentException = new KapuaIllegalNullArgumentException(name);
            assertEquals("Expected and actual values should be the same.", KapuaErrorCodes.ILLEGAL_NULL_ARGUMENT, kapuaIllegalNullArgumentException.getCode());
            assertEquals("Expected and actual values should be the same.", name, kapuaIllegalNullArgumentException.getArgumentName());
            assertNull("Null expected.", kapuaIllegalNullArgumentException.getArgumentValue());
            assertNull("Null expected.", kapuaIllegalNullArgumentException.getCause());
            assertEquals("Expected and actual values should be the same.", "An illegal null value was provided for the argument " + name + ".", kapuaIllegalNullArgumentException.getMessage());
        }
    }

    @Test(expected = KapuaIllegalNullArgumentException.class)
    public void throwingExceptionTest() throws KapuaIllegalNullArgumentException {
        for (String name : argumentName) {
            throw new KapuaIllegalNullArgumentException(name);
        }
    }
}  