package ru.mtuci.rbpo_2024_praktika.dto;

import java.util.UUID;
//TODO: 1. Интересное решение

public record LicenseActivationRequestDto(String code, UUID deviceId, String deviceName, String mac_address) {
}
