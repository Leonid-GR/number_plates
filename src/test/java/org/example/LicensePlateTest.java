package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LicensePlateTest {

    @Test
    void isValid_correctPlate_shouldReturnTrue() {
        assertTrue(PlateValidator.isValid("HA-AB 1234"));
        assertTrue(PlateValidator.isValid("XYZ-C 99"));
    }

    @Test
    void isValid_wrongLetterCount_shouldReturnFalse() {
        assertFalse(PlateValidator.isValid("A-BCDE 1"));
    }

    @Test
    void isValid_wrongDigits_shouldReturnFalse() {
        assertFalse(PlateValidator.isValid("HA-AB 12345"));
    }

    @Test
    void isValid_null_shouldReturnFalse() {
        assertFalse(PlateValidator.isValid(null));
    }

    @Test
    void normalize_shouldFormatCorrectly() {
        assertEquals("HA-AB 1234", PlateNormalizer.normalize("ha-ab 1234"));
        assertEquals("XYZ-C 99", PlateNormalizer.normalize("xyz-c 99"));
    }

    @Test
    void getCityCode_shouldReturnCorrectCode() {
        assertEquals("HA", PlateService.getCityCode("HA-AB 1234"));
    }

    @Test
    void maskPlate_shouldMaskCorrectly() {
        assertEquals("HA- **", PlateService.maskPlate("HA-AB 1234"));
    }

    @Test
    void extractAllPlates_shouldReturnAllValidPlates() {
        List<String> plates = PlateService.extractAllPlates(
                "Text HA-AB 1234 and XYZ-C 99 and wrong 123"
        );

        assertEquals(2, plates.size());
        assertTrue(plates.contains("HA-AB 1234"));
        assertTrue(plates.contains("XYZ-C 99"));
    }
}
