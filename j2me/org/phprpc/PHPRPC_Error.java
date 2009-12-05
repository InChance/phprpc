/**********************************************************\
|                                                          |
| The implementation of PHPRPC Protocol 3.0                |
|                                                          |
| PHPRPC_Error.java                                        |
|                                                          |
| Release 3.0.2                                            |
| Copyright by Team-PHPRPC                                 |
|                                                          |
| WebSite:  http://www.phprpc.org/                         |
|           http://www.phprpc.net/                         |
|           http://www.phprpc.com/                         |
|           http://sourceforge.net/projects/php-rpc/       |
|                                                          |
| Authors:  Ma Bingyao <andot@ujn.edu.cn>                  |
|                                                          |
| This file may be distributed and/or modified under the   |
| terms of the GNU Lesser General Public License (LGPL)    |
| version 3.0 as published by the Free Software Foundation |
| and appearing in the included file LICENSE.              |
|                                                          |
\**********************************************************/

/* PHPRPC_Error class.
 *
 * Copyright: Ma Bingyao <andot@ujn.edu.cn>
 * Version: 3.0.2
 * LastModified: Jan 12, 2008
 * This library is free.  You can redistribute it and/or modify it.
 */

package org.phprpc;

public final class PHPRPC_Error extends Exception {
    private int __errno;
    private String __errstr;
    PHPRPC_Error(int errno, String errstr)
    {
        __errno = errno;
        __errstr = errstr;
    }
    public int getNumber() {
        return __errno;
    }
    public String getMessage() {
        return __errstr;
    }
    public String toString() {
        return __errno + ":" + __errstr;
    }
}