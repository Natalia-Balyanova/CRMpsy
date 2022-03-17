package ru.gb.CRMpsy.dtos;

import ru.gb.CRMpsy.entities.Problem;
import ru.gb.CRMpsy.entities.Psychologies;

import javax.persistence.*;
import java.util.List;

public class ProblemDto {
    private Long id;
    private String title;
    private List<PsychologiesDto> psychologies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<PsychologiesDto> getPsychologies() {
        return psychologies;
    }

    public void setPsychologies(List<PsychologiesDto> psychologies) {
        this.psychologies = psychologies;
    }

    public ProblemDto() { }

    public ProblemDto(Long id, String title, List<PsychologiesDto> psychologies) {
        this.id = id;
        this.title = title;
        this.psychologies = psychologies;
    }
}
