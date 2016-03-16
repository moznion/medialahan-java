package net.moznion.medialahan;

import java.util.Optional;

public class Medialahan {
    public static Optional<String> GetExtensionByContentType(final String contentType) {
        return Optional.ofNullable(TypeMap.CONTENT_TYPE_TO_EXT.get(contentType));
    }

    public static Optional<String> GetContentTypeByExtension(final String extension) {
        return Optional.ofNullable(TypeMap.EXT_TO_CONTENT_TYPE.get(extension));
    }
}
