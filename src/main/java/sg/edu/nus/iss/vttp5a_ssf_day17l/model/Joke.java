package sg.edu.nus.iss.vttp5a_ssf_day17l.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Joke {
    
    @NotBlank(message = "Please select an appropriate genre!")
    private String genre;
    
    @NotBlank(message = "Please input an appropriate setup for the joke!")
    private String setup;
    
    @NotBlank(message = "Please input an appropriate punchline for the joke!")
    private String punchline;

    @Min(value = 1, message = "The ID number cannot be less than 1!")
    private Integer id;

    public Joke() {
    }

    public Joke(@NotBlank(message = "Please select an appropriate genre!") String genre,
            @NotBlank(message = "Please input an appropriate setup for the joke!") String setup,
            @NotBlank(message = "Please input an appropriate punchline for the joke!") String punchline,
            @Min(value = 0, message = "The ID number cannot be less than 0!") Integer id) {
        this.genre = genre;
        this.setup = setup;
        this.punchline = punchline;
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return genre + "," + setup + "," + punchline + "," + id;
    }

    
}
