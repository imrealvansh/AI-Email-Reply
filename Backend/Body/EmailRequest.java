package com.email.writer.Body;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
