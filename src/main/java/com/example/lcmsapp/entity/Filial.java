package com.example.lcmsapp.entity;

import com.example.lcmsapp.entity.template.AbsNameEntity;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Builder
public class Filial extends AbsNameEntity {

    //xodimlar soni
    @OneToMany(mappedBy = "filial", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Staff> staffList;

    // o'quvchilar soni
    @OneToMany(mappedBy = "filial", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Group> groups;

}
