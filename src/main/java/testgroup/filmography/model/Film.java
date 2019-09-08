package testgroup.filmography.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;
}
