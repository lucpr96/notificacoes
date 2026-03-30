package com.notificacoes_email.notificacoes.infrastructure;

import com.notificacoes_email.notificacoes.business.EmailService;

public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }

    public EmailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
