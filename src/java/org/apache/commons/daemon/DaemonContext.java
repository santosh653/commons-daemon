/*
 *  Copyright 2001-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.commons.daemon;


/**
 * Defines a set of methods that a Daemon instance can use to
 * communicate with the Daemon container.
 *
 * @author Pier Fumagalli
 * @author Copyright &copy; 2000-2001 <a href="http://www.apache.org/">The
 *         Apache Software Foundation</a>. All rights reserved.
 * @version 1.0 <i>(CVS $Revision: 1.4 $)</i>
 */
public interface DaemonContext {

    /**
     * Returns  <code>DaemonController</code> object that can be used
     * to control the <code>Daemon</code> instance that this
     * <code>DaemonContext</code> is passed to.
     */
    public DaemonController getController();

    /**
     * Returns an array of <code>String</code> arguments supplied by
     * the environment.  corresponding to the array of arguments given
     * in the <code>public static void main()</code> method used as an
     * entry point to most other java programs.
     */
    public String[] getArguments();

}
