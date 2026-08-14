package com.dermavisionai.database;

public final class DatabaseConfig {
    private DatabaseConfig() {
    }

    public static String url() {
        return getenv("DERMAVISION_DB_URL", "jdbc:mysql://localhost:3306/dermavision_ai");
    }

    public static String user() {
        return getenv("DERMAVISION_DB_USER", "root");
    }

    public static String password() {
        return getenv("DERMAVISION_DB_PASSWORD", "");
    }

    private static String getenv(String key, String fallback) {
        String value = System.getenv(key);
        return value == null || value.isBlank() ? fallback : value;
    }
}
