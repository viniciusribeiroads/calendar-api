package com.holidaycalendar.holidaycalendar.dto;

import com.holidaycalendar.holidaycalendar.entity.UserRole;

public record RegisterDTO(String login, String password, String role) {
}
