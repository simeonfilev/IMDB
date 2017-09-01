package imdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    private Integer id;
    private String name;
    private String director;
    private String genre;
    private Integer year;

    public Film(){

    }

    public Film( String name, String director, String genre, Integer year) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
