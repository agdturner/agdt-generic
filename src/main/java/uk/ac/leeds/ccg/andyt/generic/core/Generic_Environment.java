/*
 * Copyright (C) 2017 geoagdt.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package uk.ac.leeds.ccg.andyt.generic.core;

import uk.ac.leeds.ccg.andyt.generic.io.Generic_Files;

/**
 *
 * @author geoagdt
 */
public class Generic_Environment {

    protected Generic_Files Files;
    protected Generic_Strings Strings;

    protected Generic_Environment() {
    }

    public Generic_Environment(Generic_Files f, Generic_Strings s) {
        Files = f;
        Strings = s;
    }

    public Generic_Files getFiles() {
        if (Files == null) {
//            Files = new Generic_Files();
        }
        return Files;
    }

    public Generic_Strings getStrings() {
        if (Strings == null) {
            Strings = new Generic_Strings();
        }
        return Strings;
    }

}
