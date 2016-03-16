package net.moznion.medialahan;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MedialahanTest {
    @Test
    public void shouldGetExtensionByContentType() {
        Optional<String> ext;

        ext = Medialahan.GetExtensionByContentType("image/jpeg");
        assertEquals("jpeg", ext.get());

        ext = Medialahan.GetExtensionByContentType("invalid/invalid");
        assertEquals(Optional.empty(), ext);
    }

    @Test
    public void shouldGetContentTypeByExtension() {
        Optional<String> contentType;

        contentType = Medialahan.GetContentTypeByExtension("jpeg");
        assertEquals("image/jpeg", contentType.get());

        contentType = Medialahan.GetContentTypeByExtension("jpg");
        assertEquals("image/jpeg", contentType.get());

        contentType = Medialahan.GetContentTypeByExtension("invalid-invalid");
        assertEquals(Optional.empty(), contentType);
    }
}
