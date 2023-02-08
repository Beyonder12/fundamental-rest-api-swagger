package com.beyonder.fundamentalrestapiswagger.dto;

import java.util.List;

public class DataBookDTO {
    private String institution;
    private List<BookDTO> books;

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }
}
