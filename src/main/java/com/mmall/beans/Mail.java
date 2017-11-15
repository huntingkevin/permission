package com.mmall.beans;

import lombok.*;

import java.util.Set;

/**
 * Created by ruhonglin on 2017/11/15.
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    private String subject;

    private String message;

    private Set<String> receivers;
}
