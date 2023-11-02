package com.example.notes.filter;

/**
 * Перечислить возможные фильтрации заметок по признаку выполнения (done).
 */
public enum DoneFilterOption {
    ALL("All"),
    PLAN("Plan"),
    DONE("Done");

    private String description;

    DoneFilterOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
