package com.estimate.estimatebackend.dto.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class WrappedResponseDTO<T> {
    private int code;
    private String message;
    private boolean isSuccess;
    private T data;

    public static <T> WrappedResponseDTO<T> success (T data) {
        WrappedResponseDTO wrappedResponseDTO = new WrappedResponseDTO();

        wrappedResponseDTO.setCode(HttpStatus.OK.value());
        wrappedResponseDTO.setSuccess(true);
        wrappedResponseDTO.setMessage(HttpStatus.OK.getReasonPhrase());
        wrappedResponseDTO.setData(data);

        return wrappedResponseDTO;
    }
}
