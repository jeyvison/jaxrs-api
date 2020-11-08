/********************************************************************************
 * Copyright (c) 2019 Jeyvison Nascimento
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 ********************************************************************************/

package jakarta.ws.rs;

import jakarta.ws.rs.core.Response;

/**
 * A runtime exception indicating that the origin server requires the request to be conditional.
 *
 * @author Jeyvison Nascimento
 * @since 3.1
 */
public class PreconditionRequiredException extends ClientErrorException {

    private static final long serialVersionUID = -1800034199793580231L;

    /**
     * Construct a new precondition required exception.
     */
    public PreconditionRequiredException() {
        super(Response.Status.PRECONDITION_REQUIRED);
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     */
    public PreconditionRequiredException(final String message) {
        super(message, Response.Status.PRECONDITION_REQUIRED);
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param response error response.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 428}.
     */
    public PreconditionRequiredException(final Response response) {
        super(validate(response, Response.Status.PRECONDITION_REQUIRED));
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param response error response.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 428}.
     */
    public PreconditionRequiredException(final String message, final Response response) {
        super(message, validate(response, Response.Status.PRECONDITION_REQUIRED));
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param cause the underlying cause of the exception.
     */
    public PreconditionRequiredException(final Throwable cause) {
        super(Response.Status.PRECONDITION_REQUIRED, cause);
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause the underlying cause of the exception.
     */
    public PreconditionRequiredException(final String message, final Throwable cause) {
        super(message, Response.Status.PRECONDITION_REQUIRED, cause);
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param response error response.
     * @param cause the underlying cause of the exception.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 428}.
     */
    public PreconditionRequiredException(final Response response, final Throwable cause) {
        super(validate(response, Response.Status.PRECONDITION_REQUIRED), cause);
    }

    /**
     * Construct a new precondition required exception.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param response error response.
     * @param cause the underlying cause of the exception.
     * @throws IllegalArgumentException in case the status code set in the response is not HTTP {@code 428}.
     */
    public PreconditionRequiredException(final String message, final Response response, final Throwable cause) {
        super(message, validate(response, Response.Status.PRECONDITION_REQUIRED), cause);
    }
}
