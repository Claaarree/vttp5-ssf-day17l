package sg.edu.nus.iss.vttp5a_ssf_day17l.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Joke {
    
    @NotBlank(message = "Please select an appropriate genre!")
    private String type;
    
    @NotBlank(message = "Please input an appropriate setup for the joke!")
    private String setup;
    
    @NotBlank(message = "Please input an appropriate punchline for the joke!")
    private String punchline;

    @Min(value = 1, message = "The ID number cannot be less than 1!")
    private Integer id;

    public Joke() {
    }

    public Joke(String type, String setup, String punchline, Integer id) {
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return type + "," + setup + "," + punchline + "," + id;
    }

    
}
