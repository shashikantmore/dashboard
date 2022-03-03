package com.sm.dashboard.domain.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {

    String firstname;

    String lastname;

    String email;

}
