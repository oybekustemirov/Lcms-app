package com.example.lcmsapp.entity;

import com.example.lcmsapp.entity.template.AbsNameEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "groups")
@Getter
@Setter
@ToString
@Builder
public class Group extends AbsNameEntity {
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Course course;

    @ManyToOne
    private Filial filial;


}
