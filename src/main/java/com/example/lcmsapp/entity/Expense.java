package com.example.lcmsapp.entity;

import com.example.lcmsapp.entity.enums.ExpenseType;
import com.example.lcmsapp.entity.enums.PayType;
import com.example.lcmsapp.entity.template.AbsEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Getter
@Setter
@Builder
public class Expense extends AbsEntity {

    // nomi
    private String description;
    @Enumerated
    private ExpenseType expenseType;

    @ManyToOne
    private Filial filial;
    private Double amount;

    @Enumerated
    private PayType payType;


}
