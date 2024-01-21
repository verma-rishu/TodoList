package com.todoapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Greeting {
    private final UUID id;
    private final String greeting;
}
