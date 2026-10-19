package com.ram.home.java21.features.patterns;

import java.util.List;

public class SwitchPatterns {
    public String processPayload(Object obj) {
        return switch (obj) {
            case null -> "Payload is empty";
            case Integer i -> "Numeric ID: " + i;
            case String s when s.isBlank() -> "Empty string payload";
            case String s -> "Text: " + s.trim();
            case List<?> list when list.size() > 100 -> "Large batch processing";
            default -> "Unsupported format: " + obj.toString();
        };
    }

    public static void main(String[] args) {
        SwitchPatterns patterns = new SwitchPatterns();
        System.out.println(patterns.processPayload(null));
        System.out.println(patterns.processPayload(123));
        System.out.println(patterns.processPayload("   "));
        System.out.println(patterns.processPayload("Hello"));
        System.out.println(patterns.processPayload(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)));
        System.out.println(patterns.processPayload(new Object()));
    }
}
