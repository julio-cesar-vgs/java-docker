package br.com.spring;

import java.time.OffsetDateTime;
import java.util.UUID;

public class ErrorTeste {
    public Integer get_errorCode() {
        return _errorCode;
    }

    public void set_errorCode(Integer _errorCode) {
        this._errorCode = _errorCode;
    }

    public String get_message() {
        return _message;
    }

    public void set_message(String _message) {
        this._message = _message;
    }

    public String get_detail() {
        return _detail;
    }

    public void set_detail(String _detail) {
        this._detail = _detail;
    }

    public OffsetDateTime get_timestamp() {
        return _timestamp;
    }

    public void set_timestamp(OffsetDateTime _timestamp) {
        this._timestamp = _timestamp;
    }

    public UUID get_traceId() {
        return _traceId;
    }

    public void set_traceId(UUID _traceId) {
        this._traceId = _traceId;
    }

    private Integer _errorCode;
   private String _message;
   private String _detail;
   private OffsetDateTime _timestamp;
   private UUID _traceId;

}
