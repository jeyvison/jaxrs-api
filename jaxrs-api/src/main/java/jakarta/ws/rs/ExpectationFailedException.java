/*
 * Copyright (c) 2012, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ws.rs;

import jakarta.ws.rs.core.Response;

/**
 * A runtime exception indicating a request header didn't meet the expectation.
 *
 * @author Jeyvison Nascimento
 * @since 2.0
 */
public class ExpectationFailedException extends ClientErrorException {

    private static final long serialVersionUID = -5664712075944377837L;

    /**
     * Construct a new expectation failed exception.
     */
    public ExpectationFailedException() {
        super(Response.Status.EXPECTATION_FAILED);
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     */
    public ExpectationFailedException(final String message) {
        super(message, Response.Status.EXPECTATION_FAILED);
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param response error response.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 417}.
     */
    public ExpectationFailedException(final Response response) {
        super(validate(response, Response.Status.EXPECTATION_FAILED));
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param response error response.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 417}.
     */
    public ExpectationFailedException(final String message, final Response response) {
        super(message, validate(response, Response.Status.EXPECTATION_FAILED));
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param cause the underlying cause of the exception.
     */
    public ExpectationFailedException(final Throwable cause) {
        super(Response.Status.EXPECTATION_FAILED, cause);
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause the underlying cause of the exception.
     */
    public ExpectationFailedException(final String message, final Throwable cause) {
        super(message, Response.Status.EXPECTATION_FAILED, cause);
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param response error response.
     * @param cause the underlying cause of the exception.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 417}.
     */
    public ExpectationFailedException(final Response response, final Throwable cause) {
        super(validate(response, Response.Status.EXPECTATION_FAILED), cause);
    }

    /**
     * Construct a new expectation failed exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param response error response.
     * @param cause the underlying cause of the exception.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 417}.
     */
    public ExpectationFailedException(final String message, final Response response, final Throwable cause) {
        super(message, validate(response, Response.Status.EXPECTATION_FAILED), cause);
    }
}
